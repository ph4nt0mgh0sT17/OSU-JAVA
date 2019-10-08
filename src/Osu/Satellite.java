package Osu;

public class Satellite {

	// Member fields
	String name;
	int radius;

	Planet planet;


	public Satellite(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}

	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	public String getReport() {
		return String.format("The name: %s; The radius: %s; Its planet: %s", name, radius, planet.getName());
	}

	@Override
	public String toString() {
		return String.format("The name: %s; The radius: %s", name, radius);
	}
}
