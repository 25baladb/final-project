import processing.core.PApplet;

import java.util.ArrayList;

public class Main extends PApplet{

    public static PApplet app;
    Player jumpingMan;
    ArrayList<SteppingStones> stones;
    private boolean dead = false;
    private int points = 0;
    private boolean up = false;
    ArrayList<Obstacle> bubbles;
    Obstacle bubble;
    private boolean startingScreen = true;
    public boolean jump = false;
    private boolean fall = false;
    private int drawCounter;

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
        frameRate(45);
        jumpingMan = new Player();
        bubble = new Obstacle();
        bubbles = new ArrayList<Obstacle>();
        stones = new ArrayList<SteppingStones>();

    }

    public void draw() {
        if(startingScreen){
            background(135, 225, 250);
            textSize(20);
            text("Use space to go down and u to go up. Press any key to play. Watch out for the bright obstacles, but hit the bubbles!", 50, 250);
        } else {
            drawCounter++;
            System.out.println(drawCounter);
            background(135, 225, 250);
            clouds();
            drawGrass();
            if(drawCounter % 40 == 0) {
                stones.add(new SteppingStones());
            }
            if(drawCounter % 60 == 0){
                bubbles.add(new Obstacle());
            }
            for(int i = 0; i < bubbles.size(); i++){
                bubbles.get(i).setX(bubbles.get(i).getX() - 1);
                bubbles.get(i).display();
                if(bubbles.get(i).getX() == bubbles.get(i).getSize()/2 * -1){
                    bubbles.remove(i);
                    i--;
                }
                if (dist(jumpingMan.getX(), jumpingMan.getY(), bubble.getX(), bubble.getY()) <= bubble.getSize() / 2 + jumpingMan.getRadius() / 2) {
                    points += 10;
                }
            }

            for(int i = 0; i < stones.size(); i++){
                stones.get(i).setX(stones.get(i).getX() - 3);
                stones.get(i).display();
                if(stones.get(i).getX() == -31){
                    stones.remove(i);
                    i--;
                }
                if(dist(jumpingMan.getX(), jumpingMan.getY(), stones.get(i).getX(), stones.get(i).getY()) <= 15 + jumpingMan.getRadius()/2){
                    dead = true;
                }
            }
            jumpingMan.display();
            if(dead){
                background(99, 99, 99);
                stroke(0);
                text("Oh no! You died :(", 590, 200);
                text("Your points: " + points, 590, 250);
            }
            if(jumpingMan.getY() >= 50){
                jumpingMan.setY(jumpingMan.getY() - 1);
                    if(dist(jumpingMan.getX(), jumpingMan.getY(), bubble.getX(), bubble.getY()) <= bubble.getSize()/2 + jumpingMan.getRadius()/2){
                        dead = true;
                    }
                jump = false;
            }
            if(fall){
                int i = 0;
                while(i <= 50) {
                    jumpingMan.setY(jumpingMan.getY() + 1);
                    i++;
                }
                fall = false;
            }
            if(up){
                int j = 0;
                while(j <= 50){
                    jumpingMan.setY(jumpingMan.getY() - 1);
                    j++;
                }
                up = false;
            }
        }
    }


    public void keyPressed(){
        if(key == ' '){
            fall = true;
        }
        if(key == 'u'){
            up = true;
        }
        if(keyPressed){
            startingScreen = false;
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
