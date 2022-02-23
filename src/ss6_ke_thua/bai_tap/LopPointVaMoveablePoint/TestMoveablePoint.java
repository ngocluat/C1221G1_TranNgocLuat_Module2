package ss6_ke_thua.bai_tap.LopPointVaMoveablePoint;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);

        moveablePoint.setX(10f);
        moveablePoint.setY(10000.1f);
        moveablePoint.setXSpeed(11.1f);
        moveablePoint.setYSpeed(11.1f);
        System.out.println(moveablePoint);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}
