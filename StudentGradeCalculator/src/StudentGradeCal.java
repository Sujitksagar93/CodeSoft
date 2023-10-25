
import java.util.Scanner;

public class StudentGradeCal
{
   public static void main(String[] args)
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Total Number Of Subjects");
	   int s = sc.nextInt();
      float[] marks = new float[s];
      float sum=0;
      
      
      System.out.print("Enter Marks Obtained in Each Subjects: ");
      for(int i=0; i<s; i++)
      {
         marks[i] = sc.nextFloat();
         sum += marks[i];
      }
	  
      float avg = sum/s;
      String grade = "";
      
      if(avg>=90)
         grade = "A";
      else if(avg>=90 && avg<85)
         grade = "A-";
      else if(avg>=85 && avg<80)
         grade = "B+";
      else if(avg>=80 && avg<75)
         grade = "B";
      else if(avg>=75 && avg<70)
         grade = "B-";
      else if(avg>=70 && avg<65)
         grade = "C+";
      else if(avg>=65 && avg<60)
         grade = "C";
      else if(avg>=60 && avg<55)
         grade = "C-";
      else if(avg>=55 && avg<50)
         grade = "D+";
      else if(avg>=50 && avg<45)
         grade = "D";
      else if(avg>=45 && avg<40)
         grade = "D-";
      else if(avg>=40 && avg<35)
          grade = "E";
      else
         grade = "Fail";
		 
      System.out.println("\nGrade = " +grade);
   }
}