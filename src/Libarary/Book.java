package Libarary;

import java.util.ArrayList;
import java.util.Scanner;

public class Book extends publications {
    private String type="BOOK";
    
    public Book() {
    }
    ArrayList< Book> book = new ArrayList<Book>(100);
    ArrayList< Borrowed_Book> Borrowed_book = new ArrayList<Borrowed_Book>(100);
     ArrayList< Student> st = new ArrayList<Student>(100);
     ArrayList<Book>borrowbook =new ArrayList<Book>(100);
     ArrayList<Borrowed_Book>periodborrowbook =new ArrayList<Borrowed_Book>(100);

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
            System.out.println("********** Please enter number of books thit you will add ");
            x = s.nextInt();
            for (int i = 0; i < x; i++) {
                b = new Book();
                System.out.println("Add information of book   "+(i+1));
                System.out.println("*  Enter book name * ");
                b.setName(s.next());
                System.out.println("*  Enter seral_number  *");
                b.setSerial_number(s.nextDouble());
                System.out.println("*  Enter number _of_ copy  *");
                Book.setNumber_of_copy(s.nextInt());     
                System.out.println("*  Enter book Author  *");
                b.setName_of_author(s.next());
                System.out.println("*  Enter number of edition  *");
                b.setNumber_of_edition(s.nextInt());
                book.add(b);
            }
        } catch (Exception e) {
            System.out.println("  UNCORRECT VALUE  be careful in the next step    ");
            return;
        }
    }
    public void removeBook() {
        int x;
        System.out.println("******** Enter number of books you want to remove ");
        x = s.nextInt();
        for (int j = 0; j < x; j++) {
            String z = new String();
            System.out.println("*  Enter name of book to remove  *");
            z = s.next();
            for (int i = 0; i < book.size(); i++) {
                if (book.get(i).getName().equalsIgnoreCase(z)&&book.get(i).Publication_statue==false) {          //equalsIgnoreCase //i dont know
                    book.remove(i);
                    return;
                }
            }
        }
        System.out.println("** Sorry  this book is not exist maybe an student take it");
    }
    public void searchBook() {
        int x;
        System.out.println(" ****** Enter number of books you want to look for *");
        x = s.nextInt();
        for (int j = 0; j < x; j++) {
            String z = new String();
            System.out.println("*  Enter book name  * ");
            z = s.next();
            for (int i = 0; i < book.size(); i++) {
                if (book.get(i).getName().equalsIgnoreCase(z)) {
                    System.out.println(book.get(i).toString());
                    //return;                  //more
                }
            }
        }
        System.out.println("** Sorry this book not found at present ");
    }
    public void Show_All_Books() {
          System.out.println("****   <<LIBARARY BOOK LIST>>   ***");
        for (int i = 0; i < book.size(); i++) {
            System.out.println("** Book number  *"+(i+1)+" *");
            System.out.println();
            System.out.println(book.get(i).toString());
         System.out.println("----------------------------------------------------------");
        }
    }
public long Calc_days(Book b)
    {long d=0,m=0,f=0,sum=0;
    System.out.println("*  Enter start  data day then month then yesr for borrow  *");
      b.setStartDay(s.nextInt());     
      b.setStartMonth(s.nextLong());
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
    if(sum<=20)borrowbook.add(b);
    return sum ;
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
            System.out.println("**   Sorry this book not Available now **");
        } 
        else {
            Student S2 = new Student();
           S2.getStudentinfo();
           st.add(S2);
          System.out.println("**  BE CARFUL the number of days to borrow is less than 20 day  **");
          long y=Calc_days(B1);
          System.out.println(y);
        if(y <=20)
        {
            Borrowed_Book bb = new Borrowed_Book();
            bb.Add_Book(B1); 
            bb.Add_Student(S2);
            Borrowed_book.add(bb);
           System.out.println("** Note that If you return the book after the period you have specified, you will pay for each day (5)$");
        }
        else
            System.out.println("** Sorry you entered UNCORRECT DATE  **");
        return;
        }
    }
    public void Re_Borrowed_books()
    {   int k;
    System.out.println(" * PLEASE ENTER YIUR ID *");
    k=s.nextInt();
     for (int i = 0; i < st.size(); i++)
     {if(st.get(i).getId()==k){
         System.out.println("Enter the data day then month then yesr to reborrowed");
         long k1=s.nextLong();
          long k2=s.nextLong();
          long k3=s.nextLong();
          long sm=k1-borrowbook.get(i).getEndtDay();
          sm+=(k2-borrowbook.get(i).getEndMonth());
           sm+=(k3-borrowbook.get(i).getEndYear());
           if(sm>borrowbook.get(i).getsummation()){
                  periodborrowbook.add(Borrowed_book.get(i));
               System.out.println("Plase pay the late day "+(sm-borrowbook.get(i).getsummation())*5);
           }
           Borrowed_book.remove(Borrowed_book.get(i));
     (book.get(i).Number_of_copy)++;
               }
         }
    }
    public void Show_All_Borrowed_books() {
                      System.out.println("**  LIBARARY borrow list  book **");
        for (int i = 0; i < Borrowed_book.size(); i++) {
            System.out.println(Borrowed_book.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
      public void Show_All_periodBorrowed_books() {
                 System.out.println("**  LIBARARY period Borrow list book**");
        for (int i = 0; i < periodborrowbook.size(); i++) {
            System.out.println(periodborrowbook.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
    @Override
    public String toString() {
        return "1 - Book Name is !!  " + getName() + "\n" + 
                "2 - Book serial_number !! " + getSerial_number() + "\n" +
                "3 - Name of author is !!  " + getName_of_author() + "\n" + 
                "4 - Number_of_edition !!  " + getNumber_of_edition() + "\n" +
                "5 - Number_of_copy is !!  " + getNumber_of_copy() + "\n" + 
                "6 - Book type is !! " + getType() + "\n";
    }
}
