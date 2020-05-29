/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuan Nguyen
 */
public class Main {
    
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(null);
        Controller c = new Controller(model, view);
        c.initController();
    }
    
}
