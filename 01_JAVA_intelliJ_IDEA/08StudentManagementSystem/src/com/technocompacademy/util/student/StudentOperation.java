package com.technocompacademy.util.student;

import com.technocompacademy.entities.students.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * TechnoComAcademy StudentOperation module.
 *
 * <p>This class Handles Various Operations On Student.</p>
 *
 * <p>It includes save, saveAll, getAllStudents, searchStudent, delete, update methods </p>
 *
 * @author Omkar Kshirsagar
 * @version 1.0, 06/11/2024
 * @since 1.0
 */


public class StudentOperation {

    /**
     * File path for the student database CSV file.
     * This file is used to store student data in a comma-separated format.
     *
     * @since 1.0
     */
    private static final String pathForStudentDatabaseFile = "src/resources/studentDataBase.csv";



    /**
     * Write a Single Student's Data Into student database File(pathForStudentDatabaseFile).
     *
     * @param student object of The Student.
     * @since 1.0
     * @throws IllegalArgumentException if Student student is null.
     * @return true if student data is successfully added in database, OtherWise false.
     */
    public static boolean save(Student student) throws IllegalArgumentException {
        if(student == null){
            throw new IllegalArgumentException("Student Object Cannot be null!");
        }

        if(StudentOperation.searchStudent(student.getStudentRollNo()) != null){
            System.out.println("Duplicate record for roll number : " + student.getStudentRollNo());
            return false;
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathForStudentDatabaseFile,true)) ) {

//          retrieving student information from Student student.
            Integer studentRollNo = student.getStudentRollNo();
            String studentName = student.getStudentName();
            Double studentPercentage = student.getStudentPercentage();

//          Writing student data in CSV format: rollNo,name,percentage
            bw.write(studentRollNo + "," + studentName + "," + studentPercentage + "\n");
            return true;
        }
        catch (IOException e) {
            System.out.println("Error writing student data to file: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }



    /**
     * Write Multiple Students' Records Into the student database file.
     *
     * <p>This method saves all student records in the provided list to the database file.
     * It uses the save() method to write each student's record individually.</p>
     *
     * @throws NullPointerException if list of student is null
     * @param listOfStudents A list containing all student records to be added to the student database file.
     * @since 1.0
     */
    public static void saveAll(List<Student> listOfStudents) throws NullPointerException{
        if(listOfStudents == null){
            throw new NullPointerException("listOfStudents cannot be null!");
        }

        for (Student student : listOfStudents) {
           try {
               if (StudentOperation.save(student)) {
                   System.out.println("Data Added Successfully for Roll Number: " + student.getStudentRollNo());
               }
           }
           catch (IllegalArgumentException e){
               System.out.println("Error While Writing Student's Data To File : " + e.getMessage());
               e.printStackTrace();
           }
        }
    }



     /**
     * Retrieves all student records from the student database file.
     *
     * <p>This method reads each line from the database file, parses the line into
     * individual properties, and creates a new {@link Student} object for each record.
     * Each student is added to a list, which is returned at the end.</p>
     *
     * <p>In case of parsing errors for individual records, those records are skipped
     * with an error message.</p>
     *
     * @return a {@code List<Student>} containing all successfully parsed student records;
     *         an empty list if no records are found or if all records contain errors.
     * @since 1.0
     */
    public static List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pathForStudentDatabaseFile))) {
            String record = null;
            while( (record = bufferedReader.readLine()) != null ){
                String []token = record.split(",");

                // Basic validation to avoid array index errors and format issues
                if(token.length == 3){
                    try {
                        int rollNo = Integer.parseInt(token[0].trim());
                        String name = token[1].trim();
                        double percentage = Double.parseDouble(token[2].trim());
                        students.add(new Student(rollNo, name, percentage));
                    }
                    catch (NumberFormatException e){
                        System.out.println("Error Parsing record : " + record);
                        e.printStackTrace();
                    }
                }
            }
            return students;
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return students;
    }

    /**
     * Searches for a student in the database by their roll number.
     *
     * <p>This method retrieve all student records from database an iterate
     * through the list to find a match based on provided roll number.</p>
     *
     * @param studentRollNumber the roll number of a student to find in student database file
     * @return a {@link Student} object if a matching record is found; {@code null} if no match is found.
     * @since 1.0
     */
    public static Student searchStudent(Integer studentRollNumber){
        List<Student> students = StudentOperation.getAllStudents();
        if(students != null){
            for(Student student : students){
                if(studentRollNumber == student.getStudentRollNo()){
                    return student;
                }
            }
        }
        return null;
    }


}
