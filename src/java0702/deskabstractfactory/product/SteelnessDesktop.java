package java0702.deskabstractfactory.product;

import java0702.deskabstractfactory.abstractproduct.AbstractDesktop;

public class SteelnessDesktop implements AbstractDesktop{

	@Override
	public String getDesktopInfo() {
		return "²»Ðâ¸Ö×ÀÃæ";
	}
	
	public String toString() {
		return getDesktopInfo();
	}
}
