package application;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscrevendoArquivo {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good Afternoon,Good night" };

		String path = "C:\\Users\\WINDOWS 11\\Desktop\\test.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){//se adicionar path,true ele acrescenta, se retirar o true ele faz um novo
			 for(String line : lines) {
				bw.write(line);
				bw.newLine();
			 }
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
