package java0702.deskabstractfactory.product;

import java0702.deskabstractfactory.abstractproduct.AbstractLeg;

public class WoodLeg implements AbstractLeg{

	@Override
	public String getLegInfo() {
		return "ľͷ����";
	}
	
	public String toString() {
		return getLegInfo();
	}
}
