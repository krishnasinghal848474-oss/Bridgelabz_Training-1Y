package com.gla.leetcode;

public class Solution_58 {
    public int Lengthoflastword(String s){
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution_58 sol=new Solution_58();
        sol.Lengthoflastword("Hello world");
    }
}
