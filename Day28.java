import java.util.*;
public class Day28 {
    public static Boolean palindrome(String s){
         int left=0;
    int right=s.length()-1;
    boolean isPalindrome=true;
    while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
              isPalindrome=false;
                break;
        
                
            }
            left++;
            right--;
        }
            if(isPalindrome){
                System.out.println(s+ "is a palindrome");
            }
            else{
                System.out.println(s+ " is not a  palindrome");
                return false;
            }
    return true ;
    }
            public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                Day28 obj=new Day28();
                System.out.println(palindrome(s));
            }
}

