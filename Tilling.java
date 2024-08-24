public class Tilling{
    public static int till(int n){
        if(n == 0 || n == 1 ){
            return 1;
        }
        return till(n-1)+till(n-2);
    }
    public static void main(String args[]){
        int n=6;
        System.out.println(till(n));
    }
   
}