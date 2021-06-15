package furniture;

public class Chair extends Furniture {
 int legs;
 String name;
public Chair(int legs, String name, String foldable) {
	super(legs, name,foldable);
}

@Override
public void fold()
{
	System.out.println("chair is foldable");
}
 
}
