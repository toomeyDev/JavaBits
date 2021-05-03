package GUI;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.*;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;

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
    
    /*
    * handles selection of various menu states/layouts
      Main: starting menu with inputs to start, load, or exit
      Game: main gameplay view, has inputs to save, load, return to menu
    */
    public void menuSequence(String menuSelection)
    {
        menuSelection = menuSelection.toLowerCase();

        if(menuSelection.equals("main")){
            System.out.println("Main Menu");
            setLayout("main");
        }
        else if(menuSelection.equals("game")){
            System.out.println("Gameplay Screen");
        }
        else if(menuSelection.equals("exit")){
            System.out.println("Closing..");
            System.exit(0);
        }
        else System.out.println("Invalid selection.");
    }

    /*
    * handles setting up different layouts for the window
    */
    public void setLayout(String layout){
        layout.toLowerCase();
        
        switch(layout) {
            case "main":
                setupMainMenuLayout(gameArea);
                break;
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

    public void setupMainMenuLayout(Window w){
        
        Label header = new Label("Main Menu");
        header.setBounds(345, 100, 100, 50);

        Button start = new Button("Start");
        start.setBounds(325, 200, 100, 50);

        Button load = new Button("Load");
        load.setBounds(325, 300, 100, 50);

        Button exit = new Button("Exit");
        // exit button functionality
        exit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });

        exit.setBounds(325, 400, 100, 50);

        w.add(header);
        w.add(start);
        w.add(load);
        w.add(exit);
    }

    /* window within the main frame to display game contents
    */
    class DisplayWindow extends Window{
        public DisplayWindow(Frame container, int status){
            super(container);
            
            // setup with default values
            setSize(750, 900);
            setLocationRelativeTo(container); // location should always be relative to parent container
            setBackground(Color.WHITE);
            setLayout(null);
        }

            /* updates location relative to the GameWindow
            */
            public void updatePosition()
            {
            setLocationRelativeTo(this.getParent());
            }
    }

}