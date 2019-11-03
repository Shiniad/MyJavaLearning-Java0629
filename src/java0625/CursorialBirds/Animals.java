package java0625.CursorialBirds;

public class Animals {
	private String name;
	private String strain;
	private String food;
	private String action;

	public Animals() {
		super();
	}

	public Animals(String name, String strain, String food, String action) {
		super();
		this.name = name;
		this.strain = strain;
		this.food = food;
		this.action = action;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void show() {
		System.out.println("我叫" + this.name + ",我是一只" + this.strain);
	};

	public void eat() {
		System.out.println("我喜欢吃" + this.food);
	};

	public void exercise() {
		System.out.println("我会" + this.action);
	};

	public void run() {
		show();
		eat();
		exercise();
	}
}
