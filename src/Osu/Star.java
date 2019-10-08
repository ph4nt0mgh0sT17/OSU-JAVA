package Osu;

import com.sun.tools.javadoc.Start;

public class Star {

	// Member fields

	String name;
	int mass;

	Planet firstPlanet;
	Planet secondPlanet;

	public Star(String name, int mass, Planet firstPlanet, Planet secondPlanet) {
		this.name = name;
		this.mass = mass;

		this.firstPlanet = firstPlanet;
		this.secondPlanet = secondPlanet;
	}

	@Override
	public String toString() {
		return String.format("The name: %s; The mass: %s; \n\tFirst planet: %s; \n\tSecond Planet: %s", name, mass, firstPlanet, secondPlanet);
	}
}
