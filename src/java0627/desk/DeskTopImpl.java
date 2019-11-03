package java0627.desk;

public class DeskTopImpl implements DeskTop{
	
	private double area;
	private double thickness;
	private double diagonalLineLen;
	private String strain;
	private String material;
	

	public DeskTopImpl() {
		super();
	}

	public DeskTopImpl(double area, double thickness, double diagonalLineLen,String strain, String material) {
		super();
		this.area = area;
		this.thickness = thickness;
		this.diagonalLineLen = diagonalLineLen;
		this.strain = strain;
		this.material = material;
	}

	@Override
	public double getArea() {
		return this.area;
	}

	@Override
	public double getThicksNess() {
		return this.thickness;
	}

	@Override
	public double getDiagonalLineLen() {
		return this.diagonalLineLen;
	}

	@Override
	public String getStrain() {
		return this.strain;
	}

	@Override
	public String getMaterial() {
		return this.material;
	}

	@Override
	public String toString() {
		return "DeskTopImpl [area=" + area + ", thickness=" + thickness + ", diagonalLineLen=" + diagonalLineLen
				+ ", strain=" + strain + ", material=" + material + "]";
	}

}
