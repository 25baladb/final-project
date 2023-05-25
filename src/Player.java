public class Player {

    int x;
    float y;
    int s;
    public Player(){
        x = 25;
        y = 580;
        s = 30;
    }

    public int getX(){
        System.out.println("x: " + x);
        return x;
    }

    public float getY(){
        System.out.println("y: " + y);
        return y;
    }
    public int getRadius(){
        System.out.println("s: " + s);
        return s;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(float newY){
        y = newY;
    }
    public void display(){
        Main.app.fill(0);
        Main.app.noStroke();
        Main.app.ellipse(x, y, s, s);
    }

}
