import java.util.*;
public class Coded {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
                res=res+(char)(219-ch);
        }
        System.out.println(res);
    }
}