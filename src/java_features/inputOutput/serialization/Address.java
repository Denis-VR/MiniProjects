package java_features.inputOutput.serialization;

public class Address {
	private String street;
	private int numberOfHouse;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumberOfHouse() {
		return numberOfHouse;
	}

	public void setNumberOfHouse(int numberOfHouse) {
		this.numberOfHouse = numberOfHouse;
	}

	public Address(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address{" +
				"street='" + street + '\'' +
				", numberOfHouse=" + numberOfHouse +
				'}';
	}
}
