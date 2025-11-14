/*Design a class Book with overloaded methods to display book details in different formats.
One method should display the title and author, and another should display the title, author, and price.*/

class book{
    void display(String t,String a){
        System.out.println("THE TITLE IS: "+t+"\n"+"THE AUTHOR IS: "+a+"\n");
    }
     void display(String t,String a,int p){
        System.out.println("THE TITLE IS: "+t+"\n"+"THE AUTHOR IS: "+a+"\n"+"PRICE = "+p);
    }
}
class class9_8{
    public static void main(String [] args){
        book b = new book();
        b.display("Ramayana","Valmiki");
        b.display("Ramayana","Valmiki",5000);

    }
}