import java.util.*;
public class Day4{
    //Area of rectangle
    public void areaRectangle(int len,int breadth){
int area=len*breadth;
System.out.println(area);
    }
    // check wheather a number is prime
    public void primeNum(int[] arr){

int cnt=0;
		for(int i:arr){
			for(int j=1;j<arr.length;j++){
		      if(i%arr[j]==0){
		        cnt+=1;}}
				if(cnt==2){
					System.out.println("prine nmber");
				}
                else{
                    System.out.println("not prime");
                }
		    }

        
	}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Day4 obj=new Day4();
int len=sc.nextInt();
int breadth=sc.nextInt(); 
int arr[]=new int[len];
for(int i=0;i<len;i++){
    arr[i]=sc.nextInt();
}
obj.areaRectangle(len,breadth);
obj.primeNum(arr);

    }
}
