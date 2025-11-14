class methodOverriding{
    void show(int a){
        System.out.println(a);
    }
    void show(String s){
        System.out.println(s);
    }
    void show(double d){
        System.out.println(d);
    }
}

class class9_5{
    public static void main(String [] args){
        methodOverriding m = new methodOverriding();
        m.show(5);
        m.show("abhi");
        m.show(57988843);
    }
}