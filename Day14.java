import java.util.*;
public class Day14
{
    public static void arrayConversion(ArrayList<String>list){
        String[] arr=new String[list.size()];
        list.toArray(arr);
        for(String s:arr){
            System.out.print(s+" ");
        }
        
    }
	public static void main(String[] args) {
	
	    Day14 obj=new Day14();
        Scanner sc=new Scanner(System.in);
      ArrayList<String> list=new ArrayList<>();
       int n=sc.nextInt();
       sc.nextLine();
	    for(int i=0;i<n;i++){
          String str = sc.nextLine();
            list.add(str);
        }
        
	    System.out.println(list);
      obj.arrayConversion(list);
	}
}