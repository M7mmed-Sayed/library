package fun;

import java.util.ArrayList;
import java.util.Scanner;

public class Book extends publications {
    private String type="BOOK";
    
    public Book() {
    }
    ArrayList< Book> book = new ArrayList<Book>(100);
    ArrayList< Borrowed_Book> Borrowed_book = new ArrayList<Borrowed_Book>(100);
        ArrayList< Student> st = new ArrayList<Student>(100);
    Scanner s = new Scanner(System.in);

    public static int getNumber_of_copy() {
        return Number_of_copy;
    }
    public static void setNumber_of_copy(int Number_of_copy) {
        Book.Number_of_copy = Number_of_copy;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void addBook(Book b) {
        try {
            int x;
            System.out.println("****** PLEASE ENTER NUMBER OF BOOKS THAT YOU WILL ADD ");
            x = s.nextInt();
            for (int i = 0; i < x; i++) {
                b = new Book();
                System.out.println("ADD INFORMATION OF BOOK   "+(i+1));
                System.out.println("***** ENTER BOOK NAME  * ");
                b.setName(s.next());
                System.out.println("***** ENTER SERIAL _ NUMBER  *");
                b.setSerial_number(s.nextDouble());
                System.out.println("***** ENTER NUMBER _ OF _ COPY * ");
                Book.setNumber_of_copy(s.nextInt());     //WHY
             //   System.out.println("4 - enter Publications type");
         //       b.setType(s.next());
                System.out.println("***** ENTER BOOK AUTHOR * ");
                b.setName_of_author(s.next());
                System.out.println("*****ENTER NUMBER OF EDITION *");
                b.setNumber_of_edition(s.nextInt());
                book.add(b);
            }
        } catch (Exception e) {
            System.out.println(" ### SORY YOU ENTER UNCORRECT VALUE ### ");
            return;
        }
    }
    public void removeBook() {
        int x;
        System.out.println(" ### PLEASE ENTER NUMBER OF BOOKS YOU WANT TO REMOVE ### ");
        x = s.nextInt();
        for (int j = 0; j < x; j++) {
            String z = new String();
            System.out.println(" * ENTER NAME OF BOOK TO REMOVE *");
            z = s.next();
            for (int i = 0; i < book.size(); i++) {
                if (book.get(i).getName().equalsIgnoreCase(z)&&book.get(i).Publication_statue==false) {          //equalsIgnoreCase //i dont know
                    book.remove(i);
                    return;
                }
            }
        }
        System.out.println("### THIS BOOK IS NOT EXIST MAYBE AN STUDANT TAKE IT ### ");
    }
    public void searchBook() {
        int x;
        System.out.println(" * ENTER NUMBER OF BOOKS YOU WANT TO LOOK FOR *");
        x = s.nextInt();
        for (int j = 0; j < x; j++) {
            String z = new String();
            System.out.println("* ENTER BOOK NAME * ");
            z = s.next();
            for (int i = 0; i < book.size(); i++) {
                if (book.get(i).getName().equalsIgnoreCase(z)) {
                    System.out.println(book.get(i).toString());
                    //return;                  //more
                }
            }
        }
        System.out.println("\t ### SO SORY THIS BOOK NOT FOUND ###");
    }
    public void Show_All_Books() {
          System.out.println("** LIBARARY BOOK LIST **");
        for (int i = 0; i < book.size(); i++) {
            System.out.println("## BOOK NUMBER "+"* "+(i+1)+" *");
            System.out.println();
            System.out.println(book.get(i).toString());
            System.out.println("******************************************");
         //   System.out.println("----------------------------------------------------------");
        }
    }
public long Calc_days(Book b)
    {long d=0,m=0,f=0,sum=0;
    System.out.println(" * PLEAE ENTER THE START DAY FOR BORRW *");
  b. setStartDay(s.nextInt());     

    System.out.println(" * PLEAE ENTER THE START MONTH FOR BORRW *");
    b. setStartMonth(s.nextLong());
     
    System.out.println(" * PLEAE ENTER THE START YEAR FOR BORRW *");
     b.setStartYear(s.nextLong());  
    System.out.println(" * PLEAE ENTER THE END DAY FOR BORRW *");
b.setEndtDay(s.nextLong());  

    System.out.println(" * PLEAE ENTER THE END MONTH FOR BORRW *");
b.setEndMonth(s.nextLong());  

    System.out.println(" * PLEAE ENTER THE END YEAR FOR BORRW *");
b.setEndYear(s.nextLong()); 
    d=(b.getEndtDay()-b.getStartDay());
    
    m=(b.getEndMonth()-b.getStartMonth())*30;
    f=(b.getEndYear()-b.getStartYear())*365;
    sum=d+f+m;
    System.out.println("\t ## *YOU WILL TAKE THIS BOOK  ENJOY YOUR TIME WITH READING * ##");
   System.out.println("YOU WILL TAKE THIS BOOK FOR NEXT DAYS  "); return sum ;
    }
    public void add_Borrowed_Book() {
        Book B1 = new Book();
        System.out.println("* ENTER BOOK NAME *");
        B1.setName(s.next());
        boolean test = false;
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getName().equalsIgnoreCase(B1.getName()) && book.get(i).Number_of_copy > 0) {
                book.get(i).Number_of_copy --;
                book.get(i).Publication_statue=true;
                test = true;
                break;
            }
        }
        if (test == false) {
            System.out.println("\t ## *SO SORY THIS BOOK NOT AVALIABLE NOW *##");
        } 
        else {
            Student S2 = new Student();
           S2.getStudentinfo();
           st.add(S2);
          System.out.println("\t ##* BE CARFUL THE NUMBER OF DAYS TO BORROW IS LESS THAN 20 BAYS *##");
          long y=Calc_days(B1);
          System.out.println(y);
        if(y <=20)
        {
            Borrowed_Book bb = new Borrowed_Book();
            bb.Add_Book(B1);
            bb.Add_Student(S2);
            Borrowed_book.add(bb);}
        else
            System.out.println("\t ##* SORY YOU ENTER UNCORRECT DATE  *##");
        return;
        }
    }
    public void Re_Borrowed_books()
    {   int o;
    System.out.println(" * PLEASE ENTER YIUR ID *");
    o=s.nextInt();
     for (int i = 0; i < st.size(); i++)
     {if(st.get(i).getId()==o){   
         Borrowed_book.remove(Borrowed_book.get(i));
     (book.get(i).Number_of_copy)++;
               }
         }
    }
    public void Show_All_Borrowed_books() {
        for (int i = 0; i < Borrowed_book.size(); i++) {
              System.out.println("\t ##* LIBARARY BORROW LIST *##");
            System.out.println(Borrowed_book.get(i).toString());
            System.out.println("*******************************************");
         //   System.out.println("---------------------------------------------------------------");
        }
    }
    @Override
    public String toString() {
        return "1 - Book Name is !!  " + getName() + "\n" + "2 - Book serial_number !! " + getSerial_number() + "\n" + "3 - Name of author is !!  " + getName_of_author() + "\n" + "4 - Number_of_edition !!  " + getNumber_of_edition() + "\n" + "5 - Number_of_copy is !!  " + getNumber_of_copy() + "\n" + "6 - Book type is !! " + getType() + "\n";
    }
}
