 import java.util.*;
class Day6{
    //java program for selection sort
    public void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=1;j<n;j++){
               if(arr[j]<arr[min]){
                   min=j;
               }
            
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr1=new ArrayList<>();
        Day6 obj=new Day6();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.selectionSort(arr);
        for(int num:arr){
            arr1.add(num);
        }
        System.out.println(arr1);
    }
}
