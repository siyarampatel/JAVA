/*Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
method to display them*/

class laptop{
    String brand;
    String ram;
    int price;
    laptop(String s,String d,int p){
        brand=s;
        ram=d;
        price=p;
    }
    void display(){
        System.out.println(brand);
        System.out.println(ram);
        System.out.println(price);

    }
}
class practice{
    public static void main(String[]args){
        laptop l = new laptop("Lenovo","16GB",45000);
        l.display();
    }
}