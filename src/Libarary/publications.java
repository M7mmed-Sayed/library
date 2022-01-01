
package Libarary;

import java.util.Scanner;


public abstract class publications {
     private String Name;
    private String Name_of_author ;
    private int Number_of_edition ;
    private double serial_number ;
   public static int Number_of_copy ;
    boolean Publication_statue=false ;
   private long startDay,startMonth,startYear,endtDay,endMonth,endYear,summation ;
    Scanner s=new Scanner(System.in);
    public publications() {
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getName_of_author() {
        return Name_of_author;
    }
    public void setName_of_author(String Name_of_author) {
        this.Name_of_author = Name_of_author;
    }
    public int getNumber_of_edition() {
        return Number_of_edition;
    }

    public void setNumber_of_edition(int Number_of_edition) {
        this.Number_of_edition = Number_of_edition;
    }

    public double getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(double serial_number) {
        this.serial_number = serial_number;
    }      
  //  public abstract String toString();
    public long getStartDay() {
        return startDay;
    }
    public void setStartDay(long startDay) {
         this.startDay = startDay;
    }
    public long getStartMonth() {
         return startMonth;
    }
    public void setStartMonth(long startMonth) {
         this.startMonth = startMonth;
    }
    public long getStartYear() {
        return startYear;
    }
    public void setStartYear(long startYear) {
        this.startYear = startYear;
    }
    public long getEndtDay() {
        return endtDay;
    }
    public void setEndtDay(long endtDay) {
        this.endtDay = endtDay;
    }
    public long getEndMonth() {
        return endMonth;
    }
    public void setEndMonth(long endMonth) {
        this.endMonth = endMonth;
    }
    public long getEndYear() {
        return endYear;
    }
    public void setEndYear(long endYear) {
        this.endYear = endYear;
    }
      public long getsummation() {
        return endYear;
    }
    public void setsummation(long endYear) {
        this.endYear = endYear;
    }
 
}
