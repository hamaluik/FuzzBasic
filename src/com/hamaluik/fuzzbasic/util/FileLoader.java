package com.hamaluik.fuzzbasic.util;

import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

public class FileLoader {
	private FileLoader(){}

	public static ArrayList<String> loadFile(String name) {
		// our return array
		ArrayList<String> lines = new ArrayList<String>();

		try {
			// open the file
			BufferedReader file =  new BufferedReader(new FileReader(name));

			// now loop through the lines
			// and add them!
			String line = null;
			while((line = file.readLine()) != null) {
				lines.add(line.trim());
			}

			file.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		// and we're done
		return lines;
	}
}
