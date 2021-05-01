import java.awt.*;
import java.awt.event.*;
public class SubtractButton extends Button implements ActionListener {

    public SubtractButton(){
        this.setLabel("Subtract");
        this.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // should pop up a smaller window that lets you subtract two numbers
        System.out.println("10 - 5 = " + (10 - 5));
    }
        
}
