// 1. You are given a string.
// 2. You have to find the length of the longest substring of the
//  given string that contains all non-repeating characters.

import java.util.*;

public class main {

	public static int solution(String str) {
	    int i=-1,j=-1,max=0;
	    HashMap<Character,Integer>hm=new HashMap<>();
	    
	    while(true){
	        boolean f1=false;
	        boolean f2=false;
	        while(i<str.length()-1){
	            f1=true;
	            i++;
	            char ch=str.charAt(i);
	            hm.put(ch,hm.getOrDefault(ch,0)+1);
	            if(hm.get(ch)==2){
	                break;
	            }
	            else{
	                int len=i-j;
	                if(len > max){
	                    max=len;
	                }
	            }
	        }
	        
	        while(j<i){
	            f2=true;
	            j++;
	            char ch=str.charAt(j);
	            hm.put(ch,hm.get(ch)-1);
	            if(hm.get(ch)==1){
	                break;
	            }
	    }
	    if(f1==false && f2==false){
	        break;
	    }
	 }
		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
