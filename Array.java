package Firstweek;

public class Array {
       public static void main(String arg[]) {
    	   int a[] = {2,4,6,34,57,89};
    	   int num=34;
    	   boolean flag = false;
    	   int index = -1;
    	   for(int i=0;i<a.length;i++) {
    		   if(a[i]==num) {
    			   flag=true;
    		       index=i;
    		   }
    	   }
    	   if(flag==true)
    		   System.out.println("the number present at "+index);
    		   else
    			   System.out.println("the number is not present ");   
       }
}
