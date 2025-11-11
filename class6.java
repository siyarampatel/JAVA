// local variable and global variable (static non static)
// global->static or non static


// class class6{
//     int a=5; //can't be accessed withot an object 

// public static void main(String [] args){
//     class6 obj = new class6();
//     System.out.println(obj.a);

//   }
// }


// class class6{
//   static  int a=5; //can be accessed withot an object as there is an static key word

// public static void main(String [] args){
//     class6 obj = new class6();

//     System.out.println(a);

//   }
// }


//METHODS 

class class6{
   static void sum(int x , int y){  //static key word, so we can use the method without object
        int z=x+y;
        System.out.println(z);
    }
    public static void main(String [] args){
            int x=5;
            int y=8;
            sum(x,y);
            
    }
}



// class class6{
//      void sum(int x , int y){    //static key word not there, so we can't use the method without object
//        int z=x+y;
//         System.out.println(z);
//     }
//     public static void main(String [] args){
//             int x=5;
//             int y=8;
//             class6 obj = new class6();
//             obj.sum(x,y);
            
//     }
// }