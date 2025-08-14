import java.util.*;
import java.lang.*;
public class Day3 {
    // smallest elements in the array
    public void smallestEle(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
    //check the number even or odd
    public static  void evenOddEle(int[] arr){
        ArrayList<Integer> arr1=new ArrayList<>();
         ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println("even");
            }
            else
            System.out.println("odd");
        }
    }
    //program for checkinh positive AND negatiive
    public void posNeg(int n){
        if(n>0){
            System.out.println("positive");
        }
        else if(n<0){
            System.out.println("Negative");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day3 obj=new Day3();
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
obj.smallestEle(arr);
evenOddEle(arr);
int s=sc.nextInt();
obj.posNeg(s);


    }
}
