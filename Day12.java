import java.util.*;
public class Sortarray {
    public void sortArray(int[] arr){
int cnt0=0;
int cnt1=0;
int cnt2=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==0){
        cnt0+=1;}
    else if(arr[i]==1){
        cnt1+=1;
    }
   else if(arr[i]==2){
        cnt2+=1;
    }
}
    for(int i=0;i<cnt0;i++){
        arr[i]=0;
    }
    for(int i=cnt0;i<cnt0+cnt1;i++){
        arr[i]=1;
    }
    for(int i=cnt0+cnt1;i<arr.length;i++){
        arr[i]=2;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       Sortarray obj=new Sortarray();
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
       obj.sortArray(arr);
    }
}
