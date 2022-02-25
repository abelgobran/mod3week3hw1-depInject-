package Mod3homework;

public class AnotherPerson {
	String name;
	int age;
	String address;
	
	
	//House house = new House();
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
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
//	}
//	public House getHouse() {
//		return house;
//	}
//	public void setHouse(House house) {
//		this.house = house;
//	}
	
	public void display() {
		System.out.println("")
	}
	@Override
	public String toString() {
		return "AnotherPerson [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	

}
