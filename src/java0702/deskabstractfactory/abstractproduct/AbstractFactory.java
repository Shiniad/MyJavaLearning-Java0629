package java0702.deskabstractfactory.abstractproduct;

import java0702.deskabstractfactory.factory.SteelnessFactory;
import java0702.deskabstractfactory.factory.WoodFactory;

public abstract class AbstractFactory {
	/**
	 * @return ��������
	 */
	public abstract AbstractDesktop getDesktop();
	
	/**
	 * @return ��������
	 */
	public abstract AbstractLeg getLeg();
	
	public static AbstractFactory creatFactory(String type) {
		if(type!=null) {
			switch (type) {
			case "steelness":
				return new SteelnessFactory();
			case "wood":
				return new WoodFactory();
			default:
			}
		}
		return null;
	}
}
