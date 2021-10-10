package week4;
public class Task_2 {
    public static void main(String[] args) {
        SeriesPrinter Printer= new SeriesPrinter();
        
        System.out.println("Frist Print: ");  //start Index=12, My School Roll Number
        Printer.printSeries(12 );
        
        System.out.println("Second Print: "); // Start Index= 12, endIndex=321, My College Roll Number
        Printer.printSeries(12,321);
        
        System.out.println("Third Print: ");  // // Start Index= 12, endIndex=321, interval Index=303, My University ID 
        Printer.printSeries(12,321,303);
        
    }
    
}
