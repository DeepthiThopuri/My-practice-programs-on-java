import java.util.*;
public class Day22
{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++){
		    if(i==1 || i==2){
		        System.out.print("  J");
		    }
		    else if(i==3){
		        System.out.print("J J");
		    }
		    else{
		        System.out.print("JJ");
		    }
		    System.out.print(" ");
		    //a
		    if(i==1){
		        System.out.print("  a");
		    }
		    else if(i==2){
		        System.out.print("a  a");
		    }
		    else if(i==3){
		        System.out.print("aaaa");
		    }
		    else{
		        System.out.print("a     a");
		    }
		    
		    System.out.print(" ");
		    //v
		    if(i==1){
		        System.out.print(" v     v");
		    }
		    else if(i==2){
		        System.out.print("v    v");
		    }
		    else if(i==3){
		        System.out.print(" V  V");
		    }
		    else{
		        System.out.print("v ");
		    }
		    System.out.print(" ");
		    //a
		    if(i==1){
		        System.out.print("a");
		    }
		    else if(i==2){
		        System.out.print("a  a");
		    }
		    else if(i==3){
		        System.out.print(" aaaa");
		    }
		    else{
		        System.out.print("a      a");
		    }
		    System.out.println(" ");
		}
	}
}