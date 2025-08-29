import java.util.*;
public class Day15 {
    public void copyArray(int[] arr){
int[] b=new int[arr.length];
b=arr;
b[0]++;
System.out.println("the first array elements are:");
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]+" ");
}
System.out.println("copying elements are");
for(int i=0;i<arr.length;i++){
    System.out.println(b[i]+" ");
}
    }
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Day15 obj=new Day15();
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
obj.copyArray(arr);
    }
}
