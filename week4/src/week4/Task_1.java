package week4;
public class Task_1 {
    public static void main(String[] args) {
        //<----------------Frist SmartPhone--------------->//
        Smartphone phone1 = new Smartphone();
        System.out.println("Xiaomi Redmi Note 7 PRO");
        System.out.println("Battery life->"+phone1.battery_life+" mAh");
        System.out.println("Display->"+phone1.display);
        System.out.println("Chipset->"+phone1.Chipset);
        System.out.println("");
        
        //<----------------Second SmartPhone--------------->//
        Smartphone phone2 = new Smartphone(4100,"5.0 Inch IPS Display","Snapdragon 435");
        System.out.println("Xiaomi Redmi 4X");
        System.out.println("Battery life->"+phone2.battery_life+"mAh");
        System.out.println("Display->"+phone2.display);
        System.out.println("Chipset->"+phone2.Chipset);
        System.out.println("");
        
        //<----------------Third SmartPhone--------------->//
        Smartphone phone3 = new Smartphone(4500,"6.55 Fluid AMOLED, 120Hz","Snapdragon 865 5G");
        System.out.println("OnePlus 8T");
        System.out.println("Battery life->"+phone3.battery_life+"mAh");
        System.out.println("Display->"+phone3.display);
        System.out.println("Chipset->"+phone3.Chipset);
    }
}
