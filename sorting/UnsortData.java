package sorting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UnsortData {

	public static void main(String[] args) {
		File file = new File ("/data/citiesSorted.txt");
		File f = scrambleStrings(file);
		System.out.println("check unsorted file for output");
	}
	
	public static File scrambleStrings(File file) {
		System.out.println("entered");
		List<String> strlist = new ArrayList<String>();
		boolean fileexist = false;
		File nfile = new File("/data/unsorted.txt");
		/*fileexist = nfile.exists();
		if(!fileexist ) { //if file doesn't exist, create one
			nfile = new File("/data/unsorted.txt");*/
			try {
				nfile.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		/*}
		else { //will delete and create the file again to get empty file
			if(nfile.delete()) {
				try {
					nfile.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}*/
		
		if(file.canRead()) {
			String str;
			BufferedReader read= null;
			try {
				read = new BufferedReader(new FileReader(file.getPath()));
				
				while((str = read.readLine()) != null) {
					strlist.add(str);
				}
			} catch (FileNotFoundException e) {
				System.out.println("file was not found for reading (path may be incorrect)");
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(read!=null) {
						read.close();
					}
				} catch(IOException er) {
					er.printStackTrace();
				}
			}
			//shuffle strings in list
			int siz= strlist.size();
			for(int i = 0; i < siz/2; i++) {
				Random ran= new Random();
				int indOne=ran.nextInt(siz);
				int indTwo = siz - indOne;
				swap(strlist,indOne,indTwo);
			}
			System.out.println("shuffled elements list : ");
			for(int j = 0; j < siz+1; j++) {
				System.out.print("  " +strlist.get(j));
			}
		}
		
		if(nfile.canWrite() && nfile.exists() && strlist.size()>0) {
			BufferedWriter wr = null;
			try {
				wr= new BufferedWriter(new FileWriter(nfile.getAbsoluteFile()));
				
				for(int i = 0; i < strlist.size() ; i++) {
					wr.write(strlist.get(i));
					wr.newLine();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(wr!=null) {
						wr.close();
					}
				} catch(IOException er) {
					er.printStackTrace();
				}
			}
		}
		
		return nfile;
	}
	
	public static void swap(List<String> strlist, int one, int two) {
		String temp= "";
		temp = (String) strlist.get(one);
		strlist.set(one, (String)strlist.get(two));
		strlist.set(two, temp);
	}

}
