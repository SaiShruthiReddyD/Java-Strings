import java.util.*;
public class Key {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        int key=sc.nextInt();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
               if((int)(ch)-key>96){
                 res=res+(char)(ch-key);
               }
               else{
                 res=res+(char)(ch-key+26);
               }
        }
        System.out.println(res);
    }
}