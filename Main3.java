// 1. You are given a string.
// 2. You have to find the count of valid substrings of the given string.
// 3. Valid substring is defined as a substring that has all unique characters

import java.util.*;

public class Main3{

	public static int solution(String str) {  
	    HashMap<Character,Integer>hm=new HashMap<>();
	    int i=-1;
	    int j=-1;
	    int ans=0;
	    while(true){
	        boolean f1=false;
	        boolean f2=false;
	        while(i <str.length()-1){
	            f1=true;
	            i++;
	            char ch=str.charAt(i);
	            hm.put(ch,hm.getOrDefault(ch,0)+1);
	            if( hm.get(ch)==2){
	                break;
	            }
	            else {
	                ans+=i-j;
	            }
	        }
	        while(j < i){
	            f2=true;
	            j++;
	            char ch=str.charAt(j);
	            hm.put(ch,hm.get(ch)-1);
	            if(hm.get(ch)==1){
	                ans+=i-j;
	                break;
	            }
	        }
	        if( f1==false && f2==false){
	            break;
	        }
	        
	    }
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
