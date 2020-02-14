package jtm.activity10;

import java.io.*;

public class Echo {
	public static void main(String[] args) throws IOException {
		File myFile = new File("test.txt");
		System.out.println(myFile.createNewFile());
		// An empty line or Ctrl-Z terminates the program
	}
}