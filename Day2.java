import java.util.*;
public class Day2 {
    //sum of elements into array
    //averge of a array
     public void sumOfArray(int arr[]){
        int sum=0;
        int len=arr.length;

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        float average=sum/len;
        System.out.println(average);
    }
    // sort the array elements
     public void sortArray(int[] arr){
        ArrayList<Integer> arr1=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
          
        }
         System.out.println(arr1);
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Day2 obj=new Day2();
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    obj.sumOfArray(arr);
        obj.sortArray(arr);
	}
}
