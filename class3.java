// class class3{
//     public static void main(String[]args){
//         String str = "siyaram";
//         String str1 = "patel";
//        // System.out.println(str.length());
//         // System.out.println(str.charAt(4));
//         // System.out.println(str.toUpperCase());
//         // System.out.println(str.indexOf("s"));
//         // System.out.println(str.substring(3));
//         // System.out.println(str.substring(3,6));
//       //  System.out.println(str==str1); //There references(variable which points that data) will be compared
//        // System.out.println(str.equals(str1)); // Real string will be compared 

//     }
// }

// class class3{
//     public static void main(String [] args){
//         String str1 = new String ("hello");
//         String str2 = new String ("hello"); //In this case object gets created and two object can't be equal
//         String str3 = "hello"; //created by Reffrence variable 
//         String str4 = "hello";
//         System.out.println(str1==str2);      
//         System.out.println(str1.equals(str2)); //values gets compared 
//         System.out.println(str3==str4);      
//         System.out.println(str3.equals(str4)); //values gets compared 
        
//     }
// }


// class class3{
//     public static void main(String [] args){
//         String a = "abc";
//         String b =  "";
//         for(int i=a.length()-1; i>=0; i--){
//             b+=a.charAt(i);                     //Reversal of an string
//         }
//         if(a.equals(b)){
//             System.out.println("YES");
//         }else{
//             System.out.println("NO");
//         }
//     }
// }

// Consonant Vowels 

// class class3{
//     public static void main(String [] args){
//         String s = "apple";
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//                 System.out.printf(ch+": It's an vowel");
//             }
//             else{
//                 System.out.println(ch+": is an consonant");
//             }
//         }
//     }
// }

class class3{
    public static void main(String [] args){
        String str = "helllo java cpp";
        String a[] = str.split(" ");
        for(String str1:a){
            System.out.println(str1);
        }
    }
}