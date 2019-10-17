package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Word_Frequency {

	public static void main(String[] args) {
		Hashtable<String,Integer> table = new Hashtable<String, Integer>();
		File file = new File("/Users/sachin/Desktop/data.txt");
		String word;
		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				word=sc.next().toLowerCase();
				//System.out.println(sc.next());
				if(!table.containsKey(word))	{
					table.put(word, 1);
				}
				else {
					Integer count=table.get(word);
					table.put(word, count+1);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Enter the word:");
		Scanner scn = new Scanner(System.in);
		String key = scn.next();
		System.out.println("frequency of "+key+" word in file data.txt is "+table.get(key));
		/*if(!table.isEmpty()) {
			for(Entry entry: table.entrySet()) {
				System.out.println(entry.getKey()+" \t "+entry.getValue());
			}
		}*/
	}
}
