import processing.core.PApplet;

import static java.lang.Thread.sleep;

public class Main extends PApplet{

    public static PApplet app;
    Player jumpingMan;
    SteppingStones firstStone;
    Obstacle bubble;
    private boolean startingScreen/* = true*/;

    public float jumpingSpeed = 0.05f;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main(){
        super();
        app = this;
    }

    public void settings(){
        size(1200, 600);
    }

    public void setup(){
        frameRate(5);
        firstStone = new SteppingStones();
        jumpingMan = new Player();
        bubble = new Obstacle();
    }

    public void draw() {
        if(startingScreen){
            background(135, 225, 250);
            textSize(40);
            text("Use space to jump up onto the stones. Watch out for the bubbles!", 50, 250);
            //sleep(5000)
            startingScreen = false;
        }
        background(135, 225, 250);
        //clouds();
        //drawGrass();
        jumpingMan.display();
        bubble.display();
        firstStone.display();
        if(firstStone.getX() >= 100){
            firstStone.setX(firstStone.getX()-1);
            firstStone.display();
            //Main.app.redraw();
        }
        //firstStone.move();
    }


    public void keyPressed(){
        if(key == ' '){
            frameRate(5);
            jump();
            frameRate(60);
        }
    }

    public void jump(){
        int i = 0;
//        while(i <= 50){
//            jumpingMan.setY(jumpingMan.getY() - jumpingSpeed);
//            double xx = (double)(jumpingMan.getX() - bubble.getX());
//            double yy = (double)(jumpingMan.getY() + 20 - bubble.getY());
//            if(Math.pow(xx, 2) + Math.pow(yy, 2) <= Math.pow(bubble.getSize(), 2)){
//                dead();
//            }
//            else {
//                jumpingMan.display();
//            }
//            //sleep
//            i++;
//        }
        //sleep
        fall();
    }

    public void fall(){
        while(jumpingMan.getY() + 30 <= 580) {
            jumpingMan.setY(jumpingMan.getY() + jumpingSpeed);
            jumpingMan.display();
        }
    }

    public void dead(){
        //calculate score
        background(99, 99, 99);
        stroke(0);
        text("Oh no! You died :(", 250, 550);
        text("Your score was: ", 300, 580);
    }

    public void clouds() {
        fill(255);
        noStroke();
        int c = 0;
        while(c <= 5) {
            int x1 = (int) (Math.random() * 1200);
            int y = (int) (Math.random() * 50) + 30;
            ellipse(x1, y, 60, 35);
            ellipse(x1 + 35, y, 25, 20);
            ellipse(x1 + 10, y + 10, 100, 15);
            c++;
        }
    }

    public void drawGrass(){
        int x = 0;
        int y;
        strokeWeight(3);
        stroke(22, 201, 40);
        for(int i = 0; i < 600; i++){
            y = (int)(Math.random() * 10);
            line(x, 600, x, 580 + y);
            x += 2;
        }
    }

}
