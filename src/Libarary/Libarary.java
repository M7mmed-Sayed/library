
package Libarary;

import java.util.Scanner;
public class Libarary {
    User u1 = new User();
    Student s1=new Student();
     Scanner s = new Scanner(System.in);
    


    public void test_Person(Book a, Booklet b, Magazine c) 
    {
        int x,B;
        System.out.println("(1) - student ");
        System.out.println("(2) - libarary_User ");
        x = s.nextInt();
        switch (x) {
            
            case 1:
                int K1;
                 do { 
                            s1.Studsnt_operation(a,b,c);
                            System.out.println("(1) - to continues as Student ");
                                   System.out.println("(2) - to end Student accessing");
                            K1 = s.nextInt();

                        } while (K1== 1 && K1!= 2);
                        break;
                
            case 2:

                int K;
                do {
               
                    if (u1.setPassword()) {
                        do { 
                            u1.userOperation(a,b,c);
                            System.out.println("(1) - to continues as User");
                            System.out.println(" (2) - to end user");
                            B = s.nextInt();

                        } while (B == 1 && B != 2);
                        break;
                    }
                    System.out.println("(1) -  repeat enter password");
                    System.out.println("(2) -  end user");
                    K = s.nextInt();
                } while (K == 1 && K != 2);
               break;
            default:
                System.out.println("you enter incorrect nubmer ");
                return;

        }

    }
     public void RunSystem(Book a, Booklet b, Magazine c) {
        int a1;

        do {
         
            test_Person(a,b,c);

            System.out.println("Press 0 to return to the muniue or 7 to close the programe");
            a1= s.nextInt();
        } while (a1 == 0 && a1!= 7);
    }


}
