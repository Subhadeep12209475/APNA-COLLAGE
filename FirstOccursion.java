public class FirstOccursion{
    public static int firstocc(int[] arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(key==arr[i]){
            return i;
        }
        return firstocc(arr,key,i+1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,5,2,4,8,9,3};
        int key=3;
        System.out.println(firstocc(arr,key,0));
    }
}