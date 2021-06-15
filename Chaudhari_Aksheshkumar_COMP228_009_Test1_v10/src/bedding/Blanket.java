package bedding;

import processors.Foldable;
import furniture.Furniture;

public class Blanket extends Furniture implements Foldable{
	String name;
	
	public Blanket(int legs, String name,String foldable) {
		super(legs, name,foldable);
	}

	@Override
	public void fold() {
		System.out.println(name +" is foldable");
		
	}
	
	
}
