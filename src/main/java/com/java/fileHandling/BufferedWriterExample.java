package com.java.fileHandling;

import java.io.*;

public class BufferedWriterExample {
    public static void main(String[] args) {

        String filePath = "output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 1; i <= 100000; i++) {
                bw.write("This is line " + i);
                bw.newLine(); // writes a line break
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("File writing completed!");
    }
}
