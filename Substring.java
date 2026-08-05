import java.util.Scanner;
public class Substring{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String str=sc.nextLine();
     str=str.toLowerCase();
     int c=1;
     int max=1;
     int f=0;
     for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i+1)+0==str.charAt(i)+1){
            c++;
            f=1;
        }if(str.charAt(i+1)+0!=str.charAt(i)+1){
            f=0;
        }if(max<c){
            max=c;
            }            
        if(f==0){
            c=1;
        }
     }
     System.out.println(max);
    }
}