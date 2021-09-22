package Firstweek;

public class Palindrome {
    public static void main(String arg[]) {
    	int n=989,r,num=0;
    	int temp = n;
    	while(n>0) {
    		r=n%10;
    		num=num*10+r;
    		n=n/10;
    	}
    	if(temp==num)
    		System.out.println("the given number is palindrome");
    		else
    			System.out.println("the given number is not a  palindrome");	
    			
    }
}
