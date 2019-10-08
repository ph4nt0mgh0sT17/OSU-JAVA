package Osu;

import com.sun.tools.javadoc.Start;

public class Star {

	// Member fields

	String name;
	int mass;

	Planet firstPlanet;
	Planet secondPlanet;

	/**
	 * The constructor of the Star.
	 * @param name The name.
	 * @param mass The mass.
	 * @param firstPlanet The first planet.
	 * @param secondPlanet The second planet.
	 */
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
