public class Friends_pairing{
    public static int pair(int n){
        if(n == 1||n == 2){
            return n;
        }
        int single=pair(n-1);
        int pair=(n-1)*pair(n-2);
        return single + pair;
    }
    public static void main(String args[]){
        int n=3;
        System.out.println(pair(n));

    }
}