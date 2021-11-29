// 1. You are given a string(str) and a number K.
// 2. You have to find length of the longest substring that has exactly k unique characters.
// 3. If no such substring exists, print "-1".1. You are given a string(str) and a number K.
// 2. You have to find length of the longest substring that has exactly k unique characters.
// 3. If no such substring exists, print "-1".

import java.util.*;

public class Main2 {

	public static int solution(String str, int k){
	    int ans=0;
	    int i=-1;
	    int j=-1;
	    HashMap<Character,Integer>hm=new HashMap<>();// character ka freq map
	    while(true){
	        boolean f1=false;
	        boolean f2=false;
	        while(i<str.length()-1){
	            f1=true;
	            i++; 
	            char ch=str.charAt(i);
	            hm.put(ch,hm.getOrDefault(ch,0)+1);
	            
	            if(hm.size()<k){
	                continue;
	            }
	            else if(hm.size()==k){
	                int len=i-j;
	                if(len>ans){
	                    ans=len;
	                }
	        }
	        else break;
	            } 
	            while(j<i){
	                f2=true;
	                j++;
	                char ch=str.charAt(j);
	                if(hm.get(ch)==1){
	                    hm.remove(ch);
	                }else{
	                    hm.put(ch,hm.get(ch)-1);
	                }
	                if(hm.size()>k)continue;
	                else if(hm.size()==k){
	                     int len=i-j;
	                if(len>ans){
	                    ans=len;
	                }
	                break;
	                }
	                
	            }
	            if(f1==false && f2==false)break;
	    }
	    
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
		System.out.println(solution(str,k));
	}

}

