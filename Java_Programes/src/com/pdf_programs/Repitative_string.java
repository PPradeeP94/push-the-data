package com.pdf_programs;

import java.util.HashMap;
import java.util.Map;

public class Repitative_string {

	public static void main(String[] args) {

		String x = "Welcome to java to world";

		Map<String, Integer> mp = new HashMap<String, Integer>();
		String[] split = x.split(" ");

		for (String c : split) {
			if (mp.containsKey(c)) {
				Integer inter = mp.get(c);
				mp.put(c, inter + 1);
			} else {
				mp.put(c, 1);
			}
		}
		System.out.println(mp);
	}

}
