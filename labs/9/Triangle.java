public class Triangle 
extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	/** Construct default Triangle object */
	public Triangle() {
		side1 = side2 = side3 = 1.0;
	}

	/** Construct a triangle with specified side1, side2 and side3 */
	public Triangle(double side1, double side2, double side3) 

			throws IllegalTriangleException{
		//since 2 sides added together need to be greater than or equal to the other side, this is the opposite.
		if(side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2)
			//if statement above is true then it will throw the exception 
			throw new IllegalTriangleException(side1, side2, side3);



		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	/** Return side1 */
	public double getSide1() {
		return side1;
	}

	/** Return side2 */
	public double getSide2() {
		return side2;
	}

	/** Return side3 */
	public double getSide3() {
		return side3;
	}

	/** Return area of this triangle */
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	/** Return perimeter of this triangle */
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	/** Return a string description for the triangle */
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}