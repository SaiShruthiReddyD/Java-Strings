import java.util.*;
public class CountUCandLC {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int UC=0,LC=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                UC++;
            }else{
                LC++;
            }
        }System.out.println("Upper Case count= "+UC+"Lower Case count= "+LC);
    }
}
