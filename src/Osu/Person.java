package Osu;

public class Person {

	// Member fields

	String name;
	String surname;
	int age;

	Address address;

	// Constructors

	/**
	 * Constructs a person with name, surname and age.
	 * @param name The name of the person.
	 * @param surname The surname of the person.
	 * @param age The age of the person.
	 */
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;

		this.address = null;
	}

	/**
	 * Constructs a person with name, surname and age.
	 * @param name The name of the person.
	 * @param surname The surname of the person.
	 * @param age The age of the person.
	 * @param address The address of the person
	 */
	public Person(String name, String surname, int age, Address address) {
		this.name = name;
		this.surname = surname;
		this.age = age;

		this.address = address;
	}

	/**
	 * Sets the address.
	 * @param address The address.
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return String.format("Person: %s %s; Age: %d; %s", this.name, this.surname, this.age, this.address);
	}
}
