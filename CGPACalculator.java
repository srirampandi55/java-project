import java.util.Scanner;

public class CGPACalculator {
    static void printLine(){
        System.out.println("GRADE DETAILS");
        System.out.println(" O - 10");
        System.out.println("A+ - 9");
        System.out.println("A - 8");
        System.out.println("B+ - 7");
        System.out.println("B - 6");
        System.out.println("c - 5");
        System.out.println("U - FAIL");
    }



    public static void main(String[] args) {
        System.out.println("--- Welcome to the CGPA calculation for the current semester ---");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("HELLO " + name);
        System.out.print(" Now you Enter the number of subjects name include lab: ");
        int numSubjects = scan.nextInt();
        scan.nextLine();

        String[] subjectNames = new String[numSubjects];
        int[] subjectGrade = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the subject " + (i + 1) + " name: ");
            subjectNames[i] = scan.nextLine();
        }
        
        printLine();
        

        for (int j = 0; j < numSubjects; j++) {
            System.out.print("Enter  grade number for " + subjectNames[j] + ": ");
            subjectGrade[j] = scan.nextInt();
        }
        float Credits[] = new float[numSubjects];
        for(int i=0; i<numSubjects;i++){
            System.out.print("Enter the credit for " + subjectNames[i] + ":");
            Credits[i] = scan.nextFloat();
        }
        scan.close();
        float sum = 0;
        for(float Credits1 : Credits){
            sum += Credits1;
         }
         System.out.println("total credits is:" + sum);
        
         
         float[] totalcalc = new float[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            totalcalc[i] = (subjectGrade[i] * Credits[i]);
        }
        float total =0 ;
         for(int i =0; i<totalcalc.length; i++){
            total= total + totalcalc[i];
         }
         float finalCGPA;
         finalCGPA = total/sum;
         System.out.println(name + " CGPA is " + finalCGPA);
         System.out.println("GOOD " + finalCGPA + " OUT OF 10. BUT YOU STILL NEED HARDWORK");
         System.out.print("----THANK YOU----");
        }



    @Override
    public String toString() {
        return "CGPACalculator []";
    }
        }



    
