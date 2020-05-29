/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.dao;

import com.swing.dbcontext.DBContext;
import com.swing.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tuan Nguyen
 */
public class StudentDAO {
    
    /**
     * Get all student from DB
     * @return the List include all student
     */
    public List<Student> findAllStudent() {
        List<Student> listAllStudent = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBContext.getInstance().getConnection();
            String querySelectAllStudent = "Select * from dbo.student";
            ps = con.prepareStatement(querySelectAllStudent);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setId(rs.getInt(1));
                student.setName(rs.getString(2));
                listAllStudent.add(student);
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return listAllStudent;
    }
    
    /**
     * Add one student to DB
     * @param id
     * @param name 
     */
    public void addStudent(int id, String name) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBContext.getInstance().getConnection();
            String insertStudentTable = "Insert into student VALUES(?, ?)";
            ps = con.prepareStatement(insertStudentTable);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Delete one student who are selected
     * @param id 
     */
    public void removeStudent(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBContext.getInstance().getConnection();
            String insertStudentTable = "delete from student where student.id = ?";
            ps = con.prepareStatement(insertStudentTable);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Update student who are selected
     * @param id
     * @param name 
     */
    public void updateStudent(int id, String name) {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBContext.getInstance().getConnection();
            String insertStudentTable = "Update student set name = ? where student.id = ?";
            ps = con.prepareStatement(insertStudentTable);
            ps.setString(1, name);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * get All student Column
     * @return list Student's Column
     */
    public List<String> getListStudentColumn() {
        List<String> listColumn = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBContext.getInstance().getConnection();
            String querySelectAllStudent = "Select * from student";
            ps = con.prepareStatement(querySelectAllStudent);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData metadata = rs.getMetaData();
            int columnCount = metadata.getColumnCount();
            for (int i = 1; i <= columnCount; i++){
                listColumn.add(metadata.getColumnName(i));
            }
            rs.close();
            ps.close();
            con.close();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return listColumn;
    }
    
}
