import java.util.*;
public class Alphabet {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] arr=new int[s.length()];

        for(int i=0;i<arr.length;i++){
            char ch=s.charAt(i);
            arr[i]=ch-96;
        }
            System.out.print(Arrays.toString(arr));
    }
}