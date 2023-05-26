public class SteppingStones {
    private int x;
    private int y;

    public SteppingStones(){
        x = 1180;
        y = (int)(Math.random() * 600);
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

    public void display(){
        int r = (int)(Math.random() * 255);
        int g = (int)(Math.random() * 255);
        int b = (int)(Math.random() * 255);
        Main.app.fill(r, g, b);
        Main.app.strokeWeight(2);
        Main.app.stroke(46, 51,51);
        Main.app.ellipse(x, y, 30, 30);
    }

}
