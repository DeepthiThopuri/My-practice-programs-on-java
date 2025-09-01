import java.util.*;
public class Day18 {
    public void f(int n,int i){
if(i>n){
    System.out.println(" ");
}
else{
    System.out.println(n);
    f(n-1,i);
}
    }
public void f1(int num,int ele){
    if(ele>num){
        System.out.println(" ");
    }
    else{
        System.out.println("deepthi");
        f1(num,ele+1);
    }
}
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day18 obj=new Day18();
        int n=sc.nextInt();
        int i=1;
        int ele=1;
        obj.f(n,i);
        obj.f1(n,ele);
    }
}
