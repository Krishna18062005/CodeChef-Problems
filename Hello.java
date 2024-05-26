import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Alternate first & Last Patern
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<(s.length()+1)/2;i++){
		    for(int j=0;j<s.length();j++){
		        if(j==i||j+i+1==s.length()) continue;
		        else
		        { 
		            System.out.print(s.charAt(j)+"");
		    }}
		    System.out.print("\n");
		}
		
}}
