import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int checker =1;
        if((n & checker)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}