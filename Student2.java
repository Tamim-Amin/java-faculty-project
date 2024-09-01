
package august19th;

import java.util.Scanner;

public class Student2 {
    private String name;
    private double average;
    
    public Student2(String name,double average)
    {
       this.name=name;
       
       if(average>0.0)
           if(average<=100.0)
               this.average=average;
    }
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAverage(double studentAverage){
        if(average>0.0)
            if(average<=100.0)
                this.average=average;
    }
    
    public double getAverage(){
        return average;
    }
    
    public String getLetterGrade(){
        String letterGrade="";
        if (average >= 90.0) {
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
    
    public void classAverage(){
        Scanner input = new Scanner(System.in);
        int total=0;
        int gradeCounter=1;
        
        while(gradeCounter<=10){
            System.out.print("Enter a grade:");
            int grade=input.nextInt();
            total=total+grade;
            gradeCounter++;
        }
        
        int average=total/10;
        System.out.printf("%nTotal of all 10 grades is %d%n",total);
        System.out.println("Class average is:"+average);
    }
    
    public void analysis(){
        Scanner input = new Scanner(System.in);
        int passes=0;
        int failures=0;
        int studentCounter=1;
        
        while(studentCounter<=10){
            System.out.print("Enter result(1=pass,2=fail): ");
            int result=input.nextInt();
            
            if(result==1)
                passes=passes+1;
            else 
                failures=failures+1;
            studentCounter++;
        }
        System.out.printf("Passed:%d%nFailed:%d%n",passes,failures);
        
        if(passes>8)
            System.out.println("Bonus to instructor!");
    }
        
}
