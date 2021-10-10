
package week.pkg3;


public class task_2 {
    
    public static void main(String[] args) {
        
        Book book1= new Book();
        
        book1.title= "Java for Beginneers "; 
        book1.author= "By Prof. David";
        book1.edition= 3;
        book1.Edition="rd";
        book1.num_of_pages= 537 ;
        book1.price= 299;
        book1.publication="Easy Coding Publications";
        book1.showInfo();

        Book book2= new Book(); 
        book2.title= "Omega point ";
        book2.author= "By Humayun Ahmed";
        book2.edition= 12;
        book2.Edition="th";
        book2.num_of_pages= 122 ;
        book2.price= 128;
        book2.publication="Shomoy Prokashoni";
        book2.showInfo();
        
        Book book3= new Book();
        
        book3.title= "Digital Fortress ";
        book3.author= "By Dan Brown";
        book3.edition= 5;
        book3.Edition="th";
        book3.num_of_pages= 356 ;
        book3.price= 520;
        book3.publication="St. Martin Press";
        book3.showInfo();
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        book1=book3;
        
        book1.edition= 1;
        book1.Edition="st";
        book3.showInfo();   
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    
    }
    
}
