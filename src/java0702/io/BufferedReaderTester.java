package java0702.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTester {
	public static void main(String[] args) throws IOException {
		String fileName = "E:\\Ñ¸À×ÏÂÔØ\\newpad.txt";
		String line;
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		line = in.readLine();
		while(line!=null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
	}
}
