package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

	/*
	 * TODO Implement method that takes path to file as a parameter And copies whole
	 * contents of the file to the same location but with a new file name:
	 * <old_file_name>_backup e.g. if file is data.txt copy should be named
	 * data.txt_backup
	 */
	public void copyFile(String filePath) {

		File file = new File(filePath);
		File copy = new File(filePath + "_backup");
		ArrayList<String> text = new ArrayList<String>();
		try {
			BufferedReader in = new BufferedReader(new FileReader(file));
			String s = in.readLine();
			while (s != null) {
				text.add(s);
				s = in.readLine();
			}
			in.close(); // close reader
		} catch (IOException e) {
			e.printStackTrace(); // handle exceptions
		}
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(copy));
			for (String i : text) {
				pw.println(i);
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new FileCopy().copyFile("test.txt");
	}
}