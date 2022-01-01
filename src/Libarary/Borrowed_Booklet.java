
package Libarary;
public class Borrowed_Booklet extends publications {
    private Booklet a;
   private Student s;
   public void Adding_Booklet(Booklet k)
   {
       a=k;
   }
   public void Add_Student(Student l)
   {
       s=l;
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
