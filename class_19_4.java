class class_19_4{
    public static void main(String [] args){
        try{
            String str = null;
            System.out.println(str);
            
        }catch(NullPointerException e){ //described the exception by ourself
            System.out.println(e);
        }finally{
            System.out.println("Finally will run at any cost");
        }
    }
}