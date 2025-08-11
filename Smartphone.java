public class Smartphone {
    private String model;
    private String brand;
    private double price;

    public Smartphone(String model,String brand,double price){
        this.model = model;
        this.brand = brand;
        this.price = price;
    }
    public void applydiscount(double discountpercentage){
        this.price -= this.price*(discountpercentage/100);
    }
    //the below method tells us that we can pass the objects as a parameters
    public void comparePrice(Smartphone otherSmartphone){
        if (this.price< otherSmartphone.price){
            System.out.println(this.model+" is cheaper than the "+otherSmartphone.model);
        }else if(this.price > otherSmartphone.price){
            System.out.println(this.model+" is costlier than the "+otherSmartphone.model);
        }else {
            System.out.println("both are of the same in terms of the price");
        }
    }
    public void display(){
        System.out.println("MODEL: "+model);
        System.out.println("BRAND: "+brand);
        System.out.println("PRICE: "+price);
    }
    public static void main(String[] args){
        Smartphone phone1 = new Smartphone("iphone16","apple",88000);
        Smartphone phone2 = new Smartphone("nord15","OnePlus",48000);

        phone1.applydiscount(16);

        phone2.comparePrice(phone1);
        phone2.display();
        phone1.display();
    }
}
