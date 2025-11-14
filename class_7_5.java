//Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement
//  methods to deposit and withdraw money
import java.util.Scanner;
class bank{
    int n,m;
    Scanner sc = new Scanner(System.in);
    String accountHolder;
    int accountNumber;
    int balance;
     bank(String aH,int accountN,int bal){
        accountHolder=aH;
        accountNumber=accountN;
        balance=bal;
     }
    void deposit(){
        System.out.println("Enter ammount to deposite: ");
        n = sc.nextInt();
        balance+=n;
    }
    void withdraw(){
        System.out.println("Enter ammount to withdraw: ");
        m = sc.nextInt();
        balance-=n;
    }
    void display(){
        System.out.println("Holder's name: "+accountHolder);
        System.out.println("Account number: "+accountNumber);
        System.out.println("Balance: "+balance);
        
    }


}

class class_7_5{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        bank obj = new bank("Siyaram",536051,0);
        obj.deposit();
        obj.withdraw();
        obj.display();
        
        

    }
}