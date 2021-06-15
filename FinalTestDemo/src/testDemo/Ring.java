package testDemo;

public class Ring {
	private int ringID;
	private int ringSize;
	private String material;
	private int width;
	
	
	
	public Ring(int ringID, int ringSize, String material, int width) {
		super();
		this.ringID = ringID;
		this.ringSize = ringSize;
		this.material = material;
		this.width = width;
	}
	public int getRingID() {
		return ringID;
	}
	public void setRingID(int ringID) {
		this.ringID = ringID;
	}
	public int getRingSize() {
		return ringSize;
	}
	public void setRingSize(int ringSize) {
		this.ringSize = ringSize;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Ring [ringID=" + ringID + ", ringSize=" + ringSize + ", material=" + material + ", width=" + width
				+ "]";
	}

	
	
}
