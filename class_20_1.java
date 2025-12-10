//For inserting data in file 
import java.io.*;
class class_20_1{
    public static void main(String [] args){
        try{
            FileWriter writer = new FileWriter("home.html");
            writer.write("Data=>.............");
            writer.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}