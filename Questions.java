// Question 4

public class Questions{
    public static int subs(String str,int si,int ei){
        if(si>ei){
            return 0;
        }
        int count=0;
        for(int i=si ;i<=ei;i++){
        if(str.charAt(si)==str.charAt(i)){
            count++;
        }
    }
        return count+ subs(str,si+1,ei);
    }
    public static void main(String args[]){
        String str ="aba";
        System.out.println(subs(str,0,str.length()-1));
    }
}