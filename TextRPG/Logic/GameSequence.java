package Logic;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Label;
import java.awt.event.*;
import java.util.Scanner;
import java.awt.Window;

public class GameSequence {
    boolean isRunning;

    public void setup(){
        isRunning = true;
    }

    public GameSequence(){
        setup();
    }

    public void gamePlayLoop(Window w){
        while(isRunning){
            System.out.println("Game Logic Running:");
            Label prompt = new Label("Enter text:");
            TextArea input = new TextArea();
            
            prompt.setBounds(345, 150, 100, 50);
            input.setBounds(275, 200, 200, 100);

            w.add(prompt);
            w.add(input);

            

            if(getUInput(input, false) == true){
                exitLoop();
                System.out.println("Loop complete");
            }    
        }
    }

    // exit the gameplay loop
    public void exitLoop(){
        isRunning = false;
    }

    public boolean getUInput(TextArea t, boolean finished){
        if(t.getText().equals("exit"))
        return true;
        else getUInput(t, false);
        return false;
    }

}