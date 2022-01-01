
package Libarary;

import java.util.ArrayList;
import java.util.Scanner;


public class Magazine extends publications {
     private  String type ;
      public static int Number_of_copy;
            ArrayList< Magazine> magazine = new ArrayList<Magazine>(100);
             ArrayList< Borrowed_Magazine> Borrowed_magazine = new ArrayList<Borrowed_Magazine>(100);
             ArrayList< Student> sts = new ArrayList<Student>(100);
             ArrayList<Magazine>borrowmagazine =new ArrayList<Magazine>(100);
     ArrayList<Borrowed_Magazine>periodborrowmagazine =new ArrayList<Borrowed_Magazine>(100);
       Scanner s=new Scanner(System.in);

    public static int getNumber_of_copy() {
        return Number_of_copy;
    }

    public static void setNumber_of_copy(int Number_of_copy) {
        Magazine.Number_of_copy = Number_of_copy;
    }
      

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Magazine() {
    }
     public void addMagazine(Magazine b) {
        try {
             int x;
            System.out.println("enter number of Magazine ");
            x=s.nextInt();
            for(int i=0;i<x;i++)
            {b=new Magazine ();
            System.out.println("enter Magazine name");
            b.setName(s.next());
            System.out.println("enter serial number");
            b.setSerial_number(s.nextDouble());
            System.out.println("enter Number_of_copy");
            b.setNumber_of_copy(s.nextInt());
            System.out.println("enter Magazine type");
            b.setType(s.next());
            System.out.println("enter Magazine author");
            b.setName_of_author(s.next());
            System.out.println("enter number of edition");
            b.setNumber_of_edition(s.nextInt());
            magazine.add(b);
            }
        } catch (Exception e) {
            System.out.println("you Enter non Correct Value");
            return;
        }
    }
     public void removeMagazine() {
        int x;
        System.out.println("enter number of Magazine to remove ");
        x = s.nextInt();
        for (int j = 0; j < x; j++) {
            String z = new String();

            System.out.println("enter Magazine name to remove  ");
            z = s.next();

            for (int i = 0; i < magazine.size(); i++) {
                if (magazine.get(i).getName().equalsIgnoreCase(z)) {
                    magazine.remove(i);
                    return;
                }
            }
        }
        System.out.println("this Magazine is not exist already  ");

    }
      public void searchMagazine() {
         int x;
            System.out.println("enter number of magazine for searsh ");
            x=s.nextInt();
            for(int j=0;j<x;j++)
            {
        String z = new String();
        System.out.println("enter magazine name  ");
        z = s.next();
        for (int i = 0; i < magazine.size(); i++) {
            if (magazine.get(i).getName().equalsIgnoreCase(z)) {
                System.out.println(magazine.get(i).toString());
                return;
            }
        }}

        System.out.println("this magazine is not found");
    }
 public void show_All_Magazines() {

        
        for (int i = 0; i < magazine.size(); i++) {
            System.out.println(magazine.get(i).toString());
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }
public long Calc_days(Magazine b)
    {long d=0,m=0,f=0,sum=0;
    System.out.println("*  Enter start data day then month then year for borrow  *");
  b. setStartDay(s.nextInt());     
    b. setStartMonth(s.nextLong());
     b.setStartYear(s.nextLong());
    System.out.println("*  Enter end data day then month then year for borrow  *");
b.setEndtDay(s.nextLong());  
b.setEndMonth(s.nextLong());  
b.setEndYear(s.nextLong()); 
    d=(b.getEndtDay()-b.getStartDay());
    m=(b.getEndMonth()-b.getStartMonth())*30;
    f=(b.getEndYear()-b.getStartYear())*365;
    sum=d+f+m;
    b.setsummation(sum);
     if(sum<=20)borrowmagazine.add(b);
    return sum ;
    }
    public void add_Borrowed_Magazine() {
        Magazine B1 = new Magazine();
        System.out.println("* Enter magazine name *");
        B1.setName(s.next());
        boolean test = false;
        for (int i = 0; i < magazine.size(); i++) {
            if (magazine.get(i).getName().equalsIgnoreCase(B1.getName()) && magazine.get(i).Number_of_copy > 0) {
                magazine.get(i).Number_of_copy --;
                magazine.get(i).Publication_statue=true;
                test = true;
                break;
            }
        }
        if (test == false) {
            System.out.println("Sorry this magazine not available now   *");
        } 
        else {
            Student S2 = new Student();
           S2.getStudentinfo();
           sts.add(S2);
          System.out.println("**  BE CARFUL the number of days to borrow is less than 12 day  **");
          long y=Calc_days(B1);
          System.out.println(y);
        if(y <=12)
        {
            Borrowed_Magazine bb = new Borrowed_Magazine();
            bb.Adding_Magazine(B1);
            bb.Add_Student(S2);
            Borrowed_magazine.add(bb);
           System.out.println("** Note that If you return the book after the period you have specified, you will pay for each day (5)$");
        }
        else
            System.out.println("\t ##* SORY YOU ENTER UNCORRECT DATE  *##");
        return;
        }
    }
    public void Re_Borrowed_magazine()
    {   int k;
    System.out.println(" * PLEASE ENTER YIUR ID *");
    k=s.nextInt();
     for (int i = 0; i < sts.size(); i++)
     {if(sts.get(i).getId()==k){  
             System.out.println("Enter the data day then month then yesr ");
         long k1=s.nextLong();
          long k2=s.nextLong();
          long k3=s.nextLong();
          long sm=k1-borrowmagazine.get(i).getEndtDay();
          sm+=(k2-borrowmagazine.get(i).getEndMonth());
           sm+=(k3-borrowmagazine.get(i).getEndYear());
           if(sm>borrowmagazine.get(i).getsummation()){
                  periodborrowmagazine.add(Borrowed_magazine.get(i));
                   System.out.println("Plase pay the late day is   "+(sm-borrowmagazine.get(i).getsummation())*5);

           }
         Borrowed_magazine.remove(Borrowed_magazine.get(i));
     (magazine.get(i).Number_of_copy)++;
               }
         }
    }
    public void Show_All_Borrowed_magazine() {
              System.out.println("**  LIBARARY borrow list *##");
        for (int i = 0; i < Borrowed_magazine.size(); i++) {
            System.out.println(Borrowed_magazine.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
       public void Show_All_periodBorrowed_magazine() {
              System.out.println("**  LIBARARY period borrow list *##");
        for (int i = 0; i < periodborrowmagazine.size(); i++) {
            System.out.println(periodborrowmagazine.get(i).toString());
         System.out.println("---------------------------------------------------------------");
        }
    }
   
      @Override
    public String toString()
    {return "Publications Name is  "+ getName()+"\n"
            +"serial_number"+getSerial_number()+"\n"
            +"Name of author is  "+getName_of_author()+"\n"
            +"Number_of_edition  "+getNumber_of_edition()+"\n"
            +"Number_of_copy is  "+getNumber_of_copy()+"\n"
            +"Magazine type is  "+getType()+"\n";
    
    }
}
