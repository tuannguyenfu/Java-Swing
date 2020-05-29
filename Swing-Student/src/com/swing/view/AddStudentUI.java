/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.view;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Tuan Nguyen
 */
public class AddStudentUI {

    JFrame jfrAddStudent;
    JLabel lblId;
    JLabel lblName;
    JTextField txtId;
    JTextField txtName;
    JButton btnSubmit;

    public AddStudentUI() {
        jfrAddStudent = new JFrame();
        jfrAddStudent.setTitle("Add Student");
        jfrAddStudent.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        lblId = new JLabel("ID: ");
        lblName = new JLabel("Name: ");
        txtId = new JTextField(10);
        txtName = new JTextField(10);
        btnSubmit = new JButton("Submit");

        jfrAddStudent.setLayout(new FlowLayout());
        jfrAddStudent.add(lblId);
        jfrAddStudent.add(txtId);
        jfrAddStudent.add(lblName);
        jfrAddStudent.add(txtName);
        jfrAddStudent.add(btnSubmit);
    }

    public JFrame getJfrAddStudent() {
        return jfrAddStudent;
    }

    public void setJfrAddStudent(JFrame jfrAddStudent) {
        this.jfrAddStudent = jfrAddStudent;
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblName() {
        return lblName;
    }

    public void setLblName(JLabel lblName) {
        this.lblName = lblName;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

}
