package com.sneha;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Writer {
    private final int number ;
    public Writer(int a) throws FileNotFoundException {
        number = a;
        create();
    }

    private void create() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("D:\\projects\\sid.csv");
        PrintWriter pw = new PrintWriter(fos);
        pw.println("Date and Time, Torque, Load Cell");
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        sb.append(dtf.format(now));
        sb.append(',');
        sb.append(number);
        sb.append('\n');
        pw.write(sb.toString());
        pw.close();
        System.out.println("File created");
    }
    private void write(){

    }
}
