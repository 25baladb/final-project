public class Jump {

    int moveY;

    public Jump(int y){
        moveY = y;
    }

    public void movePlayer(){
        moveY += 20;
        Player.setY(moveY);
    }

}
