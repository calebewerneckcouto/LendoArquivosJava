package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		
		File file = new File("C:\\Users\\WINDOWS 11\\Desktop\\test.txt");
		
		Scanner sc = null;
		
		try {
		
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sc != null) {
				sc.close();
			}
			
		}
		
		
		

	}

}
