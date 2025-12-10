/*For reading data of any file*/
import java.io.*;
class class_20_3{
    public static void main(String [] args){
        try{
            FileReader reader = new FileReader("home.html");
            int ch;
            while((ch=reader.read())!=-1){
                System.out.print((char)ch);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}