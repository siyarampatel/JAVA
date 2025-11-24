// class Solution {
//     public boolean isAnagram(String s, String t) {
//         char[] arr1=s.toCharArray();
//         char[] arr2=t.toCharArray();
//         arr1=arr1.sort();
//         arr2=arr2.sort();
//         if(arr1.length()!=arr2.length()){
//             return false;
//         }
//         for(int i=0; i<s.length(); i++){
//             if(arr1[i]!=arr2[i]){
//                 return false;
//             }else{
//                 return true;
//             }
//         }
//     }
// }
