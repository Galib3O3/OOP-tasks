package week4;
public class SeriesPrinter {
    public void printSeries(int n) {
        for(int i=0; i<=n; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
    public void printSeries(int startIndex, int endIndex){
    for(int i=startIndex; i<=endIndex; i++)
{
    System.out.print(i+" ");
}
 System.out.println(" ");
}
 public void printSeries(int startIndex, int endIndex,int interval){
    for(int i =startIndex; i<=endIndex; i+=interval)
{
    System.out.print(i+" ");
}
 System.out.println(" ");
}    
}

