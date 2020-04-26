package com.vardaan.general;

import java.util.Scanner;

public class ReverseInteger
{

    public static void main (String args[]) {
        System.out.println("Enter an integer to reverse");
       
        Scanner s =  new Scanner(System.in);
        Integer num =  s.nextInt();
        
       
        System.out.println("reverse number = " +  reverseInteger(num));
        s.close();
    }
    
    
  public static int reverseInteger(Integer num) {
   boolean flag = false;
        
        if (num < 0 ) {
           num = -1* num; 
           flag =true;
        }
              
        Integer revNum = 0;
       
        while(num > 0) {
            revNum = revNum * 10 + num %10;
            num = num/10;
        }
        
       return flag  ? -1 * revNum : revNum;
    }
}
