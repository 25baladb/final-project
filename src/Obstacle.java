public class Obstacle {

    int x;
    int y;
    int s;

    public Obstacle(){
        x = (int)(Math.random() * 1100) + 100;
        y = (int) (Math.random() * 600);
        s = (int)(Math.random() * 60) + 40;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getSize(){
        return s;
    }

    public void setX(int newX){
        x = newX;
    }


    public void display(){
        Main.app.fill(174, 235, 250);
        Main.app.strokeWeight(0.5f);
        Main.app.stroke(21, 18, 107);
        Main.app.ellipse(x, y, s, s);
    }

}
