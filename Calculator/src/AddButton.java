import java.awt.*;
import java.awt.event.*;
public class AddButton extends Button implements ActionListener {

    public AddButton(){
        this.setLabel("Add");
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // should pop up a smaller window that lets you add two numbers together
        System.out.println("5 + 5 = " + (5 + 5));
    }
        
}