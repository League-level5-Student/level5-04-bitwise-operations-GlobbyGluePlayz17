import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CodingExamB {
	
	public static void main(String[] args) {
		/*
		 * Write a java program that asks the user to enter a file name.
		 * If the file can be opened, print the contents of the file in reverse. (last line first, first line last)
		 * If the file cannot be opened, let the user know and allow them to enter a new file.
		 * 
		 */
		CodingExamB b = new CodingExamB();
		System.out.println(b.FileReadingButReversed());
	}
	
	public ArrayList<String> FileReadingButReversed() {
		ArrayList<String> contents = new ArrayList<String>();

		String loc = JOptionPane.showInputDialog("Enter in a file location."); //C:\Users\Rachel Yang\Desktop\Programming\Level5-Practice_Coding_Exam\src\testfile
		try {
			BufferedReader br = new BufferedReader(new FileReader(loc));
			
			String line = br.readLine();
			while(line != null){
				contents.add(line);
				line = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "File location could not be found. Please enter a valid file location.");
			FileReadingButReversed();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		int length;
		if (contents.size()%0 != 0) {
			length = (int)(contents.size()/2)+1;
		} else {
			length = contents.size()/2;
		}
		
		for (int i = 0; i < length; i++) {
			String temp = contents.get(i);
			contents.get(i).equals(contents.get(contents.size()-i-1));
			contents.get(contents.size()-i-1).equals(temp);
		}
		
		return contents;
		
	}
}