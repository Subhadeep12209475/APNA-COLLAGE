public class Length{
    public static int len(String str){
        if(str.length()==0){
            return 0;
        }
        return len(str.substring(1)) +1;

    }
    public static void main(String args[]){
        String str="Subha";
        System.out.println(len(str));
    }
}