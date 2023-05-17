public class SteppingStones {
    private int x;
    private int y;

    public SteppingStones(){
        x = 1180;
        y = (int)(Math.random() * 145) + 400;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void display(){
        Main.app.ellipse(x, y, 60, 60);
    }

}
