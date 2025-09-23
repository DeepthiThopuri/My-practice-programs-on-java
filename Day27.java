
import java.util.*;
public class Day27
{
    // retrievev the charracter at particular index from the string
    public void indexChar(String s,int n){
        	for(int i=0;i<s.length();i++){
		    if(i==n){
		    System.out.print(s.charAt(i)+" ");
		    // unicode for i character
		    System.out.print(" "+s.codePointAt(i));
		    }
		}
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
	Day27 obj=new Day27();
	obj.indexChar(s,n);
	}
}