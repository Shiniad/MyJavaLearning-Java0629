package java0629.simplefactory;
/**
 * 简单工厂
 * 必须有继承关系
 * @author Administrator
 *
 */
public class SimpleFactory {
	public static Animal creatAnimal(String type) {
		switch (type) {
		case "dog":
			return new Dog();
		case "fish":
			return new Fish();
		default:
			return null;
		}
	}
	public static void main(String[] args) {
		Animal dog = SimpleFactory.creatAnimal("dog");
		dog.showInfo();
		Animal fish = SimpleFactory.creatAnimal("fish");
		fish.showInfo();
	}
}
