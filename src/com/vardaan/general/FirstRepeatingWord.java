package com.vardaan.general;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *  A sentence is formed by Words.
 *  This code finds the first word that repeats itself in a given sentence.
 *  Given: 
 *    In case sensitive String   Hard != hard.
 *  Delimiters : 
 *      
 *    
 * Example :
 *   "We do hard work because hard work really pays off"   
 *   
 *   
 * @author 
 *
 */
public class FirstRepeatingWord
{
     private static char[] delims =  {',' , '.' , ';', '-'};
     
     public static void main (String args[]) {
         Scanner s =  new Scanner(System.in);
         String sentence = s.nextLine();
         
        String[]  tokens = sentence.split(delims.toString());
        
        List<String> tokenList = Arrays.asList(tokens);
        tokenList.stream().forEach(System.out::println);
     }
     
    
}
