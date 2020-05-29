/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.controller;

import com.swing.dao.StudentDAO;
import com.swing.model.Student;
import com.swing.view.AddStudentUI;
import com.swing.view.StudentUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Tuan Nguyen
 */
public class StudentController {

    private final AddStudentUI addStudentUI;
    private final StudentUI studentUI;
    private final StudentDAO studentDAO;

    public StudentController(AddStudentUI addStudentUI, StudentUI studentUI, StudentDAO studentDAO) {
        this.addStudentUI = addStudentUI;
        this.studentUI = studentUI;
        this.studentDAO = studentDAO;
    }

    public void initView() {
        List<Student> listStudent = studentDAO.findAllStudent();

        JTable jtbStudent = studentUI.getJtbStudent();

        DefaultTableModel model = new DefaultTableModel();
        studentDAO.getListStudentColumn().stream().forEach((column) -> {
            model.addColumn(column);
        });

        listStudent.stream().map((student) -> {
            return student;
        }).forEach((student) -> {
            model.addRow(student.toDataRow());
        });

        jtbStudent.setModel(model);

        studentUI.getBtnAdd().addActionListener(actionAddStudent());
        studentUI.getJfrStudent().setVisible(true);
    }

    public ActionListener actionAddStudent() {
        ActionListener ac = (ActionEvent e) -> {
            addStudentUI.getJfrAddStudent().pack();
            addStudentUI.getJfrAddStudent().setVisible(true);
            addStudentUI.getBtnSubmit().addActionListener((ActionEvent event) -> {
                try {
                    int id = Integer.parseInt(addStudentUI.getTxtId().getText());
                    String name = addStudentUI.getTxtName().getText();
                    if (name.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please enter name", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                    studentDAO.addStudent(id, name);
                    JOptionPane.showMessageDialog(null, "Add Successfully !!");
                    addStudentUI.getJfrAddStudent().setVisible(false);
                    studentUI.getJfrStudent().setVisible(false);
                    initView();
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(null, "Please enter number for ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }); //To change body of generated methods, choose Tools | Templates.
        };
        return ac;

    }

}
