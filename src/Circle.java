public class Circle {
	
	public double radius;
		
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return Math.PI * (radius * 2);
	}
	
	public String formatNumber(double f) {
		return String.format("%.2f", f);
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
	}
	
	public double getArea() {
		return Math.PI * (radius * radius);
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	
}