package Osu;

public class Car {

	// Member fields

	private String mBrand;
	private String mModel;
	private String mColor;

	private int mConsumption;
	private int mPrice;
	private double mWeight;


	// Constructors

	/**
	 * Default constructor for the Animal.
	 *
	 * @param brand A brand of the car.
	 * @param model A model of the car.
	 * @param color A color of the car.
	 * @param consumption A consumption of the car
	 * @param price A price of the car.
	 * @param weight A weight of the car.
	 */
	public Car(String brand, String model, String color, int consumption, int price, int weight) {

		mBrand = brand;
		mModel = model;
		mColor = color;

		mConsumption = consumption;
		mPrice = price;
		mWeight = weight;
	}


	// Methods

	/**
	 * Gets a brand of the car.
	 * @return A brand of the car.
	 */
	public String getBrand() {
		return mBrand;
	}

	/**
	 * Gets a model of the car.
	 * @return A model of the car.
	 */
	public String getModel() {
		return mModel;
	}

	@Override
	public String toString() {
		return String.format("This car %s %s %s has: %s consumption; %s $; %s KG.", mBrand, mModel, mColor, mConsumption, mPrice, mWeight);
	}
}