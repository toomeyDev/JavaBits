import java.awt.*;


public class CalculatorApplication extends Frame{
    CalculatorApplication()
    {
        Button bAdd = new Button("Add");
        Button bSub = new Button("Subtract");
        Button bMult = new Button("Multiply");
        Button bDiv = new Button("Divide");
        bAdd.setBounds(150,200,80,30);
        bSub.setBounds(150,250,80,30);
        add(bAdd);
        add(bSub);
        setSize(700,600);
        setLayout(null);
        setVisible(true);
        
    }    
}
