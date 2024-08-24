// GET 

// import java.util.*;
// public class ith_find{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=0;
//         int bitmask= (1<<i);
//         if((n & bitmask)==0){
//             System.out.println("0");

//         }else{
//             System.out.println("1");
//         }
//     }
// }

// SET

// import java.util.*;
// public class ith_find{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=2;
//         int bitmask= (1<<i);
//         System.out.println (n | bitmask );
//     }
// }

// CLEAR

// import java.util.*;
// public class ith_find{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int i=2;
//         int bitmask= ~(1<<i);
//         System.out.println (n & bitmask );
//     }
// }

//UPDATE

import java.util.*;
public class ith_find{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        int bitmask= ~(1<<i);
        int clear_bit = n | bitmask;
        int newbit = sc.nextInt();
        System.out.println(clear_bit | newbit);

    }
}

