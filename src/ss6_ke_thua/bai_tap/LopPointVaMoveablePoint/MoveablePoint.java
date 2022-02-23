package ss6_ke_thua.bai_tap.LopPointVaMoveablePoint;

import ss6_ke_thua.bai_tap.LopPoint2DVaLopPoint3D.Point2D;

public class MoveablePoint extends Point2D {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MoveablePoint() {

    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void getSpeed() {
        float[] mangg = {getX(), getY()};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
              " x ="+  (getX() + ", y=" + getY()) +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + (" " + ySpeed) +
                '}';
    }

    public MoveablePoint move() {
        setX(this.getX() + this.xSpeed);
        setY(this.getY() + this.xSpeed);
        return this;
    }
}
