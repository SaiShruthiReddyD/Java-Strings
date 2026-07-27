import java.util.*;
public class Password{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int u=1,l=1,d=1,s=1;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                u=0;
            }else if(Character.isLowerCase(ch)){
                l=0;
            }else if(Character.isDigit(ch)){
                d=0;
            }else{
                s=0;
            }
        }int miss=u+l+d+s;
        System.out.println(Math.max (miss,8-str.length()));
    }
}