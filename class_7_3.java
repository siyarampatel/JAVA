class car{
    int a;
    car(int a){
        this.a = a; //for differentiating the variable type wheather it is an global or local or static
        System.out.println(a);
    }
}

class class_7_3{
    public static void main(String [] args){
        car obj = new car(5);
    }
}