package com.doublezi.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 
 * </br>
 * *********************
 * </br>
 * 作者：隔壁老王(ಥ _ ಥ) 21岁
 * </br>          
 * *********************
 * </br>
 * 日期：2017年12月27日
 * </br>                
 * *********************
 * </br>
 * 时间：下午4:51:57        
 * </br>        
 * *********************
 * </br>
 * 题目编号：io-exercise-07
 */
public class Exercise_07 {
	public static void main(String[] args) throws IOException {
		//.亟待打开的文件
		String filename="E:\\HibernateDemo\\TIJ4th_homework\\dir\\TextFile.java";
		//.为亟待打开的文件创建 Reader流
		FileReader fileReader = new FileReader(filename);
		//.提高效率：将fileReader对象包装到BufferedReader中
		BufferedReader br = new BufferedReader(fileReader);
		//.创建字符串接受读取的每一行数据
		String s;
		//.创建按行存放数据的LinkedList
		LinkedList<String> list = new LinkedList<>();
		//.读取文件内容
		while((s=br.readLine())!=null) {
			list.add(s);
		}
		//.关闭流
		br.close();
		//.输出list大小
		System.err.println("LIST SIZE:"+list.size());
		//.为list创建迭代器
		ListIterator<String> listIterator = list.listIterator(list.size());
		//.使用hasPrevious()和previous()实现反向输出
		while(listIterator.hasPrevious()) {
			System.err.println(":) "+listIterator.previous());
		}
	}
}
//以下是输出内容

//LIST SIZE:82
//:) *///:~
//:) [0, ArrayList, Arrays, Break, BufferedReader, BufferedWriter, Clean, Display, File, FileReader, FileWriter, IOException, Normally, Output, PrintWriter, Read, Regular, RuntimeException, Simple, Static, String, StringBuilder, System, TextFile, Tools, TreeSet, W, Write]
//:) } /* Output:
//:)   }
//:)     System.out.println(words.headSet("a"));
//:)     // Display the capitalized words:
//:)       new TextFile("TextFile.java", "\\W+"));
//:)     TreeSet<String> words = new TreeSet<String>(
//:)     // Break into unique sorted list of words:
//:)     text.write("test2.txt");
//:)     TextFile text = new TextFile("test.txt");
//:)     write("test.txt", file);
//:)     String file = read("TextFile.java");
//:)   public static void main(String[] args) {
//:)   // Simple test:
//:)   }
//:)     }
//:)       throw new RuntimeException(e);
//:)     } catch(IOException e) {
//:)       }
//:)         out.close();
//:)       } finally {
//:)           out.println(item);
//:)         for(String item : this)
//:)       try {
//:)         new File(fileName).getAbsoluteFile());
//:)       PrintWriter out = new PrintWriter(
//:)     try {
//:)   public void write(String fileName) {
//:)   }
//:)     this(fileName, "\n");
//:)   public TextFile(String fileName) {
//:)   // Normally read by lines:
//:)   }
//:)     if(get(0).equals("")) remove(0);
//:)     // String at the first position:
//:)     // Regular expression split() often leaves an empty
//:)     super(Arrays.asList(read(fileName).split(splitter)));
//:)   public TextFile(String fileName, String splitter) {
//:)   // Read a file, split by any regular expression:
//:)   }
//:)     }
//:)       throw new RuntimeException(e);
//:)     } catch(IOException e) {
//:)       }
//:)         out.close();
//:)       } finally {
//:)         out.print(text);
//:)       try {
//:)         new File(fileName).getAbsoluteFile());
//:)       PrintWriter out = new PrintWriter(
//:)     try {
//:)   public static void write(String fileName, String text) {
//:)   // Write a single file in one method call:
//:)   }
//:)     return sb.toString();
//:)     }
//:)       throw new RuntimeException(e);
//:)     } catch(IOException e) {
//:)       }
//:)         in.close();
//:)       } finally {
//:)         }
//:)           sb.append("\n");
//:)           sb.append(s);
//:)         while((s = in.readLine()) != null) {
//:)         String s;
//:)       try {
//:)         new File(fileName).getAbsoluteFile()));
//:)       BufferedReader in= new BufferedReader(new FileReader(
//:)     try {
//:)     StringBuilder sb = new StringBuilder();
//:)   public static String read(String fileName) {
//:)   // Read a file as a single string:
//:) public class TextFile extends ArrayList<String> {
//:) 
//:) import java.util.*;
//:) import java.io.*;
//:) package net.mindview.util;
//:) // a single string, and treating a file as an ArrayList.
//:) // Static functions for reading and writing text files as
//:) //: net/mindview/util/TextFile.java


