/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing;

import com.swing.controller.StudentController;
import com.swing.dao.StudentDAO;
import com.swing.view.AddStudentUI;
import com.swing.view.StudentUI;

/**
 *
 * @author Tuan Nguyen
 */
public class mainclass {
    
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        StudentUI studentUI = new StudentUI();
        AddStudentUI addStudentUI = new AddStudentUI();
        StudentController studentController = new StudentController(addStudentUI, studentUI, studentDAO);
        studentController.initView();
    }
    
}
