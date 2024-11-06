package com.technocompacademy.util.student;

import com.technocompacademy.entities.students.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * TechnoComAcademy StudentOperation module.
 *
 * <p>This class Handles Various Operations On Student.</p>
 *
 * <p>It includes save, saveAll, getAll methods </p>
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
     * @param object of The Student.
     * @since 1.0
     * @throws IllegalArgumentException if Student object is null.
     * @return true if student data is successfully added in database, OtherWise false.
     */
    public static boolean save(Student object) throws IllegalArgumentException {
        if(object == null){
            throw new IllegalArgumentException("Student Object Cannot be null!");
        }
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathForStudentDatabaseFile,true)) ) {

//          retrieving student information from Student object.
            Integer studentRollNo = object.getStudentRollNo();
            String studentName = object.getStudentName();
            Double studentPercentage = object.getStudentPercentage();

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


}
