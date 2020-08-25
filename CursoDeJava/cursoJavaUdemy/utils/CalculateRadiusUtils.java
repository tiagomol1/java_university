package utils;

public class CalculateRadiusUtils {
	
	public final double PI = 3.14;
	
	public double circunference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public double volume(double radius) {
		return 4.0 * PI *  radius * radius * radius / 3.0;
	}
	
}
