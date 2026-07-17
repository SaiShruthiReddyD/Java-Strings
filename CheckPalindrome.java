import java.util.*;
public class CheckPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int left=0;
        int right=s.length()-1;
        boolean ispalindrome=false;
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                ispalindrome=true;
            }
            left++;
            right--;
        }System.out.println(ispalindrome);
    }
}
