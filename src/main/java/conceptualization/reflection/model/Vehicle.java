package conceptualization.reflection.model;

public class Vehicle implements Moveable {

	@Override
	public void move() {
		System.out.println("Car has max. speed of 140 kmph.");
	}
}
