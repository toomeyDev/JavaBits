import java.awt.*;
import java.awt.event.*;
public class DivideButton extends Button implements ActionListener {

    public DivideButton(){
        this.setLabel("Divide");
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // should pop up a smaller window that lets you divide two numbers
        System.out.println("100 / 5 = " + (100 / 5));
    }
        
}