package com.sneha;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	  FileOutputStream fos = new FileOutputStream("D:\\projects\\sneha.csv");
      PrintWriter pw = new PrintWriter(fos);
      Scanner input = new Scanner(System.in);
      pw.println("Value,Date,Time");


      System.out.println("Enter Value");
      int value = input.nextInt();
      System.out.println("Enter Date");
      String date = input.next();
      System.out.println("Enter Time");
      String time = input.next();
      input.close();

      pw.println(value + "," + date + "," + time);

      pw.close();

      System.out.println("File created");

    }
}
