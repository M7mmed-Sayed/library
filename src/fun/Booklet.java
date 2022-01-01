package fun;

import java.util.ArrayList;
import java.util.Scanner;

public class Booklet extends publications {
    private  String type ;
     public static int Number_of_copy;

    public static int getNumber_of_copy() {
        return Number_of_copy;
    }
          ArrayList< Booklet> booklet = new ArrayList<Booklet>(100);
          ArrayList< Student> st = new ArrayList<Student>(100);

          Scanner s=new Scanner(System.in);

    public static void setNumber_of_copy(int Number_of_copy) {
        Booklet.Number_of_copy = Number_of_copy;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Booklet() {
    }
    public void addBooklet(Booklet b) {
        try { 
             int x;
             System.out.println("\t ##* BOOKLET ADDING LIST *##");
            System.out.println("* PLEASE ENTER NUMBER OF BOOKLETS YOU WII ADD * ");
            x=s.nextInt();
            for(int i=0;i<x;i++)
            {b=new Booklet ();
            System.out.println("1 - * ENTER BOOKLET NAME *");
            b.setName(s.next());
            System.out.println("2 - * ENTER BOOKLET SERIAL_NUMBER *");
            b.setSerial_number(s.nextDouble());
            System.out.println("3 - * ENTER NUMBER_OF_BOOKLET_COPY * ");
            b.setNumber_of_copy(s.nextInt());
          //  System.out.println("4 - * enter Booklet type");
           // b.setType(s.next());
            System.out.println("4 - * ENTER BOOKLET AUTHOR *");
            b.setName_of_author(s.next());
            System.out.println("5 - * ENTER NUMBER OF BOOKLET EDITION *");
            b.setNumber_of_edition(s.nextInt());
            booklet.add(b);
             System.out.println("\t ##* BOOKLET ADD SUCCESSFULLY ");
            }
        } catch (Exception e) {
            System.out.println("\t ##* SORY YOU ENTER UNCORRECT INFORMATION *## ");
            return;
        }
    }
    public void removeBooklet() {
        int x;
         System.out.println("\t ##* BOOKLET REMOVING LIST *## ");
            System.out.println("* ENTER NUMBER OF BOOKLETS YOU WILL REMOVE * ");
            x=s.nextInt();
            for(int j=0;j<x;j++)  {
        String z = new String();
        System.out.println("* ENTER BOOKLET NAME TO REMOVE * ");
        z = s.next();
        for (int i = 0; i < booklet.size(); i++) {
            if (booklet.get(i).getName().equalsIgnoreCase(z)) {
                booklet.remove(i);
                 System.out.println("\t##* BOOKLET REMOVE SUCCESSFULLY *## ");
                return;
                   }
               }
           }
        System.out.println("\t ##* SORY THIS BOOKLET IS NOT EXIST *## ");
    }
    public void searchBooklet() {
         int x;
          System.out.println("\t ##* BOOKLET SEARCH LIST *## ");
            System.out.println(" * ENTER NUMBER OF BOOKLETS TO SEARCH * ");
            x=s.nextInt();
            for(int j=0;j<x;j++) {
        String z = new String();
        System.out.println("* ENTER BOOKLET NAME * ");
        z = s.next();
        for (int i = 0; i < booklet.size(); i++) {
            if (booklet.get(i).getName().equalsIgnoreCase(z)) {
                System.out.println(booklet.get(i).toString());
                return;
                 }
               }
            }
        System.out.println("\t ##* SORY THIS BOOKLET NOT FOUND *##");
    }
     public void Show_All_Booklets() {
          System.out.println("\t ##* LIBARARY BOOKLETS LIST *## ");
        for (int i = 0; i < booklet.size(); i++) {
            System.out.println(booklet.get(i).toString());
            System.out.println("*****************************************");
          //  System.out.println("-------------------------------------------------------------------------------------");
        }
     }
     public long Calc_days(Magazine b) {
        long d=0,m=0,f=0,sum=0;
    System.out.println("* ENTER START DAY FOR BORROW * ");
  b. setStartDay(s.nextInt());     

    System.out.println("* ENTER START MONTH FOR BORROW * ");
    b. setStartMonth(s.nextLong());
     
    System.out.println("* ENTER START YEAR FOR BORROW * ");
     b.setStartYear(s.nextLong());  
    System.out.println("* ENTER END DAY FOR BORROW * ");
b.setEndtDay(s.nextLong());  

    System.out.println("* ENTER END MONTH FOR BORROW *");
b.setEndMonth(s.nextLong());  

    System.out.println("* ENTER END YEAR FOR BORROW * ");
b.setEndYear(s.nextLong()); 
    d=(b.getEndtDay()-b.getStartDay());
    m=(b.getEndMonth()-b.getStartMonth())*30;
    f=(b.getEndYear()-b.getStartYear())*365;
    sum=d+f+m;
    return sum;
    }
      @Override
    public String toString()
    {return "1 - * BOOKLET NAME IS * !!  "+ getName()+"\n"+"2 - * BOOKLET SERIAL NUMBER * !! "+getSerial_number()+"\n"+"3 - *BOOKLET AUTHOR NAME * !!  "+getName_of_author()+"\n"+"4 - * BOOKLET_EDITION_NUMBER * !!  "+getNumber_of_edition()+"\n"+"5 - * BOOKLET_COPY_NUMBER * !! Number_of_copy is  "+getNumber_of_copy()+"\n";
//+"Booklet type is  "+getType()+"\n";
    
    }
}
