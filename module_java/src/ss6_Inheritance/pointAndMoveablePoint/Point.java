package ss6_Inheritance.pointAndMoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] array = {this.x, this.y};
        return array;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "var x = " + getX() + " var y = " + getY();
    }
}
