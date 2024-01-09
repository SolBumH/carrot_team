import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Intro.intro();
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
	  System.out.println("당근쿤에게 이름을 지어주었습니다.\n이름 : " + name );
	  CarrotStatus carrot = new CarrotStatus(name);
	  
	  System.out.println(name + "의 상태");
	  System.out.println("HP : " + carrot.HP);
	  System.out.println("IQ : " + carrot.IQ);
	  System.out.println("성장력 : " + carrot.Growth);
	  System.out.println("퀴즈 풀기");
	  
	  if (1 == Quiz.quiz()) {
	    carrot.IQ += 3;
	    System.out.println("정답입니다. IQ가 3 올라갑니다.");
	  } else {
	    carrot.IQ -= 3;
	    System.out.println("오답입니다. IQ가 3 하락합니다.");
	  }
	  Hp.playCarrotGame();
	}
}
