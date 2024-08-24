public class Duplication{
    public static void Duplicate(String str,int i,StringBuilder newstr, boolean map[]){
        if(i == str.length()){
            System.out.println(newstr);
            return;
        }
        char currcar=str.charAt(i);
        if(map[currcar - 'a'] == true){
            Duplicate(str,i+1,newstr,map);
        }else{
            map[currcar-'a'] = true;
            Duplicate(str,i+1,newstr.append(currcar),map);
        }
    }
    public static void main(String[] args){
        String str = "suubhaabaaab";
        Duplicate(str, 0, new StringBuilder(""),new boolean[26]);

    }
}