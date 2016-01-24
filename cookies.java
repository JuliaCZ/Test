package lab03;

public class cookies extends sweet implements Inaslednik1{
	private String country_cookies;
	private double ves_cookies;

	public cookies(double costs, String name, String country_cookies, double ves){
		super(costs, name);
		this.country_cookies = country_cookies;
		this.ves_cookies = ves;
	}
	public cookies() throws MyException{/*
		this.setCosts(10);
		this.setCountry("Ukraine");
		this.setName("Null_cookies");
		this.setVes(1);*/
	}
	
	public String getCountry() {
		return country_cookies;
	}
	public void setCountry(String country_cookies) {
		this.country_cookies = country_cookies;
	}
	public double getVes() {
		return ves_cookies;
	}
	public void setVes(double ves) {
		this.ves_cookies = ves;
	}
	public String toString()
	{
		return "Name of cookies : " + getName() + ", price : " + getCosts() + ", country : " + getCountry() + ", ves : " + getVes() + ".";
	}

}
