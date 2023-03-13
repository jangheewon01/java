package 상속4;

public class SnackMain {

	public static void main(String[] args) {
		
		// 썬칩 먹기
	      // 허니버터칩 먹기
	      // 야채타임 먹기
	       SunChip sun = new SunChip();
	      eat(sun);
	      
	      Honey hon = new Honey();
	      eat(hon);
	      
	      YacheTime ya = new YacheTime();
	      eat(ya);
	      
	      SwingChip sw = new SwingChip();
	      eat(sw); // 스윙칩을 먹습니다!

	   }
	   
	   public static void eat(Snack snack) {
	   snack.eat();
	   // 만약 먹는 과자가 야채타임 이라면
	      // 케찹을 찍어 먹고 싶어요!
	   if(snack instanceof YacheTime) {
	      YacheTime ya = (YacheTime) snack;
	      
	      ya.ketchup();
	   }
	      
	}
	
	

}
