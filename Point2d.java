public class Point2d{

	int x;
	int y;

	public Point2d(){}

	public Point2d(int x, int y){
		setX(x);
		setY(y);
	}
	public void setX(int x){
		this.x = x;
	}


	public int getX(){
		return x;
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return y;
	}

	public float distance(Point2d other){
		float xdiff = other.getX() - getX();
		float ydiff = other.getY() - getY();
		float sqrdiff = xdiff*xdiff + ydiff * ydiff;
		float d = (float) Math.sqrt(sqrdiff);
		return d;
	}

	public static void main(String[] args){

		Point2d p1 = new Point2d(3,5);
		Point2d p2 = new Point2d(3,10);

		System.out.println(p1.distance(p2));

	}
}
