import java.util.Scanner;

public class Hackathon2{
    

    static class Student{
        String Studentname;
        String Rollno;
        int Marks;
        String CourseName;
        int CourseCredits;
        Student (String a , String b, int c ,String d, int e)
        {
             Studentname = a;
             Rollno = b;
             Marks = c;
             CourseName = d;
             CourseCredits = e;
        }
        int calculateFee()
        {
            System.out.println("Total Course fees are :" + 1500*CourseCredits);
            int fee = 1500*CourseCredits;
            return fee;
        }
        boolean checkEligibility(int Marks)
        {
            if(Marks> 50)
            {
                
                return true;
            }
            else
            {   
               return false;
            }
        }
        double calculateScholarship(int Marks)
        {   if(checkEligibility(Marks)){
            if(Marks >= 85)
            {
                System.out.println("20% Scholarship is Available");
                return 0.2;
            }
            else if ( Marks>=70)
            {
                System.out.println("10% Scholarship is Available");
                return 0.1;
            }
           }
            else 
                System.out.println("No Scholarship Is Available");
                return 0;
        }
        double calculateFinalFee() {
            int baseFee = calculateFee();
            double discountRate = calculateScholarship(Marks);
            
            double finalFee = baseFee * (1 - discountRate);
            
            System.out.println("Total final fee after scholarship is: " + finalFee);
            return finalFee;
        }
        void displayDetals()
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Student Name:");
            Studentname = scan.nextLine();
            System.out.println("Enter Roll No:");
            Rollno = scan.nextLine();
            System.out.println("Marks:");
            Marks = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter Course Name:");
            CourseName = scan.nextLine();
            System.out.println("Enter Course Credits:");
            CourseCredits = scan.nextInt();

            if(checkEligibility(Marks))
                System.out.println("Eligibility : Eligible");
            else
                System.out.println("Eligibility : Not Eligible");
            //calculateFee();
            //calculateScholarship(Marks);
           calculateFinalFee();           
            scan.close();
        }
        public static void main(String[] args) {
            Student s = new Student(null, null, 0, null, 0);
            s.displayDetals();
        }
    }

}