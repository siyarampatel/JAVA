//For inserting data in file->writing
import java.io.*;
class class_20_2{
    public static void main(String [] args){
        try{
            FileWriter writer = new FileWriter("home.html",true);//If we don't use true then it will erase the 
                                                                 // previous data and rewrite this one but we use true so we can add this
            writer.write("Hello Hii Bye");          
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}