package java0702.deskabstractfactory.product;

import java0702.deskabstractfactory.abstractproduct.AbstractLeg;

public class SteelnessLeg implements AbstractLeg{

	@Override
	public String getLegInfo() {
		return "���������";
	}
	
	public String toString() {
		return getLegInfo();
	}
}
