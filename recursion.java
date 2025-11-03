public class recursion{
    public static void main(String [] args){
        System.out.println(recur(6));
    }
    static int recur(int n){
        if(n<2){
            return n; 
        }
        return recur(n-1)+recur(n-2);
    }
}

