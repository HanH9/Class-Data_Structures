package lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("F:/HHH/数据结构2022/Lab/src/lab2/data.txt");
		Scanner scanner = new Scanner(file);
		ListArrayBased listArrayBased = new ListArrayBased(5);
		while(scanner.hasNext())
		{
			listArrayBased.add(scanner.next());
		}

		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
		
		
		listArrayBased.add(0,"egg");
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
		
		
		listArrayBased.remove(0);
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");

		
		listArrayBased.add(2,"egg");
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
		
		listArrayBased.remove(2);
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
		
		listArrayBased.add(4,"egg");
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
		
		
		listArrayBased.remove(4);
		for(int j = 0;j < listArrayBased.size();j++)
		{
			System.out.println(listArrayBased.get(j));
		}
		System.out.println("**********************");
	}
}
