
package fun;

import java.util.ArrayList;
import java.util.Scanner;


public class Magazine extends publications {
     private  String type ;
      public static int Number_of_copy;
            ArrayList< Magazine> magazine = new ArrayList<Magazine>(100);
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
        System.out.println("enter Booklet name  ");
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

   
      @Override
    public String toString()
    {return "Publications Name is  "+ getName()+"\n"+"serial_number"+getSerial_number()+"\n"+"Name of author is  "+getName_of_author()+"\n"+"Number_of_edition  "+getNumber_of_edition()+"\n"+"Number_of_copy is  "+getNumber_of_copy()+"\n"+"Magazine type is  "+getType()+"\n";
    
    }
}
