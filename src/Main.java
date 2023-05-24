import processing.core.PApplet;

import static java.lang.Thread.sleep;

public class Main extends PApplet{

    public static PApplet app;
    Player jumpingMan;
    SteppingStones firstStone;
    private boolean dead = false;
    Obstacle bubble;
    private boolean startingScreen = true;

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
        frameRate(10);
        firstStone = new SteppingStones();
        jumpingMan = new Player();
        bubble = new Obstacle();
    }

    public void draw() {
        if(startingScreen){
            background(135, 225, 250);
            textSize(30);
            text("Use space to jump up onto the stones. Press any key to play. Watch out for the bubbles!", 50, 250);
        } else {
            background(135, 225, 250);
            clouds();
            drawGrass();
            jumpingMan.display();
            bubble.display();
            firstStone.display();
            if (firstStone.getX() >= -31) {
                firstStone.setX(firstStone.getX() - 1);
                firstStone.display();
            }
            if(dead){
                //calculate score
                background(99, 99, 99);
                stroke(0);
                text("Oh no! You died :(", 250, 550);
                text("Your score was: ", 300, 580);
            }
        }
    }


    public void keyPressed(){
        if(key == ' '){
            frameRate(5);
            jump();
            frameRate(60);
        }
        if(keyPressed){
            startingScreen = false;
        }
    }

    public void jump(){
        int i = 0;
        while(i <= 100){
            jumpingMan.setY(jumpingMan.getY() - jumpingSpeed);
            if(dist(jumpingMan.getX(), jumpingMan.getY(), bubble.getX(), bubble.getY()) <= bubble.getSize() + jumpingMan.getRadius()){
                //jumpingMan.display();
                System.out.println("you died");
                dead = true;
            }
            else {
                jumpingMan.display();
            }
            i++;
        }
        fall();//eventually only call from else in if-else statement with character landing on stepping stone
    }

    public void fall(){
        while(jumpingMan.getY() + 30 <= 580) {
            jumpingMan.setY(jumpingMan.getY() + jumpingSpeed);
            jumpingMan.display();
        }
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
