package application;

public class Ring {
	private int id;
	private int ringsize;	
	private String material;
	private int width;

	public Ring() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Ring(int id, int ringsize, String material, int width) {
		super();
		this.id = id;
		this.ringsize = ringsize;
		this.material = material;
		this.width = width;
	}



	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRingsize() {
		return ringsize;
	}

	public void setRingsize(int ringsize) {
		this.ringsize = ringsize;
	}



	@Override
	public String toString() {
		return "Ring [id=" + id + ", ringsize=" + ringsize + ", material=" + material + ", width=" + width + "]";
	}

}
