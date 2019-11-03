package java0702.factory;

import java0702.abstractproduct.AbstractFactory;
import java0702.abstractproduct.Boss;
import java0702.abstractproduct.Enemy;
import java0702.product.Level2Boss;
import java0702.product.Level2Enemy;

public class Level2Factory implements AbstractFactory {

	@Override
	public Enemy getEnemy() {
		return new Level2Enemy();
	}

	@Override
	public Boss getBoss() {
		return new Level2Boss();
	}

}
