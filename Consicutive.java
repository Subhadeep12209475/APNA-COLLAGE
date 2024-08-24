public class Consicutive{
    public static void consicu(int n,int lastplace,String str){
        //base
        if(n == 0){
            System.out.println(str);
            return;
        }
        if(lastplace==0){
            consicu(n-1,0, str+"0");
            consicu(n-1,1,str+"1");
        }else{
            consicu(n-1,0,str+"0");
        }
        }
    public static void main(String args[]){
        int n=3;
        consicu(n,0,"");
    }
}