//array of elements is given string should be displayed
import java.util.*;
public class Array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        String res="";
        for(int i=0;i<n;i++){
           
            res=res+(char)(arr[i]+96);
        }
        System.out.println(res);
    }
}