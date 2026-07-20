import java.util.*;
public class Count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int UC=0,LC=0,Num=0,SplChar=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                UC++;
            }
            else if(Character.isLowerCase(ch)){
                LC++;
            }
            else if(Character.isDigit(ch)){
                Num++;
            }else{
                SplChar++;
            }
        }System.out.println(UC);
        System.out.println(LC);
        System.out.println(Num);
        System.out.println(SplChar);
    }
}