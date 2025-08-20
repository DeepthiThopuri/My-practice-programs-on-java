import java.util.*;
public class Day7 {
    public void linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("value found"+" "+arr[i]);
            
            }
        }
        return -1;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day7 obj=new Day7();
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.linearSearch(arr,target);
    }
}
