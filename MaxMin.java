package Firstweek;

public class MaxMin {
      public static void main(String arg[]) {
    	  int a[]= {34,5,78,42,34,57,90};
    	  int max=Integer.MIN_VALUE;
    	  for(int i=0;i<a.length;i++) {
    		  if(a[i]>max) {
    			  max=a[i];
    		  }
    	  }
    	  System.out.println("the maximum number is"+max);
    	  int min =Integer.MAX_VALUE;
    	  for(int i=0;i<a.length;i++) {
    		  if(a[i]<min) {
    			  min=a[i];
    		  }
    	  }
    	  System.out.println("the minimum number is"+min);
      }
}
