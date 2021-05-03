package GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.*;

/*
- Main window where game components will be arranged
- All other window-level components should be called from GameWindow
- Main sequencing should not take place in GameWindow, (display only, no logic)
*/

public class GameWindow extends Frame{
        
    DisplayWindow gameArea; // main window where game text/options will be displayed

    // default constructor with no special parameters
    public GameWindow(){
            // initial setup
            super("TextRPG");
            this.setVisible(true); 
            this.setSize(1000, 1200);
            this.setBackground(Color.BLACK);
            

            // watch for input on 'x' button to close window
            this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent close) {
                    System.exit(0);
                }
            });

            // center the window on the screen
            centerScreen();

            gameArea = new DisplayWindow(this, 0);
            gameArea.setVisible(true);

            // watch for movement on main window and update gameArea to reflect this
            this.addComponentListener(new ComponentAdapter(){
                public void componentMoved(ComponentEvent e)
                {
                    gameArea.updatePosition();
                }
            });
    }
    
    public void menuSequence(String menuSelection)
    {
        menuSelection.toLowerCase();

        if(menuSelection.equals("main")){
            System.out.println("Main Menu");
        }
    }

    /* centers GameWindow on the current monitor
    */
    public void centerScreen(){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int xLocation = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int yLocation = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(xLocation, yLocation);
    }

    /* window within the main frame to display game contents
    */
    class DisplayWindow extends Window{
        public DisplayWindow(Frame container, int status){
            super(container);
            setSize(750, 900);
            setLocationRelativeTo(container);
            setBackground(Color.WHITE);

        }

            /* updates location relative to the GameWindow
            */
            public void updatePosition()
            {
            setLocationRelativeTo(this.getParent());
            }
    }

}