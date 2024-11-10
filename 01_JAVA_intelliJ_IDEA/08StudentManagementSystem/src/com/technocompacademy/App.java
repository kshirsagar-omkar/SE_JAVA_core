package com.technocompacademy;

import com.technocompacademy.controller.HomeScreen;

/**
 * TechnoComAcademy Student Management System main application module.
 *
 * <p>This class serves as the entry point for initializing and launching the
 * application.</p>
 *
 * @author Omkar kshirsagar
 * @version 1.0, 06/11/2024
 * @since 1.0
 */

public class App {
    public static void main(String[] args) {


        new HomeScreen();


        //Test Code For Application



//        SwingUtilities.invokeLater(HomeScreen::new);
/*
        The line SwingUtilities.invokeLater(HomeScreen::new); is used to ensure that the creation and
        initialization of the HomeScreen GUI happens on the Event Dispatch Thread (EDT), which is
        the main thread responsible for handling all Swing events and GUI updates.

        Here's a breakdown:

        Event Dispatch Thread (EDT): In Swing, all interactions with the GUI components (like creating,
        updating, and modifying them) should be done on the EDT. This ensures thread safety, so there
        are no unexpected behavior or visual glitches due to concurrency issues.

        SwingUtilities.invokeLater: This method takes a Runnable (a task to run) and schedules it
        to execute on the EDT. If the EDT is already running, the code inside invokeLater will wait until
        the EDT is free.

        HomeScreen::new: This is a method reference in Java that refers to the HomeScreen
        constructor. It’s shorthand for creating a new Runnable that runs new HomeScreen()
        when executed. It effectively starts the GUI by creating an instance of HomeScreen.

        In short, SwingUtilities.invokeLater(HomeScreen::new); safely initializes the GUI on the
        correct thread, preventing potential threading issues.
*/





        //Test Code for Screens

//        new AddStudentScreen();
//        new DisplayStudentScreen();

//        new DeleteStudentScreen();

//        new UpdateStudentScreen();
















/*
//      TEST CODES :


//      1. Adding a single Student record into student database file

        try{
            Student ob = new Student(101, "AAA", 90.00);
            if (StudentOperation.save(ob)) {
                System.out.println("Data Added Successfully for Roll Number : " + ob.getStudentRollNo());
            } else {
                System.out.println("Error While Adding Data For Roll Number : " + ob.getStudentRollNo());
            }
        }
        catch (NullPointerException e){
            System.out.println("Error While Writing Student Data To File : " + e.getMessage());
            e.printStackTrace();
        }




//      2. Adding Multiple records into student database file

        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student(101,"AAA",90.01));
        listOfStudents.add(new Student(102,"BBB",70.00));
        listOfStudents.add(new Student(103,"CCC",65.88));

        try {
            StudentOperation.saveAll(listOfStudents);
        }
        catch (NullPointerException e){
            System.out.println("Error While Writing Student's Data To File : " + e.getMessage());
            e.printStackTrace();
        }



//      3. retrieve all students records in List
        List<Student> students = StudentOperation.getAllStudents();
        for (Student student : students){
            System.out.println(student);
        }




//      3. search student in database
        Integer trno = 109;
        Student s = StudentOperation.searchStudent(trno);
        if(s == null){
            System.out.println("No Record found for roll number : " + trno);
        }else{
            System.out.println("Record found for roll number : " + trno);
            System.out.println(s);
        }



//      4. delete student from student database
        Integer trno = 101;
        boolean status = StudentOperation.deleteStudent(trno);
        if(status){
            System.out.println("Delete success : " + trno);
        }
        else {
            System.out.println("Unable to delete : " + trno);
        }



//      5.Update student record from student database
        Student student = new Student(101,"ZZZ", 90.0);
        boolean status = StudentOperation.updateStudent(student);
        if(status){
            System.out.println("Update success : " + student.getStudentRollNo());
        }
        else {
            System.out.println("Unable to update : " + student.getStudentRollNo());
        }



*/
    }


}