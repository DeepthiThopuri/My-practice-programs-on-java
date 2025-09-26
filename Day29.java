import java.util.*;
public class Day29
{
    public void compareString(String s1,String s2){
        for(int i=0;i<s1.length();i++){
            for(int j=0;j<=i;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    System.out.print(s1.charAt(i)+" ");
                }
            }
        }
        System.out.print(" are equal");
    }
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  String s1=sc.nextLine();
  String s2=sc.nextLine();
  Day29 obj=new  Day29();
  obj.compareString(s1,s2);
	}
}