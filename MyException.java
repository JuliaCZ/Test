package lab03;

public class MyException extends Exception{
	private double cena1;
    public double getCena(){//throws MyException{
    	/*if(cena1 < 0)
    		throw new MyException("Цена не может быть меньше нуля", cena1);*/
    	return cena1;
    	}
    private static final long serialVersionUID = 1234L;
    public MyException(String message, double cena){
        super(message);
        cena1 = cena;
    }
	public String toString()
	{
		return "ERROR : Цена меньше нуля!";
	}

}
