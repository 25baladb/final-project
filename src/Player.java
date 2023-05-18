public class Player {

    int x;
    int y;

    public Player(){
        x = 15;
        y = 570;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }
    public void display(){
        Main.app.fill(0);
        Main.app.noStroke();
        Main.app.rect(x, y, 20, 30);
    }

}
