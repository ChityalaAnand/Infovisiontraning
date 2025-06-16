package com.day6;
import java.io.*;
import java.util.Arrays;
import java.util.Date; 

public class FileHandlingExample {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\chityala.anand\\Desktop\\FileHandlingPracticeYouCanDelete\\PracticeForFileHandling.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("Successfully File Got created !");
		}else {
			System.out.println("File Already Exists!");
		}
		
		FileInputStream fis = new FileInputStream(file);
		System.out.println(fis.read());
		
		
	}
}

/*package com.day6;

import java.io.*;

import java.nio.file.*;
 
public class FileHandlingExample {
 
    public static void main(String[] args) {

        String fileName = "sample.txt";
 
        // 1. Create a File

        createFile(fileName);
 
        // 2. Write to the File

        writeToFile(fileName, "Hello, this is a file handling example using FileOutputStream.");
 
        // 3. Read from the File

        readFromFile(fileName);
 
        // 4. Delete the File

        deleteFile(fileName);

    }
 
    // Method to create a file

    public static void createFile(String fileName) {

        try {

            File file = new File(fileName);

            if (file.createNewFile()) {

                System.out.println("File created successfully: " + file.getName());

            } else {

                System.out.println("File already exists.");

            }

        } catch (IOException e) {

            System.out.println("Error while creating file.");

            e.printStackTrace();

        }

    }
 
    // Method to write using FileOutputStream

    public static void writeToFile(String fileName, String content) {

        try (FileOutputStream fos = new FileOutputStream(fileName)) {

            byte[] bytes = content.getBytes();

            fos.write(bytes);

            System.out.println("Data written to file.");

        } catch (IOException e) {

            System.out.println("Error while writing to file.");

            e.printStackTrace();

        }

    }
 
    // Method to read using FileInputStream

    public static void readFromFile(String fileName) {

        try (FileInputStream fis = new FileInputStream(fileName)) {

            System.out.println("Reading from file:");

            int i;

            while ((i = fis.read()) != -1) {

                System.out.print((char) i);

            }

            System.out.println();

        } catch (IOException e) {

            System.out.println("Error while reading from file.");

            e.printStackTrace();

        }

    }
 
    // Method to delete file

    public static void deleteFile(String fileName) {

        try {

            Files.deleteIfExists(Paths.get(fileName));

            System.out.println("File deleted successfully.");

        } catch (IOException e) {

            System.out.println("Error while deleting file.");

            e.printStackTrace();

        }

    }

}

 
package com.day6;
 
import java.io.*;

import java.nio.file.*;
 
public class FileHandlingWithReaderWriter {
 
    public static void main(String[] args) {

        String fileName = "demo.txt";
 
        // 1. Create File

        createFile(fileName);
 
        // 2. Write to File

        writeToFile(fileName, "This is an example using FileWriter and FileReader in Java.");
 
        // 3. Read from File

        readFromFile(fileName);
 
        // 4. Delete File

        deleteFile(fileName);

    }
 
    // Method to create a new file

    public static void createFile(String fileName) {

        try {

            File file = new File(fileName);

            if (file.createNewFile()) {

                System.out.println("File created: " + fileName);

            } else {

                System.out.println("File already exists.");

            }

        } catch (IOException e) {

            System.out.println("An error occurred while creating the file.");

            e.printStackTrace();

        }

    }
 
    // Method to write to the file using FileWriter

    public static void writeToFile(String fileName, String content) {

        try (FileWriter writer = new FileWriter(fileName)) {

            writer.write(content);

            System.out.println("Successfully written to the file.");

        } catch (IOException e) {

            System.out.println("An error occurred while writing to the file.");

            e.printStackTrace();

        }

    }
 
    // Method to read from the file using FileReader

    public static void readFromFile(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {

            System.out.println("Reading from file:");

            int ch;

            while ((ch = reader.read()) != -1) {

                System.out.print((char) ch);

            }

            System.out.println(); // New line after file content

        } catch (IOException e) {

            System.out.println("An error occurred while reading the file.");

            e.printStackTrace();

        }

    }
 
    // Method to delete the file

    public static void deleteFile(String fileName) {

        try {

            Files.deleteIfExists(Paths.get(fileName));

            System.out.println("File deleted successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred while deleting the file.");

            e.printStackTrace();

        }

    }

}*/

 