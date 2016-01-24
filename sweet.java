package lab03;

public abstract class sweet implements Isweet{
	private static double price = 0;
	private static int count = 0;
	private double costs;
	private String name;
	/*Конструкторы*/
	public sweet(double costs, String name)
	{
		super();
		this.costs = costs;
		this.name = name;
		count ++;
		price += costs;
	}
	public sweet() throws MyException
	{/*
		this.setName("Null_sweet");
		this.setCosts(10);*/
		count ++;
		price += costs;
	}
	/**/
	public static void price_avg()
	{
		double avg = price/count;
		System.out.println(avg);
	}
	
	/**
	 * @param args
	 */
	public double getCosts() {
		return costs;
	}
	public void setCosts(double costs) throws MyException{
		if(costs < 0.0)
			throw new MyException("Нельзя задать цену меньше нуля", costs);
		this.costs = costs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract String toString();
	
	
}
