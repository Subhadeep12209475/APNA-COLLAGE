public class LastOccur{
    public static int lastoccur(int[] arr,int key,int i){
        if(i == arr.length-1){
            return -1;
        }
        int isFound = lastoccur(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

public static void main(String args[]){
    int[] arr = {2,3,4,5,4,7,8,2,7};
    int key = 4;
    System.out.println(lastoccur(arr,key,0));
    
}
}