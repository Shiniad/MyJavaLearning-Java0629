package java0702.deskabstractfactory.factory;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;
import java0702.deskabstractfactory.abstractproduct.AbstractFactory;
import java0702.deskabstractfactory.abstractproduct.AbstractLeg;
import java0702.deskabstractfactory.product.WoodDesktop;
import java0702.deskabstractfactory.product.WoodLeg;

/**
 * "木头"简单工厂
 * @author Administrator
 *
 */
public class WoodFactory extends AbstractFactory {
//	private AbstractDesktop desktop = new WoodDesktop();
//	private AbstractLeg leg = new WoodLeg();
	private WoodDesktop desktop = new WoodDesktop();
	private WoodLeg leg = new WoodLeg();
	
	public AbstractDesktop getDesktop() {
		return desktop;
	}
	
	public AbstractLeg getLeg() {
		return leg;
	}

	@Override
	public String toString() {
		return "WoodFactory [woodDesktop=" + desktop + ", woodLeg=" + leg + "]";
	}
	
}
