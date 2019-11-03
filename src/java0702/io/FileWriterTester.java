package java0702.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTester {
	public static void main(String[] args) throws IOException {
		String fileName = "E:/mypad.txt";
//		FileWriter writer = new FileWriter(fileName);
		BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
		out.write("here it is");
		out.newLine();
		out.write("BufferedWriter ’Ê «Ã´ø·¡À");
		out.close();
	}
}
