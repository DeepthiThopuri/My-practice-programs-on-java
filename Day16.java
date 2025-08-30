import java.util.*;
public class Day16{
    public void appearOnce(int arr[]){
for(int i=0;i<arr.length;i++){
    int num=arr[i];
    int cnt=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]==num){
            cnt+=1;
        }
    }
    if(cnt==1){
        System.out.println(num);
    }
}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day16 obj=new Day16();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        obj.appearOnce(arr);
    }
}
