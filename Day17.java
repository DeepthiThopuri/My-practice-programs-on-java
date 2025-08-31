import java.util.*;
public class Day17
{
    public int sum(int n){ //method for sum of n elements
        if(n>0){
            return n+sum(n-1);
        }
        else{
            return 0;
        }
    }
     public int sumWithReverse(int start , int end){ //method for sum from starting to ending elements 
        if(end>=start){
            return end+sumWithReverse(start,end-1);
        }
        else
        return 0;
    }
    // countdowm
    public void num(int n){
        if(n>0){
            System.out.print(n+" ");
            num(n-1);
        }
    
    }
	public static void main(String[] args) {
		Day17 obj=new Day17();
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
	int res=obj.sum(n);
	System.out.println("sum of N natural numbers:" +" "+res);
    int start=sc.nextInt();
    int end=sc.nextInt();
    int result=obj.sumWithReverse(start,end);
    System.out.println("sum of elements from startint to ending: "+" "+result);
    obj.num(n);
    
	}
}