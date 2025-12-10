class class_19_3{
    public static void main(String [] args){
        System.out.println("Hello");
        try{
        int a=9;
        int b=0;                    /*we write things inside try and catch in which we there is an chance of error in this way we can secure 
                                        our code from crashing */
        int c=a/b;
        System.out.println(c);
        }catch(Exception e){    /*Exception is an class and e is an variable which stores the message according to the exception
                                we can directly describe the exception also*/
            System.out.println(e);
        }
        System.out.println("Hii");
    }
}