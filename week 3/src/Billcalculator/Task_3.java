
package Billcalculator;


public class Task_3 {
    public static void main(String[] args) {
        BillCalculator myBillCalculator;
        myBillCalculator = new BillCalculator();
        System.out.println("25 unit="+myBillCalculator.getTotalBill(25)+"TK");
        System.out.println("250 unit="+myBillCalculator.getTotalBill(250)+"TK");
        System.out.println("812 unit="+myBillCalculator.getTotalBill(812)+"TK");
        
    }
    
}
