package java0702.deskabstractfactory.factory;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;
import java0702.deskabstractfactory.abstractproduct.AbstractFactory;
import java0702.deskabstractfactory.abstractproduct.AbstractLeg;
import java0702.deskabstractfactory.product.SteelnessDesktop;
import java0702.deskabstractfactory.product.SteelnessLeg;

/**
 * "不锈钢"简单工厂
 * @author Administrator
 *
 */
public class SteelnessFactory extends AbstractFactory {
//	private AbstractLeg leg = new SteelnessLeg();
//	private AbstractDesktop desktop = new SteelnessDesktop();
	private SteelnessLeg leg = new SteelnessLeg();
	private SteelnessDesktop desktop = new SteelnessDesktop();
	
	public AbstractDesktop getDesktop() {
		return desktop;
	}
	
	public AbstractLeg getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return "SteelnessFactory [steelnessLeg=" + leg + ", SteelnessDesktop=" + desktop + "]";
	}
	
}
