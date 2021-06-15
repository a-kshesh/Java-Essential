package furniture;

public class Sofa extends Furniture {
	 int legs;
	 String name;
	public Sofa(int legs, String name,String foldable) {
		super(legs, name,foldable);
	}
	
	@Override
	public void fold()
	{
		System.out.printf("chair is foldable");
	}
	 
}
