package java0702.deskabstractfactory.product;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;

public class WoodDesktop implements AbstractDesktop {

	@Override
	public String getDesktopInfo() {
		return "Ä¾Í·×ÀÃæ";
	}
	
	public String toString() {
		return getDesktopInfo();
	}
}
