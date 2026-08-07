import java.util.*;
public class VowelsasString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
        s.append(c);
        }}
        System.out.println(s);
    }
}