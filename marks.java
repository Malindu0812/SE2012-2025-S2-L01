import java.util.Scanner;

public class marksArray {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        
        System.out.print("how many student are there: ");
        int n = input.nextInt();

        int studentId; 
        int subjects = 3;         
        int[][] mat = new int[n][subjects];

        int subjectId;  
        int choice;             

        int mathMarks = 0;
        int phyMarks = 0;
        int cheMarks = 0;
        int marks;                     
        int totStudentId;            
        int studentID;   

        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Enter student id and show current marks");
            System.out.println("2 - Show marks for a subject (all students)");
            System.out.println("3 - Add / Update marks");
            System.out.println("4 - Get average for a subject");
            System.out.println("5 - Get total marks for a student");
            System.out.println("6 - Get average marks for a student");
            System.out.println("0 - Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                
                    System.out.println("Enter your student id: ");
                    studentId = input.nextInt();

                
                    if (studentId < 0 || studentId >= n) {
                        System.out.println("Invalid Student id");
                        break;
                    }

                    mathMarks = mat[studentId][0];
                    phyMarks = mat[studentId][1];
                    cheMarks = mat[studentId][2];

                    System.out.println("Marks for student " + studentId + ":");
                    System.out.println("Math: " + mathMarks);
                    System.out.println("Physics: " + phyMarks);
                    System.out.println("Chemistry: " + cheMarks);
                    break;

                case 2:
        
                    System.out.println("subject id (0 for maths, 1 for physics, 2 for chemistry)");
                    subjectId = input.nextInt();

                    if (subjectId < 0 || subjectId >= subjects) {
                        System.out.println("Invalid subject id.");
                        break;
                    }

                    System.out.println("Marks for subject " + subjectId + " (studentId : marks):");
                    for (int i = 0; i < n; i++) {
                        System.out.println(i + " : " + mat[i][subjectId]);
                    }
                    break;

                case 3:
                
                    System.out.println("Enter your student id: ");
                    studentId = input.nextInt();

                    if (studentId < 0 || studentId >= n) {
                        System.out.println("Invalid Student id");
                        break;
                    }

                    System.out.println("subject id (0 for maths, 1 for physics, 2 for chemistry)");
                    subjectId = input.nextInt();

                    if (subjectId < 0 || subjectId >= subjects) {
                        System.out.println("Invalid subject id");
                        break;
                    }

                    System.out.println("Add your marks (0 - 100):");
                    marks = input.nextInt();

            
                    if (marks < 0 || marks > 100) {
                        System.out.println("marks should be within 0 - 100");
                        break;
                    }

                
                    mat[studentId][subjectId] = marks;
                    System.out.println("Marks saved for student " + studentId + ", subject " + subjectId + ".");
                    break;

                case 4:
                    
                    System.out.println("Enter subject Id to get the avarage (0-math,1-phy,2-che):");
                    subjectId = input.nextInt();

                    if (subjectId < 0 || subjectId >= subjects) {
                        System.out.println("Invalid subject id.");
                        break;
                    }

                    double subjectsum = 0;

                    for (int i = 0; i < n; i++) {
                        subjectsum += mat[i][subjectId];
                    }
                    double subjectAvg = subjectsum / n;
                    System.out.println("Avarage marks for subject " + subjectId + " = " + subjectAvg);
                    break;

                case 5:
                    System.out.println("Enter your student id to get total : ");
                    totStudentId = input.nextInt();

                    if (totStudentId < 0 || totStudentId >= n) {
                        System.out.println("Invalid Student id");
                        break;
                    }

                    int totalMarks = 0;
                    for (int sub = 0; sub < subjects; sub++) {
                        totalMarks += mat[totStudentId][sub];
                    }
                    System.out.println("total marks for student " + totStudentId + " = " + totalMarks);
                    break;

                case 6:
                    System.out.print("Enter student ID to get average: ");
                    studentID = input.nextInt();

                    if (studentID < 0 || studentID >= n) {
                        System.out.println("Invalid Student id");
                        break;
                    }

                    double studentSum = 0;
                    for (int sub = 0; sub < subjects; sub++) {
                        studentSum += mat[studentID][sub];
                    }
                    double studentAverage = studentSum / subjects;
                    System.out.println("Average marks for Student " + studentID + " = " + studentAverage);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("invalid input");
                    break;
            }

        } while (choice != 0);

        input.close();
    }
}

