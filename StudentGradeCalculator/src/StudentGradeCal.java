
import java.util.Scanner;

public class StudentGradeCal
{
   public static void main(String[] args)
   {
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Total Number Of Subjects");
	   int size = sc.nextInt();
	   System.out.println("Enter Total Number Of Marks ");
	   float Tmarks=sc.nextFloat();
      float[] marks = new float[size];
      float sum=0;
      
      
      System.out.print("Enter Marks Obtained in Each Subjects: ");
      for(int i=0; i<size; i++)
      {
         marks[i] = sc.nextFloat();
         sum += marks[i];
      }
	  
      float percent = (sum/Tmarks)*100;
      float avg = sum/size;
      String grade = "";
      
      if(avg>=90)
          grade = "A+";
       else if(avg>=85 && avg<90)
          grade = "A";
       else if(avg>=80 && avg<85)
          grade = "B+";
       else if(avg>=75 && avg<80)
          grade = "B";
       else if(avg>=70 && avg<75)
          grade = "c+";
       else if(avg>=65 && avg<70)
          grade = "C";
       else if(avg>=60 && avg<65)
          grade = "D+";
       else if(avg>=55 && avg<60)
          grade = "D";
       else if(avg>=50 && avg<55)
          grade = "E+";
       else if(avg>=45 && avg<50)
          grade = "E";
       else if(avg>=40 && avg<45)
          grade = "F+";
       else if(avg>=35 && avg<40)
           grade = "F";
       else
          grade = "Fail";
      
		 
      System.out.println("\nGrade = " +grade);
      System.out.println("Total Marks = " +sum);
      System.out.println("percent = " +percent);
      
   sc.close();   
   }
   
}