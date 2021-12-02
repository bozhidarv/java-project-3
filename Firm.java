public class Firm {
	private String address;
    private int number;
	private Person MOL;

	public Firm() {
		this.MOL = new Person();
	}

	public Firm(String address, int number, Person MOL) {
		this.address = address;
		this.MOL = MOL;
	}


	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Person getMOL() {
		return this.MOL;
	}

	public void setMOL(Person MOL) {
		this.MOL = MOL;
	}

	@Override
	public String toString() {
		return "{" +
			" address='" + this.getAddress() + "'" +
			", number='" + this.getNumber() + "'" +
			", MOL='" + this.getMOL() + "'" +
			"}";
	}
}
