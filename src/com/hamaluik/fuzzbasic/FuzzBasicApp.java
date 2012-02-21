package com.hamaluik.fuzzbasic;

import java.util.ArrayList;

import com.hamaluik.fuzzbasic.util.FileLoader;

class FuzzBasicApp {
	public static void main(String[] args) {
		System.out.println("Loading script 'test.fb'...");
		ArrayList<String> lines = FileLoader.loadFile("test.fb");
		for(int i = 0; i < lines.size(); i++) {
			System.out.println(lines.get(i));
		}
	}
}
