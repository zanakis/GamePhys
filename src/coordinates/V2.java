package coordinates;

public class V2 {
	private double x;
	private double y;
	
	public V2(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public V2 add(V2 vector) {
		return new V2(this.x + vector.getX(), this.y + vector.getY());
	}
	
	public V2 substract(V2 vector) {
		return new V2(this.x - vector.getX(), this.y - vector.getY());
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
}
