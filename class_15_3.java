//Character with single frequency

import java.util.HashMap;
class class_15_3{
    public static void main(String [] args){
        HashMap<Character,Integer>map=new HashMap<>();
        String str = "aabbcct";
        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
        for(char ch: str.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("Charater with unity frequency: "+ch);
                break;
            }
        }
}
}