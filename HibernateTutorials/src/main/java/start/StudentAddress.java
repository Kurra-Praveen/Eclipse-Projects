package start;

import javax.persistence.Embeddable;

@Embeddable
public class StudentAddress {
	
	private String Area;
	
	private String city;
	
	private int pincode;

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public StudentAddress(String area, String city, int pincode) {
		Area = area;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "StudentAddress [Area=" + Area + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public StudentAddress() {
	}
	

}
