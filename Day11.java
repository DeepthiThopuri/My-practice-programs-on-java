import java.util.*;
class Day11{
    public void leftRotation(int[] arr,int d){
        int n=arr.length;
       for(int i=0;i<d;i++){
        int temp=arr[0];
        for(int j=1;j<n;j++){
            arr[j-1]=arr[j];
        }
        arr[n-1]=temp;
        
       } 
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
    }
    public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  Day11 obj=new Day11();
  int n=sc.nextInt();
  int d=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
  }
  obj.leftRotation(arr,d);
    }
 }
