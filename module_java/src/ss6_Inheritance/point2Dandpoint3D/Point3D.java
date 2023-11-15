package ss6_Inheritance.point2Dandpoint3D;

public class Point3D extends Point2D{
    private float z;

    public Point3D(){
        z = 0.0f;
    }
    public Point3D(float z){
        this.z = z;
    }
    public Point3D(float z, float x, float y){
        this.z = z;
        setX(x);
        setY(y);
    }
    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z = z;
    }

    public float[] getXZY(){
        float[] array = {this.getX(), this.getY(), getZ()};
        return array;
    }
    public void setXYZ(float x, float y, float z){
        setX(x);
        setY(y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "vector z = " + getZ() + " which is a subclass = " + super.toString();
    }
}
