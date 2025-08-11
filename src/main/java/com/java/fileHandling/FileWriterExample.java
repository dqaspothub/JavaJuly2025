package com.java.fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt"); // overwrite mode
            fw.write("Hello, this is a FileWriter example!\n");
            fw.write("Writing more text to the file.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }}
