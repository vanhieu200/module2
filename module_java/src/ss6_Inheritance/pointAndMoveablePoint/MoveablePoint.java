package ss6_Inheritance.pointAndMoveablePoint;

public class MoveablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }
    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint( float xSpeed, float ySpeed,float x, float y){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        setX(x);
        setY(y);
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return  super.toString() + " Speed = (" + this.xSpeed + " , " + this.ySpeed + ")";
    }

    public void move(){
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
    }


}
