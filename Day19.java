import java.util.*;
class Day19{
    //fibinocci series with direct function call
    public int fun(int n){
        if(n<=1)
        return n;
        else
        return fun(n-1)+fun(n-2);
    }
    //fibinocci series with step by step function call
    public int fun1(int n){
        if(n<=1)
            return n;
       
            int last=fun1(n-1);
            int slast=fun1(n-2);
            return last+slast;
    }
    public static void main(String[] args){
        Day19 obj=new Day19();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int res= obj.fun(n);//0 1 1 2 3 5
       System.out.println(res);
       int r=obj.fun1(n);
        }
}