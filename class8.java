class employee{
    void work(){
        System.out.println("employee doing work");
    }
}
class manager extends employee{
    void meeting(){
        System.out.println("Attending meeting");
    }
}

class class8{
    public static void main(String [] args){
        manager m = new manager();
        m.meeting();
        m.work();
    }
}