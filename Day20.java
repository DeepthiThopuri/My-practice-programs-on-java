import java.util.*;
class Day20{
    public void veryBigSum(int[] arr){
       long sum=0;
       for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
       } 
    
    System.out.println(sum);
    }
    public static void main(String[] arga){
        Day20 obj=new Day20();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new  int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.veryBigSum(arr);
    }
}
