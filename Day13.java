import java.util.*;
public class Day13 {
    public int majorityEle(int[] arr){
        int n=arr.length;
for(int i=0;i<arr.length;i++){
    int cnt=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]==arr[i]){
            cnt+=1;
        }
    }
    if(cnt>n/2)
      return arr[i];
    
}
return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Day13 obj=new Day13();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      int res=  obj.majorityEle(arr);
      System.out.println(res);
    }
}
