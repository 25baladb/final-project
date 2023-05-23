public class Player {

    int x;
    float y;

    public Player(){
        x = 15;
        y = 540;
    }

    public int getX(){
        return x;
    }

    public float getY(){
        return y;
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
        Main.app.rect(x, y, 20, 30);
    }

}
