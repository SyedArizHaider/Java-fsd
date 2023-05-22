package com.pack1;
	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Paths;
	import java.util.List;
	public class FileHandling {
	    public static void main(String[] args) {
	        try {
	            // Creating a file
	            File file = new File("example.txt");
	            boolean created = file.createNewFile();
	            System.out.println("File created: " + created);

	            // Writing to the file
	            Files.write(Paths.get("example.txt"), "Hello, world!".getBytes());

	            // Reading from the file
	            List<String> lines = Files.readAllLines(Paths.get("example.txt"));
	            for (String line : lines) {
	                System.out.println(line);
	            }

	            // Updating the file
	            Files.write(Paths.get("example.txt"), "Hello, Java!".getBytes());

	            // Reading from the file again
	            lines = Files.readAllLines(Paths.get("example.txt"));
	            for (String line : lines) {
	                System.out.println(line);
	            }

	            // Deleting the file
	            boolean deleted = file.delete();
	            System.out.println("File deleted: " + deleted);

	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
