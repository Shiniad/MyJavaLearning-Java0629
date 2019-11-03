package java0627.desk;

public class LegImpl implements Legs {
	private double len;
	
	private double diagonalLineLen;
	
	private String material;

	public LegImpl() {
		super();
	}

	public LegImpl(double len, double diagonalLineLen, String strain) {
		super();
		this.len = len;
		this.diagonalLineLen = diagonalLineLen;
		this.material = strain;
	}

	@Override
	public String getMaterial() {
		return this.material;
	}

	@Override
	public double getLenSize() {
		return this.len;
	}

	@Override
	public double getDiagonalLineLen() {
		return this.diagonalLineLen;
	}

	@Override
	public String toString() {
		return "LegImpl [len=" + len + ", diagonalLineLen=" + diagonalLineLen + ", material=" + material + "]";
	}
	
}
