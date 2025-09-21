import java.util.*;
class Day25{

    // second largest element in an array
    public int secondLargest(int[] arr){
       int n=arr.length;
       Arrays.sort(arr);
       for(int i=n-2;i>=0;i--){
           if(arr[i]!=arr[n-1]){
               return arr[i];
           }
       }
       return -1;
    }
    // third largest element in an array
    public int thirdLargestEle(int[] arr){
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=n-3;i>=0;i--){
            if(arr[i]!=arr[n-2]){
                return arr[i];
            }
        }
        return -1;
    }
    //main function
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Day25 obj=new Day25();
        int res=obj.secondLargest(arr);
        System.out.println(res);
       int r= obj.thirdLargestEle(arr);
       System.out.println(r);
    }
}