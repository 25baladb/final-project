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
        Main.app.fill(109, 114, 115);
        Main.app.strokeWeight(2);
        Main.app.stroke(46, 51,51);
        Main.app.ellipse(x, y, 60, 60);
    }

    public void setX(int newX){
        x = newX;
    }

//    public void move(){
//        if(steppingStone.getX() >= 100){
//            x--;
//            Main.app.frameRate(1);
//            display();
//            Main.app.redraw();
//        }
//    }

}
