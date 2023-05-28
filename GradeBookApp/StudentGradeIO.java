/**
 * Upadhyaya, A. (2023). CIS505-T301 Intermediate Java Programming. Bellevue University, all rights reserved. 
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeIO {
    // Create file object for grades.csv
    final String FILE_NAME = "grades.csv";
    File file = new File(FILE_NAME);

    /**
     * This method stores a single student grade in a CSV file
     * @param student Student
     * @throws Exception
     */
    public void saveStudentGrades(Student student) throws Exception {
        PrintWriter output = null;

        if(file.exists()) { // Check if students grade file already exists
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true)); // Make sure new grades are appended to existing file
        } else { // If grades.csv doesn't exist, create a new one
            output = new PrintWriter(FILE_NAME);
            // Add header row
            output.print("firstName,");
            output.print("lastName,");
            output.print("course,");
            output.println("grade");
        }

        // Add student grade into the CSV file
        output.print(student.getFirstName() + ",");
        output.print(student.getLastName() + ",");
        output.print(student.getCourse() + ",");
        output.println(student.getGrade());

        // Close output stream
        output.close();
    }
    
    /**
     * This method returns all the student grades already stored
     * @return students ArrayList<Student>
     * @throws Exception
     */
    public ArrayList<Student> getAllStudentGrades() throws Exception {
        Scanner input = new Scanner(file);

        if(input.hasNextLine()) { // Skip header row
            input.nextLine();
        }

        ArrayList<Student> students = new ArrayList<>();

        // Create student object by reading each row and add to students list
        while(input.hasNextLine()) { // Read the file until no lines left
            String[] data = input.nextLine().split(","); // Get all the space deliminated data
            Student student = new Student(data[0], data[1], data[2], data[3]);
            students.add(student);
        }
        input.close(); //Close input stream
        return students;
    }
}
