package Osu;

public class Satellite {

	// Member fields
	String name;
	int radius;

	Planet planet;

	/**
	 * The constructor of the Satellite.
	 * @param name The name of the satellite.
	 * @param radius The radius of the satellite.
	 */
	public Satellite(String name, int radius) {
		this.name = name;
		this.radius = radius;
	}

	/**
	 * Sets the planet of the Satellite.
	 * @param planet The planet.
	 */
	public void setPlanet(Planet planet) {
		this.planet = planet;
	}

	/**
	 * Gets the report of the Satellite.
	 */
	public String getReport() {
		return String.format("The name: %s; The radius: %s; Its planet: %s", name, radius, planet.getName());
	}

	@Override
	public String toString() {
		return String.format("The name: %s; The radius: %s", name, radius);
	}
}
