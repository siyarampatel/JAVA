// class class1{
//     public static void main(String[] args){
//         System.out.println("java");
//     }
// }

// class class1{
//     public static void main(String[] args){
//         byte a=5;
//         short b=5;
//         int c=5;
//         float f=90.3f;
//         boolean data = false; //1 bit of memory either true or false (0 or 1)
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(c);
//         System.out.println(f);
//         System.out.println(data);
//     }
// }
// import java.util.Scanner;
// class class1{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number: ");
//         int a = sc.nextInt();
//         if(a%2==0){
//             System.out.println("The number is even");
//         }else{
//             System.out.println("The number is odd");
//         }
//     }
// }

//Prime number code
// import java.util.Scanner;
// class class1{
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any number: ");
//         int n = sc.nextInt();
//         boolean isPrime = true;
//         if(n<2){
//             isPrime = false;
//         }
//         for(int i=2; i<n/2; i++){
//             if(n%i==0){
//                 isPrime = false;
//             }
//         }
//         if(isPrime){
//             System.out.println("It's an prime number");
//         }else{
//             System.out.println("Not an prime number");
//         }
//     }
// }

// Type casting 
// class class1{
//     public static void main(String [] args){
// int a = 600;
// byte b = a;
// System.out.println(b);
//     }

//Palindrome checker for an integer
import java.util.Scanner;
class class1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int original = n;
            int reversed = 0;
        
        while(n!=0){
            int digit = n%10;
            reversed = reversed*10+digit;
            n=n/10;
        }
        if(original==reversed){
            System.out.println("It's an pallindrome");
        }
        else{
            System.out.println("Not an pallindrome");
        }
        sc.close();
    }
}