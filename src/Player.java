public class Player {

    int x;
    float y;
    int s;
    public Player(){
        x = 25;
        y = 520;
        s = 30;
    }

    public int getX(){
        return x;
    }

    public float getY(){
        return y;
    }
    public int getRadius(){
        return s;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(float newY){
        y = newY;
    }
    public void display(){
        Main.app.fill(235, 192, 52);
        Main.app.noStroke();
        Main.app.ellipse(x, y, s, s);
        Main.app.fill(0);
        Main.app.ellipse(x - 5, y - 5, 5, 5);
        Main.app.ellipse(x + 5, y - 5, 5, 5);
        Main.app.strokeWeight(4);
        Main.app.line(x - 5, y + 5, x + 5, y + 5);
    }

}
