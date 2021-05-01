import java.awt.*;
import java.awt.event.*;
public class MultiplyButton extends Button implements ActionListener {

    public MultiplyButton(){
        this.setLabel("Multiply");
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // should pop up a smaller window that lets you multiply two numbers together
        System.out.println("5 * 5 = " + (5*5));
    }
        
}