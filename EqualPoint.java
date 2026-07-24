import java.util.*;
public class EqualPoint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int oc=0;
        int cc=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==')'){
                cc++;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                oc++;
            }
        }
        for(int i=0;i<str.length();i++){
            if(oc==cc){
                System.out.println(i);
            }
            if(str.charAt(i)=='('){
                oc++;
            }else if(str.charAt(i)==')'){
                cc--;
            }
        }
        if(oc==cc){
            System.out.println(str.length());
        }
    }
}

