/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Tuan Nguyen
 */
public class StudentUI {

    JFrame jfrStudent;
    JTable jtbStudent;
    JScrollPane jspStudentTable;
    JPanel pnlBottom;
    JButton btnAdd;
    JButton btnUpdate;
    JButton btnRemove;

    public StudentUI() {
        //Create main frame in order to display student
        jfrStudent = new JFrame();
        jfrStudent.setTitle("Student");
        jfrStudent.setSize(new Dimension(600, 600));
        jfrStudent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pnlBottom = new JPanel();

        jtbStudent = new JTable();
        jtbStudent.setSize(new Dimension(600, 450));

        btnAdd = new JButton("ADD");
        btnUpdate = new JButton("UPDATE");
        btnRemove = new JButton("REMOVE");

        jfrStudent.add(new JScrollPane(jtbStudent), BorderLayout.CENTER);
        jfrStudent.add(pnlBottom, BorderLayout.PAGE_END);

        pnlBottom.add(btnAdd);
        pnlBottom.add(btnUpdate);
        pnlBottom.add(btnRemove);
    }

    public JFrame getJfrStudent() {
        return jfrStudent;
    }

    public void setJfrStudent(JFrame jfrStudent) {
        this.jfrStudent = jfrStudent;
    }

    public JTable getJtbStudent() {
        return jtbStudent;
    }

    public void setJtbStudent(JTable jtbStudent) {
        this.jtbStudent = jtbStudent;
    }

    public JScrollPane getJspStudentTable() {
        return jspStudentTable;
    }

    public void setJspStudentTable(JScrollPane jspStudentTable) {
        this.jspStudentTable = jspStudentTable;
    }

    public JPanel getPnlBottom() {
        return pnlBottom;
    }

    public void setPnlBottom(JPanel pnlBottom) {
        this.pnlBottom = pnlBottom;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JButton getBtnUpdate() {
        return btnUpdate;
    }

    public void setBtnUpdate(JButton btnUpdate) {
        this.btnUpdate = btnUpdate;
    }

    public JButton getBtnRemove() {
        return btnRemove;
    }

    public void setBtnRemove(JButton btnRemove) {
        this.btnRemove = btnRemove;
    }

}
