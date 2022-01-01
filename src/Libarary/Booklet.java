package Libarary;

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
          ArrayList<Borrowed_Booklet>borrowed_booklet =new ArrayList<Borrowed_Booklet>(100);
            ArrayList<Booklet>borrowbooklet =new ArrayList<Booklet>(100);
     ArrayList<Borrowed_Booklet>periodborrowbooklet =new ArrayList<Borrowed_Booklet>(100);
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
             System.out.println("\t** BOOKLET ADDING LIST *##");
            System.out.println("* Pleaseenter number of booklet you will add  * ");
            x=s.nextInt();
            for(int i=0;i<x;i++)
            {b=new Booklet ();
            System.out.println(" enter booklet name ");
            b.setName(s.next());
            System.out.println("Enter booklet serial number ");
            b.setSerial_number(s.nextDouble());
            System.out.println(" Enter number_of_booklet_copy * ");
            b.setNumber_of_copy(s.nextInt());
          //  System.out.println("4 - * enter Booklet type");
           // b.setType(s.next());
            System.out.println("Enter booklet author *");
            b.setName_of_author(s.next());
            System.out.println("Enter number of booklet edition *");
            b.setNumber_of_edition(s.nextInt());
            booklet.add(b);
             System.out.println("* BOOKLET ADD SUCCESSFULLY * ");
            }
        } catch (Exception e) {
            System.out.println("** Sorry you enter UNCORRECT INFORMATION  **");
            return;
        }
    }
    public void removeBooklet() {
        int x;
         System.out.println("**  BOOKLET REMOVING LIST *  ");
            System.out.println("* Enter number of booklet you will remove  * ");
            x=s.nextInt();
            for(int j=0;j<x;j++)  {
        String z = new String();
        System.out.println("* Enter booklet name to remove * ");
        z = s.next();
        for (int i = 0; i < booklet.size(); i++) {
            if (booklet.get(i).getName().equalsIgnoreCase(z)) {
                booklet.remove(i);
                 System.out.println("**  BOOKLET REMOVE SUCCESSFULLY  **");
                return;
                   }
               }
           }
        System.out.println("**  Sorry this booklet not exist  ** ");
    }
    public void searchBooklet() {
         int x;
          System.out.println("\t ##* BOOKLET SEARCH LIST *## ");
            System.out.println(" * Enter number of booklet to search * ");
            x=s.nextInt();
            for(int j=0;j<x;j++) {
        String z = new String();
        System.out.println("* Enter booklet name * ");
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
     public long Calc_days(Booklet b) {
        long d=0,m=0,f=0,sum=0;
    System.out.println("*  Enter start data day then month then yesr for borrow  *");
  b. setStartDay(s.nextInt());     
    b. setStartMonth(s.nextLong());
      b.setStartYear(s.nextLong());  
    System.out.println("*  Enter end data day then month then yesr for borrow  *");
     b.setEndtDay(s.nextLong());  
    b.setEndMonth(s.nextLong());  
    b.setEndYear(s.nextLong()); 
    d=(b.getEndtDay()-b.getStartDay());
    m=(b.getEndMonth()-b.getStartMonth())*30;
    f=(b.getEndYear()-b.getStartYear())*365;
    sum=d+f+m;
     b.setsummation(sum);
    if(sum<=12)borrowbooklet.add(b);
    return sum;
    }
         public void add_Borrowed_Booklet() {
        Booklet B1 = new Booklet();
        System.out.println("* Enter booklet name *");
        B1.setName(s.next());
        boolean test = false;
        for (int i = 0; i < booklet.size(); i++) {
            if (booklet.get(i).getName().equalsIgnoreCase(B1.getName()) && booklet.get(i).Number_of_copy > 0) {
                booklet.get(i).Number_of_copy --;
                booklet.get(i).Publication_statue=true;
                test = true;
                break;
            }
        }
        if (test == false) {
            System.out.println("Sorry this booklet not available now   *");
        } 
        else {
            Student S2 = new Student();
           S2.getStudentinfo();
           st.add(S2);
          System.out.println("\t ##* BE CARFUL THE NUMBER OF DAYS TO BORROW IS LESS THAN 20 BAYS *##");
          long y=Calc_days(B1);
          System.out.println(y);
        if(y <=12)
        {
            Borrowed_Booklet bb = new Borrowed_Booklet();
            bb.Adding_Booklet(B1);
            bb.Add_Student(S2);
            borrowed_booklet.add(bb);
            System.out.println("** Note that If you return the book after the period you have specified, you will pay for each day (5)$");
        }
        else
            System.out.println("**  Sorry you enter  UNCORRECT DATE   *");
        return;
        }
    }
    public void Re_Borrowed_Booklet()
    {   int k;
    System.out.println(" * PLEASE ENTER YIUR ID *");
    k=s.nextInt();
     for (int i = 0; i < st.size(); i++)
     {if(st.get(i).getId()==k){   
          System.out.println("Enter the data day then month then yesr to reborrowed");
         long k1=s.nextLong();
          long k2=s.nextLong();
          long k3=s.nextLong();
          long sm=k1-borrowbooklet.get(i).getEndtDay();
          sm+=(k2-borrowbooklet.get(i).getEndMonth());
           sm+=(k3-borrowbooklet.get(i).getEndYear());
           if(sm>borrowbooklet.get(i).getsummation()){
                  periodborrowbooklet.add(borrowed_booklet.get(i));
               System.out.println("Plase pay the late day "+(sm-borrowbooklet.get(i).getsummation())*5);
           }
         borrowed_booklet.remove(borrowed_booklet.get(i));
     (booklet.get(i).Number_of_copy)++;
               }
         }
    }
    public void Show_All_Borrowed_Booklet() {
                      System.out.println("** LIBARARY borrow list booklet *##");
        for (int i = 0; i < borrowed_booklet.size(); i++) {
            System.out.println(borrowed_booklet.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
      public void Show_All_periodBorrowed_Booklet() {
                      System.out.println("** LIBARARY reborrow list booklet *##");
        for (int i = 0; i < periodborrowbooklet.size(); i++) {
            System.out.println(periodborrowbooklet.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
   
      @Override
    public String toString()
    {return "1 - * BOOKLET NAME IS * !!  "
            + getName()+"\n"+
            "2 - * BOOKLET SERIAL NUMBER * !! "+getSerial_number()+"\n"
            +"3 - *BOOKLET AUTHOR NAME * !!  "+getName_of_author()+"\n"
            +"4 - * BOOKLET_EDITION_NUMBER * !!  "+getNumber_of_edition()+"\n"
            +"5 - * BOOKLET_COPY_NUMBER * !! Number_of_copy is  "+getNumber_of_copy()+"\n"+
            "Booklet type is  "+getType()+"\n";
    
    }
}
