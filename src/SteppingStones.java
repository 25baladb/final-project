public class SteppingStones {
    private int x;
    private int y;

    public SteppingStones(int x, int y){
        super();
        this.x = x;
        this.y = y;
        x = 1180;
        y = (int)(Math.random() * 145) + 400;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    ellipse(x, y, 60, 60);

}
