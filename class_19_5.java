class class_19_5{
    static void voteAge(int age){
        System.out.println("Check for vote");
        if(age<18){
            throw new IllegalArgumentException("You can't give your vote");
        }
    }
    public static void main(String [] args){
        try{
            voteAge(17);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
            voteAge(19);
        }catch(Exception e){
            System.out.println(e);
        }


    }
}