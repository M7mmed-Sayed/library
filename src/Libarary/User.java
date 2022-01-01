package Libarary;

import java.util.Scanner;

public class User extends Person {

    public final static String Password = "G_T";

    public User() {
    }
    Scanner s = new Scanner(System.in);


   
    public boolean setPassword() {
        String x;
        System.out.println("enter youer password ");
        x = s.next();
        if (x.equalsIgnoreCase(Password)) {
            return true;
        } else {
            System.out.println("youer password is not correct ");
            return false;

        }
    }
   
 public void add(Book a, Booklet b, Magazine c) {
        int d;
       
        System.out.println("Press 1 to add Book or 2 to add Booklet or 3 to add magazine");
        d = s.nextInt();
        switch (d) {
            case 1:
                a.addBook(a);
                break;
            case 2:
               b. addBooklet(b);
                break;
            case 3:
               c. addMagazine(c);
                break;
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct");

                return;

        }
    }

    
   
    public void research(Book a, Booklet b, Magazine c) {
        int d;
        System.out.println("Press 1 to research for Book or 2 to research for Booklet or 3 to research for magazine");
        d = s.nextInt();
        switch (d) {
            case 1:
                a.searchBook();
                break;
            case 2:
                b.  searchBooklet();
                break;
            case 3:
               c. searchMagazine();
                break;
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct");

                return;
        }
    }   
    public void remove(Book a, Booklet b, Magazine c) {
        int d;
        System.out.println("Press 1 to remove Book or 2 to remove Booklet or 3 to remove magazine");
        d = s.nextInt();
        switch (d) {
            case 1:
                a.removeBook();
                break;
            case 2:
               b.removeBooklet();
                break;
            case 3:
                c.removeMagazine();
                break;
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct ");

                return;
        }
    }
public void Show_All_Publications(Book a, Booklet b, Magazine c) {
        int d;
        System.out.println("Press 1 to Show all Booksor 2 "
                + "1"
                + "to Show all Booklets or 3 to Show all magazines or 4 to Show all Publications");
        d = s.nextInt();
        switch (d) {
            case 1:
                a.Show_All_Books();
                break;
            case 2:
                b.Show_All_Booklets();
                break;
            case 3:
                c.show_All_Magazines();
                break;
                case 4:
                a.Show_All_Books();
                b.Show_All_Booklets();
                c.show_All_Magazines();

                break;
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct ");

                return;
        }
    }
    

    public void userOperation(Book a, Booklet b, Magazine c) {
      
        int z;
         System.out.println("******************************************** ");
         System.out.println("*   chose one option from the follow list  *");
         System.out.println("********************************************");

        System.out.println("Press 1 to  add New publication");
        System.out.println("Press 2 to  delete publication");
        System.out.println("Press 3 to  display all publication");
        System.out.println("Press 4 to search for publication publication");
        System.out.println("Press 5 to Show All borrowed_publication");
        System.out.println("Press 6 to Show All over period borrowed_publication");

        z = s.nextInt();
        switch (z) {
            case 1:
                int e;
                do{       
                add(a, b, c);
                System.out.println("Press 1 to continues adding operation or 2 to end ");
                            e = s.nextInt();}
                while(e==1&&e!=2);
                break;
            case 2:
                 int e1;
                do{       
                remove(a,b,c);
                System.out.println("Press 1 to continues removing operation  or 2 to end ");
                            e1 = s.nextInt();}
                while(e1==1&&e1!=2);
               
                break;
            case 3:
                 int e2;
                do{       
                    Show_All_Publications(a, b, c);
                System.out.println("Press 1 to continues Showing operation or 2 to end ");
                            e2 = s.nextInt();}
                while(e2==1&&e2!=2);
               
                
                break;
            case 4:
                 int e3;
                do{       
                research(a,b,c);
                System.out.println("Press 1 to continues researching operation or 2 to end ");
                            e3 = s.nextInt();}
                while(e3==1&&e3!=2);
                break;
                case 5:
                 int e4;
                do{     
                a.Show_All_Borrowed_books();
                b.Show_All_Borrowed_Booklet();
                c.Show_All_Borrowed_magazine();
                System.out.println("Press 1 to continues  operation or 2 to end ");
                            e4 = s.nextInt();}
                while(e4==1&&e4!=2);
                break;
                case 6:
                    int e5;
                     do{   
                a.Show_All_periodBorrowed_books();
                b.Show_All_periodBorrowed_Booklet();
                c.Show_All_periodBorrowed_magazine();
                System.out.println("Press 1 to continues  operation or 2 to end ");
                            e5 = s.nextInt();}
                while(e5==1&&e5!=2);
                     break;
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct");

                return;
        }
    } 

}
