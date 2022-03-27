package com.sneha;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\projects\\sid.csv");
        PrintWriter pw = new PrintWriter(fos);
        pw.println("Value,Date,Time");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Value");
            int value = sc.nextInt();
            System.out.println("This is Value: " + value );

            System.out.println("Enter Date");
            String date = sc.next();
            System.out.println("This is Date: " + date );

            System.out.println("Enter Time");
            String time = sc.next();
            System.out.println("This is Time: " + time );

            if (value==0){
                break;
            }

            pw.println(value + "," + date + "," + time);

        }



    }
}
