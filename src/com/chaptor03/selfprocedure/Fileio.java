package com.chaptor03.selfprocedure;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Fileio {
    static File file = new File("File1.txt");
    public static void main(String[] args) throws IOException {
        file.createNewFile();
        Scanner scanner = new Scanner(file);
        PrintWriter printWriter = new PrintWriter(file,"UTF-8");

        printWriter.append("jjf");
        printWriter.append("\n");
        printWriter.append("zem");
        printWriter.append("123456");
        printWriter.print(printWriter.toString());
        printWriter.println();
        printWriter.write("jjfzx");
    }
}
