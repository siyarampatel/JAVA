//File system 
//->creating file
import java.io.*;

class class_20{
    public static void main(String [] args){
        try{
            File file = new File("home.html");
            if(file.createNewFile()){
                System.out.println("File created"+file.getName());
            }else{
                System.out.println("File already created");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}