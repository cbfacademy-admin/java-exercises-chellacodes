package com.cbfacademy;

import java.io.*;

public class FileReaderExample {

public static void main (String[] args) {

// file path defined 
String filePath = "exercises/input-output/src/main/resources/exercise.txt";
String newfilePath = "exercises/input-output/src/main/resources/copiedexercise.txt"; 


// The try block ensures that the resources file readers and writers are automatically closed when they are no longer needed.

try (FileReader fileReader = new FileReader(filePath); 
    BufferedReader bufferedReader = new BufferedReader(fileReader);
    FileWriter fileWriter = new FileWriter(newfilePath);
    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

/* Inside the try block the programe reads line from the input file using a BufferredReader. 
Then it writes the line to the output file using a BufferedWriter. the newLine() method is 
used to add a newline character after each line in the output line */   

String line;
while ((line = bufferedReader.readLine()) != null) {
    bufferedWriter.write(line);
    bufferedWriter.newLine();
}

System.out.println(line);}

/* In case any IOException occurs during file operations, it will be caught and the exception 
 * details will be printed
 */



catch (IOException e) {
    e.printStackTrace();
}
}
}





