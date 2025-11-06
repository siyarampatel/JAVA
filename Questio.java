//Roman to integer via string
class Solution {
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
        String s = sc.next().sc.toUpperCase();
        
    }
     
}