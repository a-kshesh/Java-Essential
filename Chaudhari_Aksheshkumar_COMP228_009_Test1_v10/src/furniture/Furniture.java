package furniture;

import main.Type;
import processors.Foldable;

public abstract class Furniture implements Foldable {
	public int legs;
	 public String name;
	 public String foldable;
	 
	 
	public Furniture(int legs, String name,String foldable) {
		
		this.legs = legs;
		this.name = name;
		this.foldable=foldable;
	}


	public void fold()
	{
		System.out.println("furniture is foldable");
	}

 
}
