public class Obstacle {

    int x;
    int y;
    int s;

    public Obstacle(){
        x = (int)(Math.random() * 1100) + 100;
        y = (int) (Math.random() * 200) + 400;
        s = (int)(Math.random() * 60) + 40;
    }

    public int getX(){
        System.out.println("x: " + x);
        return x;
    }

    public int getY(){
        System.out.println("y: " + y);
        return y;
    }

    public int getSize(){
        System.out.println("s: " + s);
        return s;
    }

    public void display(){
        Main.app.fill(174, 235, 250);
        Main.app.strokeWeight(0.5f);
        Main.app.stroke(21, 18, 107);
        Main.app.ellipse(x, y, s, s);
    }

}
