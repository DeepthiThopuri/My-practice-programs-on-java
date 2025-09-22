import java.util.*;
class Day26{
    public void reverseArray(int[] arr){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=n-1;i>=0;i--){
          temp[i]=arr[i]; 
          System.out.print(temp[i]+" ");
        }
        System.out.println();
    }

    // remove duplicates from an array
    public void removeDuplicates(int[] arr){
        HashSet<Integer> s=new HashSet<>();
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(!s.contains(arr[i])){
                s.add(arr[i]);
                arr[idx++]=arr[i];
            }
        }
    
            System.out.println(s);
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Day26 obj=new Day26();
        obj.reverseArray(arr);
        obj.removeDuplicates(arr);
    }
}