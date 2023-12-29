package reflectionAPI;

public class Person {

	private String name = "John";
    private int age = 30;
    private int uidNumber = 5555;
    private int pinCode = 452002;
    private long contactNumber = 123456789L;
    private float height = 6.1242f;
    private double weight = 75.2564;
    private char gender = 'M';
    private boolean active = true;
	
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getUidNumber() {
		return uidNumber;
	}
	public void setUidNumber(int uidNumber) {
		this.uidNumber = uidNumber;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
    
    
}
