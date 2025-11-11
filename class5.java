class class5{
    public static void main(String [] args){
        //Strings are immutable but we have to make it mutabke then we havae to use stringbuilder we can make direct change in single process
        //otherwise if we dont use this string builder then it will make per object per character
        StringBuilder str = new StringBuilder("hello");
        // str.append("j");
        // System.out.println(str); //for adding another string after our previous string

        // str.insert(2,"hii");
        // System.out.println(str);   //insert new string between two index

        // str.replace(1,3,"orange");
        // System.out.println(str);     

        // str.reverse();
        // System.out.println(str);     //reverse the string
        
        // str.delete(1,3);
        // System.out.println(str);     //delete characters between two characters(but leaves character at after index)
        // str.setCharAt(0,'z');
        // System.out.println(str);     //char replacement in particular index 
    }
}