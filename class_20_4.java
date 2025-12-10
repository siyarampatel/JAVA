//deletion in file
import java.io.*;
class class_20_4{
    public static void main(String [] args){
       try{
        File file = new File("home.html");
        if(file.delete()){
            System.out.println("Deleted");
        }else{
            System.out.println("Not deleted");
        }
       }catch(Exception e){
        System.out.println(e);
       }
    }
}