package java0702.deskabstractfactory;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;
import java0702.deskabstractfactory.abstractproduct.AbstractFactory;
import java0702.deskabstractfactory.abstractproduct.AbstractLeg;

public class FactoryUser {
	private AbstractFactory factory;
	private AbstractDesktop desktop;
	private AbstractLeg leg;
	
	public FactoryUser() {
	}

	public FactoryUser(AbstractFactory factory, AbstractDesktop desktop, AbstractLeg leg) {
		this.factory = factory;
		this.desktop = desktop;
		this.leg = leg;
	}


	public AbstractFactory getFactory() {
		return factory;
	}


	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
	}


	public AbstractDesktop getDesktop() {
		return desktop;
	}


	public void setDesktop(AbstractDesktop desktop) {
		this.desktop = desktop;
	}


	public AbstractLeg getLeg() {
		return leg;
	}


	public void setLeg(AbstractLeg leg) {
		this.leg = leg;
	}


	public static void main(String[] args) {
		FactoryUser fc = new FactoryUser();
		fc.setFactory(AbstractFactory.creatFactory("steelness"));
		System.out.println("不锈钢桌子的生产：" + fc.getFactory());
		
		fc.setFactory(AbstractFactory.creatFactory("wood"));
		System.out.println("木头桌子的生产：" + fc.getFactory());
		
		fc.setFactory(AbstractFactory.creatFactory(""));
		System.out.println("空桌子的生产：" + fc.getFactory());
		
		fc.setFactory(AbstractFactory.creatFactory(null));
		System.out.println("null桌子的生产：" + fc.getFactory());
		
		
	}
}
