
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tuan Nguyen
 */
public class Controller {

    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void initController() {
        view.getBtnSubmit().addActionListener(btnSubmitEvent());
    }

    public ActionListener btnSubmitEvent() {
        ActionListener btnAction = (ActionEvent e) -> {
            String Username = view.getTxtUsername().getText();
            boolean checkTxtUsernameNotEmpty = !view.getTxtUsername().getText().isEmpty();
            boolean checkPasswordLength = (view.getTxtPassword().getText().length() == 6);
            if (checkTxtUsernameNotEmpty && checkPasswordLength) {
                model.setInput(Username);
                view.getLblDisplay().setText(model.getInput());
                view.getDisplayFrame().pack();
                view.getDisplayFrame().setVisible(true);
            }
        };
        return btnAction;
    }

}
