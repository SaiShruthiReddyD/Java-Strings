import java.util.*;
public class Substringcontains{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String mainstring=sc.nextLine();
        String substring=sc.nextLine();
        System.out.println(mainstring.contains(substring));
    }
}