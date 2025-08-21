
    import java.util.*;
import java.lang.Math;
//Optimal solution for Consecutive Ones
class Day8{
    public void consecutiveOnes(int[] arr){
int maxi=0;
int cnt=0;
for(int i=0;i<arr.length;i++){
    if(arr[i]==1){
        cnt+=1;
        maxi=Math.max(maxi,cnt);
    }
    else{
        cnt=0;
    }
}
System.out.println(maxi);
} 

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day8 obj=new Day8();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        obj.consecutiveOnes(arr);
}
}
