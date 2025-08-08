package com.day11.filehandling;
import java.io.*;



public class Write_File {
    public static void main(String[] args) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter("example.txt", true)); //true-content is added at the end of the file
            writer.write("Hello Everyone this is example.txt file!  ");           //false-file is cleared before writing
            writer.newLine();
            System.out.println("Successfully Written to file!!");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            try {
                if (writer != null)
                    writer.close();
            } catch (IOException e) {
                System.out.println("Error while closing the writer: " + e.getMessage());
            }
        }
    }
}

