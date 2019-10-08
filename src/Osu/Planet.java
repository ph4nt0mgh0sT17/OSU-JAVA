package Osu;

public class Planet {

	// Member fields

	String name;
	String type;

	Satellite moon;

	/**
	 * The constructor of Planet.
	 * @param name The name.
	 * @param type The type.
	 * @param moon The moon (Satellite) of the Planet.
	 */
	public Planet(String name, String type, Satellite moon) {
		this.name = name;
		this.type = type;
		this.moon = moon;

		moon.setPlanet(this);
	}

	/**
	 * Gets the moon.
	 */
	public Satellite getMoon() {
		return this.moon;
	}

	/**
	 * Gets the name of the planet.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a moon of the planet.
	 * @param satellite The moon.
	 */
	public void setMoon(Satellite satellite) {
		this.moon = satellite;
	}

	@Override
	public String toString() {
		return String.format("The name: %s; The type: %s; \n\t\tThe moon: %s", name, type, moon);
	}
}
