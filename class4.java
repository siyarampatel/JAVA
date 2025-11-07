//Find the largest word in the string
// class class4{
//     public static void main(String [] args){
//         String str = "Java is an powefull language";
//         String a[] = str.split(" ");
//         String largest = "";
//         for(String val: a){
//             if(val.length()>largest.length()){
//                 largest=val;
//             }
//         }
//         System.out.println(largest);
//     }
// }

//Count the frequency of character in an string

// class class4{
//     public static void main(String[] args){
//         String s = "java is an powerfull language";
//         char ch = 'a';
//         int frequency = 0;
//         for(int i=0; i<s.length(); i++){
//             if(s.charAt(i)==ch){
//                 frequency++;
//             }
//         }
//         System.out.println("The frequency of a is: "+frequency);
//     }
// }

// class class4{
//     public static void main(String[]args){
//         String str = "youtube";
//         int freq [] = new int[256];
//         for(char ch:str.toCharArray()){
//             freq[ch]++;
//         }
//             for(int i=0;i<256;i++){
//             if(freq[i]>0){
//                 System.out.println((char)i +"->"+freq[i]);

//         }
//     }
// }
//     }


//Anagram(check if two strings have same characters)
import java.util.*;
class class4{
    public static void main(String[]args){
        String a = "java";
        String b = "ajav";
        char c[] = a.toCharArray();
        char d[] = b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String e = new String(c);
        String f = new String(d);
        if(e.equals(f)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }

    }
}