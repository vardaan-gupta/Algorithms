package com.vardaan.general;

import java.util.Scanner;

public class ReverseAString
{

    public static void main(String args[]) {
        String inputString = new Scanner(System.in).nextLine();
        
        System.out.println("input ========== "+ inputString);
        char[]  s =  inputString.toCharArray();
        
        for( int i =0, j=s.length -1; i<j; i++ ,j--) {
            char temp  = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        
        System.out.println("reversed  ======= "+ new String(s));
        
    }
}
