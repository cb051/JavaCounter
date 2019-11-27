// simple java program that counts from 0 to 99
// Asssignment 1 - Paradigms
/*
  Author: Carter Buckner
  Course: CSCE 3193H | L. Streeter
  Last Updated: 3 Sep 2019 10:41 AM
*/

import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) throws Exception {
		PrintWriter out = System.console().writer();
		for(int i = 0; i < 100; i++) {
			out.println(i);
		}
	}
}
