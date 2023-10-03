package com.cbfacademy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.ListIterator;
import java.util.List; 


public class ReverseFile {

    public static void main(String[] args) {
    
        String inputFileName = "exercises/input-output/src/main/resources/exercise.txt";
        String invertFileName = "exercises/input-output/src/main/resources/inverted.txt";
        invertFile(inputFileName, invertFileName);
    }

  

    public static void readFile(String fileName) {

        BufferedReader reader;

        try {

            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
        
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

            reader.close();            
        } catch (IOException e) {
            System.out.println("Read file failed: " + e.getMessage());
        }
    }

    

    public static void readFileNio(String filePath) {
        try (Stream<String> stream = Files.lines(Paths.get(filePath))) {
            stream.forEach(System.out::println); 
        } catch (IOException e) {
            System.out.println("NIO Read Files" + e.getMessage());
        }
    }
   
    public static void copyFile(String inputFileName, String outputFileName) {
        BufferedReader reader;
        BufferedWriter writer; 

        try {
        reader = new BufferedReader(new FileReader(inputFileName));
        writer = new BufferedWriter((new FileWriter(outputFileName)));
    
        int endOfFile = -1;
        int charRead = reader.read(); 

        while (charRead != endOfFile) {
            writer.write(charRead); 
            charRead = reader.read(); 
        }

        writer.close(); 
    } catch (IOException e) {
        System.out.println("Copy file failed: " + e.getMessage());
    }
    }

    public static void copyFileNIO (String inputFilePath, String outputFileName) {
        Path sourceFile = Paths.get(inputFilePath);
        Path targetFile = Paths.get(outputFileName);

        try {
            if (Files.notExists(targetFile)) {
                Files.copy(sourceFile, targetFile);
            } else {
                System.out.println("File already exists " + targetFile); 
            }
        } catch (IOException e) {
            System.out.println("NIO Copy Failed " + e.getMessage());
        }
    }
            
// the invertFile takes the path of the file we want to read and write from, creates path object and reverses all the items in that list of strings
        
    public static void invertFile(String inputFilePath, String outputFilePath){
        Path sourceFile = Paths.get(inputFilePath);
        Path targetFile = Paths.get(outputFilePath);

        try {
            List<String> lines = Files.readAllLines(sourceFile);
            Collections.reverse(lines);

            Path newfile = (Files.createFile(targetFile)); 
            Files.write(newfile, lines);


    } catch (IOException e) {
        System.out.println(e.getMessage()); 
    } 

}

}




   


