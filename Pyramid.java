package Firstweek;

public class Pyramid {
     public static void main(String arg[]) {
    	 int i,j,n=6;
    	 for(i=0;i<n;i++) {
    		 for(j=n-i;j>0;j--) {
    			 System.out.print(" ");
    		 }
    		 for(j=0;j<=i;j++) {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
     }
}
