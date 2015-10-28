package coordinates;

public class M2 {
	private double[][] matrix;

	public M2(double a, double b, double c, double d) {
		this.matrix = new double[2][2];
		this.matrix[0][0] = a;
		this.matrix[0][1] = b;
		this.matrix[1][0] = c;
		this.matrix[1][1] = d;
	}

	public V2 vectorMult(V2 vector) {
		double x, y;
		x = this.matrix[0][0]*vector.getX() + this.matrix[0][1]*vector.getY();
		y = this.matrix[1][0]*vector.getX() + this.matrix[1][1]*vector.getY();
		return new V2(x, y);
	}

	public M2 matrixMult(M2 matrix) {
		double a, b, c, d;
		a = this.matrix[0][0]*matrix.getMatrix()[0][0] +
				this.matrix[0][1]*matrix.getMatrix()[1][0];
		b = this.matrix[0][0]*matrix.getMatrix()[0][1] +
				this.matrix[0][1]*matrix.getMatrix()[1][1];
		c = this.matrix[1][0]*matrix.getMatrix()[0][0] +
				this.matrix[1][1]*matrix.getMatrix()[1][0];
		d = this.matrix[1][0]*matrix.getMatrix()[0][1] +
				this.matrix[1][1]*matrix.getMatrix()[1][1];
		return new M2(a, b, c, d);
	}
	
	public V2 vectorMult(V2 vector) {
		double a, b;
		a = 
	}

	public double[][] getMatrix() {
		return this.matrix;
	}
}
