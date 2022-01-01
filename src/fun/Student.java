package fun;
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
        System.out.println("Press 1 to search for publication or 2 display all publication or 3 to Borrow Publications ");

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
                   a. add_Borrowed_Book();
                System.out.println("Press 1 to continues Borrowing operation or 2 to end Borrowing operation  ");
                            e = s.nextInt();}
                while(e==1&&e!=2);
               
                
                break;
                case 4:
                 int j;
                do{       
                   a.Re_Borrowed_books();
                System.out.println("Press 1 to continues Return Borrowed Book operationor 2 to end Return Borrowed Book operationor ");
                            j = s.nextInt();}
                while(j==1&&j!=2);
               
                
                break;
           
            default:
                System.out.println("this  nubmer you entered to do an operation is not correct");

                return;
        }

    }}

    

   

//public void add_Borrowed_Book() {
//        
//            Book B1=new Book();
//            System.out.println("enter book name");
//            System.out.println(book.size());
//            B1.setName(s.next());
//            
//            boolean check=false;
//            for (int i = 0; i < book.size(); i++) {
//                if (book.get(i).getName()==(B1.getName()) && book.get(i).Number_of_copy > 0) {
//                    
//                    book.get(i).Number_of_copy--;
//                    check =true ;
//                    break;
//                  
//                }}
//                if(check==false)
//                {
//                    System.out.println("this Book not avaliable now");
//                }
//                else
//                {
//                    Student S2=new Student();
//           
//            System.out.println("enter Student name");
//            S2.setName(s.next());
//             System.out.println("enter Student id");
//            S2.setId(s.nextDouble());
//            System.out.println("enter Student eduction");
//            S2.setStudent_edu_Stsge(s.next());
//            System.out.println("enter Student contact");
//            S2.setStuent_conact(s.next());
//            Borrowed_Book bb=new Borrowed_Book();
//            bb.Add_Book(B1);
//            bb.Add_Student(S2);
//            Borrowed_book.add(bb);
//                    
//                    
//            }
//
//        
//    }
