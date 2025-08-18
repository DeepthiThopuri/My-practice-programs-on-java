//java program on buble sort
import java.util.*;
class Day5{
    //method implementation for sort
    public void bubleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    //main method for object creation
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>arr1=new ArrayList<>();
        Day5 obj=new Day5();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.bubleSort(arr);
        for(int num:arr){
            arr1.add(num);
        }
        System.out.println(arr1);
    }
}