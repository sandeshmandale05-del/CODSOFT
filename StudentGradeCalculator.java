import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        // Enter the number of subject Wants to calculate the marks
        System.out.println("Enter total number of subjects : ");
        int numSubjects= scan.nextInt();

        int totalmarks=0;
        for(int i=1 ; i<=numSubjects; i++){
            System.out.println("Enter the marks for subjects"+ i +" (out of 100)");
            int marks=scan.nextInt();
        

        while(marks < 0 || marks > 100){
            System.out.println("Envalid marks! please enter valid marks");
            System.out.println("Enter marks for subject" + i +" ");
            marks =scan.nextInt();
        }
        totalmarks+=marks;
    }

    System.out.println("Student Result: ");
    System.out.println(" Total marks obtained in all subjects : " + totalmarks );

    float percentage = (totalmarks/numSubjects);
    System.out.println(" Your total Percent of all subjects : " + percentage );    
    scan.close();

    if(percentage >= 95){
        System.out.println("Grade : A+");
    }
    else if( percentage >= 90 && percentage < 95){
        System.out.println(" Grade: A");
    }
    else if( percentage >= 85 && percentage < 90){
        System.out.println(" Grade: B+");
    }
    else if( percentage >= 80 && percentage < 85){
        System.out.println(" Grade: B");
    }
    else if( percentage >= 75 && percentage < 80){
        System.out.println(" Grade: C+");
    }
    else if( percentage >= 70 && percentage < 75){
        System.out.println(" Grade: C");
    }
    else if( percentage >= 35 && percentage < 70){
        System.out.println(" Grade: D");
    }
    else if( percentage <35){
        System.out.println(" Grade: F " + " You are FAIL : ");
    }
    

}
}
