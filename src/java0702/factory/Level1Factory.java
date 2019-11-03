package java0702.factory;

import java0702.abstractproduct.AbstractFactory;
import java0702.abstractproduct.Boss;
import java0702.abstractproduct.Enemy;
import java0702.product.Level1Boss;
import java0702.product.Level1Enemy;

public class Level1Factory implements AbstractFactory {
//	private Enemy e = new Level1Enemy();
//	private Boss b = new Level1Boss();

	@Override
	public Enemy getEnemy() {
		Enemy e = new Level1Enemy();
		return e;
	}

	@Override
	public Boss getBoss() {
		Boss b = new Level1Boss();
		return b;
	}

}
