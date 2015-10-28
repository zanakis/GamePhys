package coordinates;

public class test {
	public static void main(String[] args) {
		M2 m1 = new M2(1, 2, 3, 4);
		M2 m2 = new M2(2, 0, 1, 2);
		System.out.println(m1.matrixMult(m2).getMatrix()[1][0]);
	}
}
