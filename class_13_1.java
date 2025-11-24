class parent{
   final void show(){
        System.out.println("Parent show");;
    }
}

class child extends parent{
    void show(){
        System.out.println("Show");
    }
}

class class_13_1{
    public static void main(String [] args){
    parent p = new child();
    p.show();
    }
}