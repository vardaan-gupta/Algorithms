package com.vardaan.general;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams
{

    
    public static void main (String args[]) {
         Scanner s  = new Scanner(System.in);
         String input1  =  s.nextLine();
         String input2 =  s.nextLine();
         System.out.println("inputs "+ input1 + " "+ input2);
         char[] inputarray1 =  input1.toCharArray();
         char[] inputarray2 =  input2.toCharArray();
         
         Arrays.sort(inputarray1);
         Arrays.sort(inputarray2);
         
         
       String result =  Arrays.equals(inputarray1, inputarray2) ? "YES Anagrams": 
            "NOT anagrams";
         
         System.out.println(result);
    }
}
