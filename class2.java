// import java.util.Scanner;
// class class2{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your string");
//         String a = sc.nextLine();
//         System.out.println(a);
//     }
// }

// import java.util.Scanner;
// class class2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int n;
//         System.out.println("Enter n: ");
//         n = sc.nextInt();
//         int[] arr = new int [100];
//         for(int i=0; i<n; i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0; i<n; i++){
//             for(int j=i+1; j<n; j++){                        // sorting
//                 if(arr[i]>arr[j]){
//                 int t = arr[i];
//                 arr[i]=arr[j];
//                 arr[j]=t;
//             }
//         }
//         for(int i=0; i<n; i++){
//             System.out.println(arr[i]);
//         }
//     }
// }
// }

// String

//  import java.util.Scanner;
// class class2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         String str = "hello";
//         for(int  i=0; i<str.length(); i++){
//         System.out.println(str.charAt(i));
//         }
//     }
// }


//Palindrome check in string 
// import java.util.Scanner;
// class class2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         String str = "maa";
//         for(int i=0; i<str.length()/2; i++){
//             if(str.charAt(i)!=str.charAt(str.length()-i-1)){
//                 System.out.println("Not an palindrome");
//                 break;
//             }
//             else{
//                 System.out.println("It's an palindrome");
//                 break;
//             }
//         }

//     }
// }

// check if number is divisible of 3
// import java.util.Scanner;
// class class2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number");
//         int n = sc.nextInt();
//         if(n%3==0){
//             System.out.println("Your number is divisible by 3");
//         }
//         else{
//             System.out.println("Not divisible by 3");
//         }
//     }
// }


//Type casting 

// import java.util.Scanner;
// class class2{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int a = 5;
//         int b = 6;
//         float = (float)5/6;
//         System.out.println(c);
//     }
// }

//Copying string to array

import java.util.Scanner;
class class2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();
        char [] arr = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            arr [i]=str.charAt(i);
        }
        System.out.println("Characteers arre: ");
        for(int i=0; i<str.length(); i++){
            System.out.println(arr[i]);
        }

    }
}