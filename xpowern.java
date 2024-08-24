public class xpowern{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int y=power(x,n-1);
        return x*y;
    }
    public static void main(String args[]){
        int x=2;
        int n=10;
        System.out.println(power(x,n));
    }
}