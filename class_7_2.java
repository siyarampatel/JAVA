class car{
    car(String str){
        System.out.println(str);
    }
}

class class_7_2{
    public static void main(String [] args){
        car obj1 = new car("hello");
        car obj2 = new car("hii"); // used same constructor in two different ways,as we used given argument in it
    }
}