
package fun;


public class Borrowed_Book extends publications {
   private Book a;
   private Student s;
   public void Add_Book(Book s)
   {
       a=s;
   }
   public void Add_Student(Student a)
   {
       s=a;
   }
   @Override
    public String toString() {
return "Publications Name is  "+ 
        a.getName()+"\n"+"studnet name is  "+
        s.getName()+"\n"+"Student Id is "+
        s.getId()+"\n"+"student education is  "+
        s.getStudent_edu_Stsge()+"\n"+"student contact is  "+
        s. getStuent_conact()+"\n"+"Borrow data is "+
        a.getStartDay()+"\\"+
        a.getStartMonth()+"\\"+
        a.getStartYear()+"\n"+
        "return data is "+a.getEndtDay()+
        "\\"+a.getEndMonth()+"\\"+
        a.getEndYear()+"\n";   
    }
    
    
    
}
