public class Player {

    int x;
    float y;
    int s;
    public Player(){
        x = 15;
        y = 570;
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
        Main.app.fill(0);
        Main.app.noStroke();
        Main.app.ellipse(x, y, s, s);
    }

}
