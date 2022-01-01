
package fun;
import java .util.Scanner;
 class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Book b =new Book();
       Magazine b1 =new Magazine();
        Booklet b2 =new Booklet();


        Libarary l1=new Libarary();
        l1.RunSystem(b,b2,b1);
        
    }
    
}
