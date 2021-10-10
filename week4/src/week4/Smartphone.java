package week4;
public class Smartphone {
    int battery_life;
    String display, Chipset;
    Smartphone(){
        battery_life= 4100;
        display = "6.3 Inch IPS Display"; 
        Chipset = "Snapdragon 675";
    }
    Smartphone(int battery_life, String display, String Chipset)
    {
      this.battery_life= battery_life;
      this.display = display;
      this.Chipset = Chipset;
    }
}
