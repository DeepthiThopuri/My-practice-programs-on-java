
import java.util.*;
import java.lang.*;
import java.util.Arrays;
public class Day1
{
    //java method 
    public static void countWords(String s,int n1,int n2){
        int sum;
        String rev="";
        int count=s.split(" ").length;//split the string and count the words
        char a[]=s.toCharArray();
        //sum of two numbers
        sum=n1+n2;
        System.out.println("the sum of two numbers"+" "+sum);
        System.out.println("the count of words in a string"+" "+count);
        System.out.println("the array for string is:");
        //convert the string into an array
        for(int i=0;i<a.length;i++){
        System.out.println(" "+a[i]);
    }
    //print the reverse of a string
        for(int i=s.length()-1;i>=0;i--){
          rev+=s.charAt(i);  
        }
        System.out.println("the reverse of a string is"+" "+rev);
    }
    //main method
	public static void main(String[] args) {
	    //scanner class creation
		Scanner sc=new Scanner(System.in);
		//object creation
		Day1 obj=new Day1();
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter second number");
		int n2=sc.nextInt();
		sc.nextLine();
		System.out.println("enter a string");
		String s=sc.nextLine();
		//method call
	countWords(s,n1,n2);
	}
}