//Exception handling (use case)

class class_19_2{
    public static void main(String [] args){
        System.out.println("hello");
        int a=9;
        int b=0;
        int c=a/b;
        System.out.println(c); //its an error and because of this the code after this line won't run and it will corrupt the remaining code
        System.out.println("hii"); 
    }
}