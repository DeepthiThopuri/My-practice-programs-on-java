import java.util.*;
public class Day10 {
    //sum of any two numbers to satisfy the target value
    public void twoSum(int[] arr,int target){
int sum=0;
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
        sum=arr[i]+arr[j];
        if(sum==target){
            System.out.println("Hey we reach the target value"+arr[i]+"+"+arr[j]+"="+sum);
        }
    }
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day10 obj=new Day10();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.twoSum(arr,target);
    }
}
