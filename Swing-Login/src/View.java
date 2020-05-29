
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tuan Nguyen
 */
public class View {

    JFrame loginFrame;
    JTextField txtUsername;
    JTextField txtPassword;
    JFrame displayFrame;
    JLabel lblDisplay;
    JButton btnSubmit;

    public View(String input) {
        //Create login frame 
        loginFrame = new JFrame();
        loginFrame.setLayout(new FlowLayout());
        loginFrame.setTitle("Login");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create component for login Frame
        txtUsername = new JTextField(20);
        txtPassword = new JTextField(20);
        btnSubmit = new JButton();
        btnSubmit.setText("SUBMIT");
        loginFrame.add(txtUsername);
        loginFrame.add(txtPassword);
        loginFrame.add(btnSubmit);

        //Display login Frame 
        loginFrame.pack();
        loginFrame.setVisible(true);

        //Create Frame that display input
        displayFrame = new JFrame();
        displayFrame.setTitle("Display");
        displayFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create Component for displayFrame
        lblDisplay = new JLabel();
        lblDisplay.setSize(new Dimension(100,100));
        displayFrame.add(lblDisplay, BorderLayout.CENTER);
    }

    public JFrame getLoginFrame() {
        return loginFrame;
    }

    public void setLoginFrame(JFrame loginFrame) {
        this.loginFrame = loginFrame;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    public JTextField getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(JTextField txtPassword) {
        this.txtPassword = txtPassword;
    }

    public JFrame getDisplayFrame() {
        return displayFrame;
    }

    public void setDisplayFrame(JFrame displayFrame) {
        this.displayFrame = displayFrame;
    }

    public JLabel getLblDisplay() {
        return lblDisplay;
    }

    public void setLblDisplay(JLabel lblDisplay) {
        this.lblDisplay = lblDisplay;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

}
