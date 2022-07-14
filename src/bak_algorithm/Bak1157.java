package bak_algorithm;

import java.util.Scanner;

public class Bak1157 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] abcSize = new int[26];
		String input = scan.next();
		
		for(int i=0; i < input.length(); i++) {
			
			if('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
				abcSize[input.charAt(i) - 'A']++;
			}else {
				abcSize[input.charAt(i) - 'a']++;
			}
		}
		
		int maxNum = -1;
		char chr = '?';
		
		for(int i=0; i<26; i++) {
			
			if(abcSize[i] > maxNum) {
				maxNum = abcSize[i];
				chr = (char)(i + 65);
			}else if(abcSize[i] == maxNum){
				chr = '?';
			}
		}
	
		System.out.println(chr);
		
	}
	

}
