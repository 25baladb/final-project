public class Obstacle {

    int x;
    int y;
    int s;

    public Obstacle(){
        x = (int)(Math.random() * 1200);
        y = (int) (Math.random() * 200) + 400;
        s = (int)(Math.random() * 110) + 40;
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

    public void display(){
        Main.app.ellipse(x, y, s, s);
    }

}
