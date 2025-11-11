//First non repeating character in string using methods

class class_6_1{
    void repeating(String str){
        char result = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)==ch){
                    count++;
                }
            }
            if(count==1){
                result = ch;
                break;
            }
            if(result!=0){
                System.out.println("The first non repeating charater is: "+result);
        }
        else{
            System.out.println("No non repeating character found");
        }

    }
    }
    public static void main(String [] args){
        class_6_1 obj = new class_6_1();
        String str = "aaagggtyyy";
        obj.repeating(str);
        
    }
    }