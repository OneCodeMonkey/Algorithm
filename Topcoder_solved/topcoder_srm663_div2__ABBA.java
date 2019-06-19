package test;

import java.util.*;

class ABBA{
    static String canObtain(String initial,String target){
        while(target.length()!=initial.length()){
            if(target.charAt(target.length()-1)=='A'){
                target=target.substring(0,target.length()-1);
            }
            else{
                target=target.substring(0,target.length()-1);
                StringBuffer temp=new StringBuffer(target);
            temp.reverse();
                target=temp.toString();
            }
        }
        return (target.equals(initial))?"possible":"impossible";
    }
//    public static void main(String args[]){
//     System.out.println(canObtain("B","ABBA"));
//    }
};
