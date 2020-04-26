package com.vardaan.backtracking;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SkiingProblem
{
    private static int[][] mountain; // 

    public static void main (String args[]) {       
       /* int [][] mountain = {
            {4,8,7,3},
            {2,5,9,3},
            {6,3,2,5},
            {4,4,1,6}
        };*/
        
        
       // int [][] mountain = new int[1000][1000];
        String fileName= "D:\\cis\\micro\\dev\\dev_micro_space\\Algos\\src\\com\\vardaan\\backtracking\\SkiingInSingaporeMapData.txt";
       try
    {
        mountain =  loadData(fileName);
    }
    catch (Exception e1)
    {
        // TODO Auto-generated catch block
        e1.printStackTrace();
    }
        
       /* 
        for(int x=0; x<1000 ; x++) {
            for (int y=0 ; y<1000; y++) {
                mountain[x][y] =  (new Random().nextInt(1499) + 1) ; 
                if (mountain[x][y] == 1500 ||  mountain[x][y]==0 ) System.out.println("uppper brached");
            }
        }*/
       
        
        
       /* for(int x=0; x<1000 ; x++) {
            for (int y=0 ; y<1000; y++) {
               System.out.print(mountain[x][y] + " ") ; 
            }
            System.out.println();
        }*/
      
        List trace=  startTrack(mountain) ;
        trace.forEach(e -> System.out.print(" ->" + e));
         
    }

    private static List startTrack( int[][] mountain)
    {          
        
        
        List finalList =  new ArrayList();
            for (int i=0; i<1000 ;i++) {
                for(int  j=0 ;  j<1000 ; j++) {
                    List interimList =  new ArrayList();
                    interimList.add(mountain[i][j]);
                    if (checkTrail(interimList, mountain, i, j).size() >= finalList.size() ) {
                        System.out.println("Interim  list at "+ i + " "+ j + " = " + interimList.size()  +" "+ interimList);
                          System.out.println(((int)interimList.get(interimList.size() -1) - (int)interimList.get(0) ));
                                     
                            finalList = interimList;                        
                    }
                }
            }
            
          return finalList;       
        
        
    }

    private static List checkTrail(List interim, int[][] grid, int i, int j)
    {
        
     
      
       List left = checkLeft(new ArrayList(), grid,i,j);     
       List right = checkRight(new ArrayList(), grid,i,j);
       List  up = checkup(new ArrayList(), grid,i,j);
       List down = checkDown(new ArrayList(), grid,i,j);
       
       List biggest = left;
       if (biggest.size() < right.size()) {
           biggest = right;
       }
       if (biggest.size() < down.size()) {
           biggest =down;
       }
       if (biggest.size() < up.size()) {
           biggest = up;
       }
       
      // System.out.println("biggest " + biggest);
       interim.addAll(biggest);
     
       
       return interim;
       
       
       
      
    }
    
    
    private static List checkLeft(List interim, int[][] grid, int i, int j) {
        if (j-1>=0 && grid[i][j-1] < grid[i][j] ) {
            interim.add(grid[i][j-1]);
            return  checkTrail(interim, grid, i, j-1);                       
         }else 
             return interim;
    }
    
    
    private static List checkRight(List interim, int[][] grid, int i, int j) {
        if(j+1<1000 && grid[i][j+1] < grid[i][j] ){
            interim.add(grid[i][j+1]);
            return  checkTrail(interim, grid, i, j+1);
        }else 
            return interim;
    }
    
    
    
    private static List checkup(List interim, int[][] grid, int i, int j) {

        
        if(i-1>=0 && grid[i-1][j] < grid[i][j] ){
            interim.add(grid[i-1][j]);
            return  checkTrail(interim, grid, i-1, j);
        }  
        else 
            return interim;
    }
    
    
    
    private static List checkDown(List interim, int[][] grid, int i, int j) {
        if(i+1 <1000 && grid[i+1][j] < grid[i][j] ){
            interim.add(grid[i+1][j]);
            return  checkTrail(interim, grid, i+1, j);
        }else 
            return interim;
    }
    
    
    
    
    
 // load data from the txt file
    public static int[][] loadData(String fileName) throws Exception {
        int[][] mountain = null;
        File file = new File(fileName);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String lineTxt;
        if ((lineTxt = br.readLine()) != null) {
            String[] str = lineTxt.split(" ");
            // the first integer of first line is the row number of the matrix
            int row = Integer.parseInt(str[0]);
            // the second integer of first line is the column number of the matrix
          int    column = Integer.parseInt(str[1]);
            mountain = new int[row][column];
           
        }
        int i = 0;
        // the following 1000 lines are the 1000 integers of each line of the matrix
        while ((lineTxt = br.readLine()) != null) {
            int j = 0;
            String[] str = lineTxt.split(" ");
            for (String s : str) {
                mountain[i][j++] = Integer.parseInt(s);
            }
            i++;
        }
        br.close();
        
        
        return mountain;
    }
   
    
}
