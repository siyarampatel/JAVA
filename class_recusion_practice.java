class class_recusion_practice{
   static void name(int n){
        if(n==0){
            return ;
        }else{
         System.out.println("Siyaram");
         name(n-1);
        }
    }

    public static void main(String [] args){
        name(5);
    }
}