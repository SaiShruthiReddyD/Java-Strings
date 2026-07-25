import java.util.*;
public class Group {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res1="";
        String res2="";
        String res3="";
        String res4="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                res1=res1+ch;
            }
            else if(Character.isLowerCase(ch)){
                res2=res2+ch;
            }
            else if(Character.isDigit(ch)){
               res3=res3+ch;
            }else{
               res4=res4+ch;
            }
        }System.out.println(res1+res2+res3+res4);
        // 0-9:48-57,
    }
}