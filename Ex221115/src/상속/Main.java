package 상속;

import java.awt.event.MouseWheelEvent;

public class Main {

	public static void main(String[] args) {
		
		마우스 ms = new 마우스();
		휠마우스 wheel = new 휠마우스();
		인체공학마우스 egm = new 인체공학마우스();
		
		ms.drag();
		ms.leftclick();
		ms.rightclick();
		
		wheel.scroll();
		wheel.drag();
		wheel.rightclick();
		wheel.leftclick();
		
		egm.drag();
		egm.leftclick();
		egm.rightclick();
		egm.ergonomics();
		

	}

}
