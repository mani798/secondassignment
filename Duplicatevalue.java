package Firstweek;

public class Duplicatevalue {
      public static void main(String arg[]) {
    	  int a[] = {2,4,6,8,4,9};
    	  for(int i=0;i<a.length;i++) {
    		  for(int j=i+1;j<a.length;j++) {
    			  if (a[i]==a[j])
    				  System.out.println("the duplicate value is "+a[j]);
    		  }
    	  }
      }
}
