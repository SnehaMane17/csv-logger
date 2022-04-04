package com.sneha;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public int printNumber(int a){
        return a;
    }
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\projects\\sid.csv");
        PrintWriter pw = new PrintWriter(fos);
        Main obj = new Main();
        pw.println(obj.printNumber(10));
        pw.close();
        System.out.println("File created");

//        obj.printNumber(6);
    }
}
