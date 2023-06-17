package com.kh.practice.token.controller;

import java.util.StringTokenizer;

import java.util.StringTokenizer;

public class TokenController {
	
    public String afterToken(String str) {
    	
        StringTokenizer stn = new StringTokenizer(str, " ");
        String result = "";
        while (stn.hasMoreTokens()) {
            result += stn.nextToken();
        }
        return result;
        
    }


    public String firstCap(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    
    public int findChar(String input, char one) {
        int count = 0;
        for (char ch : input.toCharArray()) {
            if (ch == one) {
                count++;
            }
        }
        return count;
    }
    
    
    
}