import java.util.*;
public class Day9 {
public void moveZeros(int[] arr){
    int temp[]=new int[arr.length];
    int index=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]!=0){
    temp[index]=arr[i];
    index+=1;
}
}
int nz=temp.length;
for(int i=0;i<nz;i++){
    arr[i]=temp[i];
}

for(int i=nz;i<arr.length;i++){
    arr[i]=0;
}
System.out.println("final array is");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Day9 obj=new Day9();
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    obj.moveZeros(arr);
}
    
}
