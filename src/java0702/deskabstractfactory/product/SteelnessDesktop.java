package java0702.deskabstractfactory.product;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;

public class SteelnessDesktop implements AbstractDesktop{

	@Override
	public String getDesktopInfo() {
		return "���������";
	}
	
	public String toString() {
		return getDesktopInfo();
	}
}
