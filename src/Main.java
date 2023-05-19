import processing.core.PApplet;
public class Main extends PApplet{

    public static PApplet app;
    Player jumpingMan;
    SteppingStones firstStone;
    Obstacle bubble;

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
        firstStone = new SteppingStones();
        jumpingMan = new Player();
        bubble = new Obstacle();
    }

    public void draw() {
        background(135, 225, 250);
        text("Use w to jump up onto the stones. Watch out for the bubbles!", 200, 250);
        //pause
        background(135, 225, 250);
        clouds();
        drawGrass();
        jumpingMan.display();
        bubble.display();
        firstStone.display();
        firstStone.move();
    }


    public void keyPressed(){
        if(key == 'w'){
            Jump(jumpingMan.getY());
            jumpingMan.display();
        }
    }

    public void Jump(float moveY){
        moveY -= 20;
        jumpingMan.setY(moveY);
        jumpingMan.display();
        //pause
        /*while(moveY != 570){
            jumpingMan.setY(moveY);
            jumpingMan.display();
            moveY += 0.001;

        }*/
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
