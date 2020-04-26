package com.vardaan.general;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharactersInString{

    
    public static void main (String args[]) {
        Scanner s  =  new Scanner(System.in);
        String input  = s.nextLine();
        
        char[] first =  input.toCharArray();
        Arrays.sort(first);
        
        for (int i =0 ; i < first.length -1; i++) {
            if (first[i] == first[i+1]) {
                System.out.println(">>>>> CONTAINS DUPLICATE");
                break;
            }
        }
       
    }
}
