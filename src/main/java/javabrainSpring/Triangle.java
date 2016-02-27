package javabrainSpring;

public class Triangle {

	private Point pointA, pointB, PointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void draw() {
		System.out.println("points"+getPointA()+","+getPointB()+","+getPointC());
	}

}
