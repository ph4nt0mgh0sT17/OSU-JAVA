package Osu;

public class Address {

	// Member fields

	String street;
	String city;
	int zipCode;

	// Constructors

	/**
	 * Constructs a person with name, surname and age.
	 * @param street The street.
	 * @param city The city.
	 * @param zipCode The zipcode.
	 */
	public Address(String street, String city, int zipCode) {
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return String.format("%s, %s; %d", this.street, this.city, this.zipCode);
	}
}
