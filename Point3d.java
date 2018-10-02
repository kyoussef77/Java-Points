public class Point3d extends Point2d {

  private int z;

  public Point3d(){}

  public Point3d(int x, int y, int z) {
    super(x,y);
    setZ(z);
}

  public void setZ(int z) {
    this.z = z;
  }

  public int getZ() {
    return z;
  }

  public float getDistance(Point2d other) {
    return super.distance(other);
  }

  public float distance(Point3d other) {
    Point2d tempPoint = new Point2d();
    tempPoint.setX(other.x);
    tempPoint.setY(other.y);

    float temp = getDistance(tempPoint);
    float zdiff = other.getZ() - getZ();

    float sqrdiff = (temp*temp) + (zdiff*zdiff);
    float d = (float) Math.sqrt(sqrdiff);
    return d;
  }

  public static void main(String[] args) {
      Point3d p1 = new Point3d(3,5,5);
      Point3d p2 = new Point3d(3,10,5);
      System.out.println(p1.distance(p2));

      Point2d p3 = new Point2d(3,0);
      System.out.println(p1.distance(p3));
    }
}
