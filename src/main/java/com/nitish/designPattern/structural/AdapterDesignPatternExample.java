package com.nitish.designPattern.structural;

import java.io.FileNotFoundException;

public class AdapterDesignPatternExample {

	public static void main(String[] args) {
		System.out.println(show());
		System.out.println(showAgain());

	}

	static int show() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}

	static int showAgain() {
		try {
			throw new FileNotFoundException();
		} finally {
			return 2;
		}
	}

}
