import java.awt.*;
import java.awt.event.*;

public class CalculatorApplication extends Frame implements ActionListener{
    CalculatorApplication()
    {
        // create components
        Label header = new Label("Calculator");
        Button bAdd = new AddButton();
        Button bSub = new SubtractButton();
        Button bMult = new MultiplyButton();
        Button bDiv = new DivideButton();

        

        // set bounds of components
        header.setBounds(161, 150, 80, 30);
        bAdd.setBounds(150,200,80,30);
        bSub.setBounds(150,250,80,30);
        bMult.setBounds(150,300,80,30);
        bDiv.setBounds(150,350,80,30);
        
        // add components to layout
        add(header);
        add(bAdd);
        add(bSub);
        add(bMult);
        add(bDiv);
        setSize(700,600);

        // make layout visible
        setLayout(null);
        setVisible(true);
        
        // actionListener for component functionality
        bAdd.addActionListener(this);

        // exit logic for the 'x' button
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

    }
    
    public void actionPerformed(ActionEvent e){
        System.out.println("Test");
    }
    
}
