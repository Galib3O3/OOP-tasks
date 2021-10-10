
package Billcalculator;

public class BillCalculator {
    
    double calculateBasicBill(double unit)
    {
         double result=0;
        if(unit<=199)
        {
         result=unit*1.20;
       }
    else if(unit>=200 && unit<400)
    {
        result=unit*1.80;
        
    }
    else if (unit>=600)
    {
        result=unit*2.80;
    }
    return result;
}
 double calculateSurch(double basicBill)
{
double charged=0;
if(basicBill>400)
{
    charged=(15*basicBill)/100;
}
else
{
    charged=0;
    
}
return charged ;
}
   double gotTotalBillBill(double unit)
   {
       double a= calculateBasicBill(unit);
       double b= calculateSurcharge(a);
       if(a+b<100)
       {
           return 100;
       }
       else
       {
           return a+b;
      }
   }
    }
 }



