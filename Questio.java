//Roman to integer via string
import java.util.Scanner;
class Questio {
        static int value(char ch){
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
        }
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roman number: ");
        String s = sc.next().toUpperCase();
        int total=0;
        for(int i=0; i<s.length(); i++){
            int current = value(s.charAt(i));
            int next=0;
            if(i+1<s.length()){
                next = value(s.charAt(i+1));
            }
            if(current<next){
                total-=current;
            }
            else{
                total+=current;
            }
        }
        System.out.println("The integer value is: "+total);
    }
     
}