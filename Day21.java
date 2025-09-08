import java.util.*;
public class Day21 {
    public void factorial(int n){
        if(n==0 || n==1)
            System.out.println(1);
        else
            System.out.println( n*factorial(n-1));
    //return 0;    
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Day21 obj=new Day21();
        obj.factorial(n);
       // System.out.println(res);


    }
}
