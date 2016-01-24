package lab03;
import java.util.*;
public class Container<T extends sweet> {
	private sweet list1[];
	private int k = 0;
	public sweet get(int index) {
		return list1[index];
	}
	public int count()
	{
		return k;
	}
	public Container() 
	{
		list1 = new sweet[5];
	}
	public void Add(sweet ob)
	{
		if(k >= list1.length){
			//Переопределяем размерность массива +5
			list1 = Arrays.copyOf(list1, list1.length + 5);			
		}
		list1[k] = ob;
		k++;	
	}
	public java.util.Enumeration<sweet> elements() 
	{
		return new Enumerator();
	}
	class Enumerator implements java.util.Enumeration<sweet>
	{
		int pos = k;
		@Override
		public boolean hasMoreElements() 
		{
			return pos > 0;
		}
		@Override
		public sweet nextElement() 
		{
			if(pos == 0)
				throw new NoSuchElementException("list1");
			return list1[--pos];
		}
	}
public Enumeration<sweet> elementsRange(final int minValue, final int maxValue)//анонимный класс 
{
	return new Enumeration<sweet>() 
	{
		int pos = 0;
		@Override
		public boolean hasMoreElements() 
		{	
			for(; pos < list1.length; pos++)
				if (list1[pos].getCosts() >= minValue && list1[pos].getCosts() <= maxValue) {
					return true;
				}
			return false;
		}
		@Override
		public sweet nextElement() 
		{
			if(hasMoreElements())
				return list1[pos++];
			throw new NoSuchElementException("Больше элементов удовлетворяющим условию нет!");
		}
	};
}
	public void Sort()
	{
		int n = k;
		for (int i = n - 1; i >= 0; i--)
		{
			for (int j = 0; j < i; j++)
			{
				if (list1[j].getCosts() > list1[j + 1].getCosts())
				{
					sweet tmp;
					tmp = list1[j];
					list1[j] = list1[j + 1];
					list1[j + 1] = tmp;
				}
			}
		}
		
	}
	
}
