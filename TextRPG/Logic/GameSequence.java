package Logic;

import GUI.GameWindow;

public class GameSequence {
    GameWindow game;

    public void setup(){
        game = new GameWindow();
    }

    public void gamePlayLoop(int loopVal){
        
        while(loopVal > 0){
            System.out.println("Game Logic Running:");
            game.menuSequence("Main");
            loopVal = 0;
            System.out.println("Loop complete");    
        }
    }
}