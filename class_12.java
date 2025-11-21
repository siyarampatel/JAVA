//Encapsulation

//abstration hides the implementation but the encapsulation hides and secures the data 

class atm{
    private int totalBalance=100000;
    public void getTotalBalance(){
        System.out.println(totalBalance);
    }
    public void setBalance(int amount){
        if(amount>0&&totalBalance>amount){
            totalBalance-=amount;
            System.out.println(totalBalance);
        }
    }
    public void setBalance1(int amount1){
        if(amount1>0){
            totalBalance+=amount1;
            System.out.println(totalBalance);
        }
    }
}

class class_12{
    public static void main(String [] args){
        atm a = new atm();
        a.getTotalBalance();
        //a.setBalance(5000);
        a.setBalance1(2000);
    }
}