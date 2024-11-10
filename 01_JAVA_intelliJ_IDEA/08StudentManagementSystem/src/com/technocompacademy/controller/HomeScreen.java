package com.technocompacademy.controller;

import com.technocompacademy.view.AddStudentScreen;
import com.technocompacademy.view.DeleteStudentScreen;
import com.technocompacademy.view.DisplayStudentScreen;
import com.technocompacademy.view.UpdateStudentScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The HomeScreen class represents the main GUI home screen for the TechnoCompAcademy application.
 * <p>
 * Provides an intuitive, visually appealing main screen with icons for various actions
 * related to student management, including adding, displaying, updating, and deleting records.
 * This screen serves as the entry point to access other features in the application.
 * </p>
 * <p>
 * Uses a GridLayout for action buttons, a welcome label at the top, and a
 * personalized footer to improve user experience.
 * </p>
 *
 * @version 1.1
 * @since 1.0
 */
public class HomeScreen extends JFrame implements ActionListener {

    private JButton btnAddStudent;
    private JButton btnDisplayStudent;
    private JButton btnUpdateStudent;
    private JButton btnDeleteStudent;

    /**
     * Constructor for the HomeScreen class.
     * <p>
     * Initializes the main layout, welcome message, buttons with icons, and action listeners.
     * Sets frame properties like title, visibility, size, and close operation.
     * </p>
     */
    public HomeScreen() {
        // Set the main frame properties
        setTitle("TechnoCompAcademy - Student Management");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Add a welcome label at the top
        JLabel lblWelcome = new JLabel("Welcome to TechnoCompAcademy", JLabel.CENTER);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 24));
        lblWelcome.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblWelcome, BorderLayout.NORTH);

        // Panel for action buttons
        JPanel panelButtons = new JPanel(new GridLayout(2, 2, 20, 20));
        panelButtons.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Initialize buttons with icons and add them to the panel
        btnAddStudent = createButton("Add Student", "add_icon.png");
        btnDisplayStudent = createButton("Display Student", "display_icon.png");
        btnUpdateStudent = createButton("Update Student", "update_icon.png");
        btnDeleteStudent = createButton("Delete Student", "delete_icon.png");

        panelButtons.add(btnAddStudent);
        panelButtons.add(btnDisplayStudent);
        panelButtons.add(btnUpdateStudent);
        panelButtons.add(btnDeleteStudent);

        add(panelButtons, BorderLayout.CENTER);

        // Footer with author info
        JLabel lblFooter = new JLabel("Developed by Omkar Kshirsagar", JLabel.CENTER);
        lblFooter.setFont(new Font("Arial", Font.ITALIC, 12));
        lblFooter.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        add(lblFooter, BorderLayout.SOUTH);

        // Display the frame
        setVisible(true);
    }

    /**
     * Creates a JButton with a label and icon.
     *
     * @param text         the button's label
     * @param iconFileName the icon filename (assumed to be in the resources folder)
     * @return a configured JButton with text and icon
     */
    private JButton createButton(String text, String iconFileName) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setIcon(new ImageIcon("src/resources/" + iconFileName)); // Ensure these icon paths are correct
        button.addActionListener(this);
        return button;
    }

    /**
     * Handles action events for menu items, triggering corresponding screens.
     *
     * @param e the ActionEvent triggered when a button is selected
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddStudent) {
            new AddStudentScreen();
        } else if (e.getSource() == btnDisplayStudent) {
            new DisplayStudentScreen();
        } else if (e.getSource() == btnUpdateStudent) {
            new UpdateStudentScreen();
        } else if (e.getSource() == btnDeleteStudent) {
            new DeleteStudentScreen();
        }
    }
}