package com.collection.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapExample
{
	public static void main(String[] args)
	{
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		System.out.println("put() method is used to store the elements in map....");
		System.out.println("and which contains two generics 1 is key and 2 is value");
		tm.put(1, "subbarao");
		tm.put(2, "lakshmi");
		tm.put(3, "mahi");
		tm.put(4, "satya");
		System.out.println(tm);
		System.out.println("===============================");
		tm.putIfAbsent(3, "mahi");
		System.out.println(tm);
		tm.putIfAbsent(3, "satya");
		System.out.println("putifabsence method is used to store the key if its present it will "
				+ "not override else override the map......");
		System.out.println(tm);
		tm.putIfAbsent(5, "devi");
		System.out.println(tm);
		System.out.println("=================================");
		System.out.println("celling Entry is used to get the value and key by using key value...");
		System.out.println(tm.ceilingEntry(5));
		System.out.println(tm);
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>();
		System.out.println("====================================");
		System.out.println("descendingKeySet() method will create an object call navigableset interface and"
				+ "it stored the key values in descending order....... ");
		
		NavigableSet<Integer> tm2=tm.descendingKeySet();
		System.out.println(tm2);
		System.out.println("========================");
		System.out.println("tm.lastEntry() method will returns last entry of an map");
		System.out.println(tm.lastEntry());
		System.out.println("containsKey() method is used check the key is presnt inside tthe map or not");
		System.out.println(tm.containsKey(4));
		
		
		
		
	}
	
	

}
