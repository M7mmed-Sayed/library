package Libarary;
import java.util.Scanner;
public class Student extends Person {
    private String Student_edu_Stsge;
    private String stuent_conact;
    Scanner s = new Scanner(System.in);
        User u2 = new User();

    public void setStudent_edu_Stsge(String Student_edu_Stsge) {
        this.Student_edu_Stsge = Student_edu_Stsge;
    }
    public String getStudent_edu_Stsge() {
        return Student_edu_Stsge;
    }
    public void setStuent_conact(String stuent_conact) {
        this.stuent_conact = stuent_conact;
    }
    public String getStuent_conact() {
        return stuent_conact;
    }
    public void getStudentinfo() {
        System.out.println("enter Student Name   ");
        setName(s.next());
        System.out.println("enter Student Id number");
        setId(s.nextDouble());
        System.out.println("enter Student education satage");
        setStudent_edu_Stsge(s.next());
        System.out.println("enter Student conact number");
        setStuent_conact(s.next());

    }


    public void Studsnt_operation(Book a, Booklet b, Magazine c) {
        int z;
        System.out.println("Press 1 to search for publication or "
                + "2 display all publication or "
                + "3 to Borrow Publications or 4 to Reborrow");

        z = s.nextInt();
        switch (z) {
             
            case 1:
                 int e3;
                do{       
                u2.research(a,b,c);
                System.out.println("Press 1 to continues researching operation or 2 to end researching operation ");
                            e3 = s.nextInt();}
                while(e3==1&&e3!=2);
                break;
                case 2:
                 int e2;
                do{       
                   u2. Show_All_Publications(a, b, c);
                System.out.println("Press 1 to continues Showing operation or 2 to end Showing operation ");
                            e2 = s.nextInt();}
                while(e2==1&&e2!=2);
               
                
                break;
                    case 3:
                 int e;
                do{ 
                    System.out.println("if you borrow book enter (1)");
                    System.out.println("and to borrow magazine enter (2)");
                    System.out.println(" and to borrow booklet enter (3)");
                    int x=s.nextInt();
                  if(x==2) c.add_Borrowed_Magazine();
                  else if(x==1)a.add_Borrowed_Book();
                  else if(x==3)b.add_Borrowed_Booklet();
                System.out.println("Press (1) to continues Borrowing operation or (2) to end Borrowing operation  ");
                            e = s.nextInt();}
                while(e==1&&e!=2);
               
                
                break;
                case 4:
                 int j;
                do{ 
                     System.out.println("if you reborrow book enter (1)");
                    System.out.println("and to reborrow magazine enter (2)");
                    System.out.println(" and to reborrow booklet enter (3)");
                    int x=s.nextInt();
                   if(x==2)c.Re_Borrowed_magazine();
                   else if(x==1)a.Re_Borrowed_books();
                   else if(x==3)b.Re_Borrowed_Booklet();
                System.out.println("Press 1 to continues Return Borrowed operationor 2 to end Return Borrowed operationor ");
                            j = s.nextInt();}
                while(j==1&&j!=2);
               
                
                break;
           
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct");

                return;
        }

    }
}

