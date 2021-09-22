package Firstweek;

import java.util.Scanner;

public class Pattern1 {
       public static void main(String arg[]) {
    	   int i,j;
    	   System.out.println("enter the number");
    	   Scanner Scan = new Scanner(System.in);
    	   int a = Scan.nextInt();
    	   for(i=0;i<a;i++) {
    		   for(j=0;j<=i;j++) {
    			   System.out.print(" * ");
    		   }
    		   System.out.println();
    	   }
    	   Scan.close();
       }
}
