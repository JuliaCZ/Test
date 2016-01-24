package lab03;

public class candys extends sweet implements Inaslednik2{
	public String country_candys;
	private double ves_candys;
	
	public String getCountry() {
		return country_candys;
	}
	public void setCountry(String country) {
		this.country_candys = country;
	}
	public double getVes() {
		return ves_candys;
	}
	public void setVes(double ves) {
		this.ves_candys = ves;
	}
	/*Конструкторы*/
	public candys(double costs, String name, String country, double ves){
		super(costs, name);
		this.country_candys = country;
		this.ves_candys = ves;

	}
	public candys() throws MyException {/*
		this.setCosts(10);
		this.setCountry("Ukraine");
		this.setName("Null_candys");
		this.setVes(1.05);*/
	}
	/**/
	public String toString()
	{
		return "Name of candys : " + getName() + ", price : " + getCosts() + ", country : " + getCountry() + ", ves : " + getVes() + ".";
	}
	
}
