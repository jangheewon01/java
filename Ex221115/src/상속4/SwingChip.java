package 상속4;

public class SwingChip extends Snack {
	// Snack에서 물려준 eat란 기능을 반드시 !
	
	@Override
	public void eat () {
		System.out.println("스윙칩을 먹습니다");
		
	}
	
	
}
