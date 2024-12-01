package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args) {
    	
    	
    	//BufferdReader e Reader
        
        String path = "C:\\Users\\WINDOWS 11\\Desktop\\test.txt";

        try (FileReader fr = new FileReader(path); 
             BufferedReader bf = new BufferedReader(fr)) {
            
            String line = bf.readLine();
            while (line != null) {
                System.out.println(line);
                line = bf.readLine();
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
