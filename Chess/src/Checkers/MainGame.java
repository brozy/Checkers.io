package checkers;

import java.awt.*;

public class Game extends Canvas implements Runnable {

    public synchronized void start(){

    }

    public static final int WIDTH =820, HEIGHT = 820;

    public Game(){
        new Window(WIDTH, HEIGHT, "Nowij game blet", this);
    }

    public void run(){

    }


    public static void main(String args[]){
        new Game();
    }
}
