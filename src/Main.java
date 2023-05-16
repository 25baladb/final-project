import processing.core.PApplet;
public class Main extends PApplet{

    public static PApplet app;

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

    public void draw() {
        background(135, 225, 250);
        //clouds();
        //drawGrass();
        new SteppingStones();

    }






    public void clouds() {
        fill(255);
        noStroke();
        int x1 = (int) (Math.random() * 1200);
        int y = (int) (Math.random() * 50) + 30;
        ellipse(x1, y, 60, 35);
        ellipse(x1 + 35, y, 25, 20);
        ellipse(x1 + 10, y + 10, 100, 15);
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
