package Osu;

public class Planet {

	// Member fields

	String name;
	String type;

	Satellite moon;

	public Planet(String name, String type, Satellite moon) {
		this.name = name;
		this.type = type;
		this.moon = moon;

		moon.setPlanet(this);
	}

	public Satellite getMoon() {
		return this.moon;
	}

	public String getName() {
		return this.name;
	}

	public void setMoon(Satellite satellite) {
		this.moon = satellite;
	}

	@Override
	public String toString() {
		return String.format("The name: %s; The type: %s; \n\t\tThe moon: %s", name, type, moon);
	}
}
