// class class5_1{
//     public static void main(String [] args){
       
//         String str = "i love java";
//         String a[]=str.split(" ");
//         StringBuilder result = new StringBuilder();

//         for(String b : a){
//             StringBuilder val = new StringBuilder (b);
//             result.append(val.reverse().append(" "));
//         }
//         System.out.println(result);
//     }
// }


class class5_1{
    public static void main(String [] args){
        String str = "aaabbcccccdd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                result.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        result.append(str.charAt(str.length()-1)).append(count);
        System.out.println(result);
    }
}