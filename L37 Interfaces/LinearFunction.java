public class LinearFunction implements LinearFunctionMethods{
	
	//y = mx + b, root = x-intercept
	double m, x, b, y, root;

	public LinearFunction(double slope, double yInte) { 
		m = slope; 
		b = yInte;
	}
	public double getSlope() { 
		return m;
	} 
	public double getYintercept() { 
		return b;
	} 
	public double getRoot() { 
		root = -b/m; 
		return root;
	}
	
	public double getYvalue(double x) {
		y = m*x+b;
		return y;
	}
	
	public double getXvalue(double y) {
		x = (y-b)/m;
		return x;
	}

}
