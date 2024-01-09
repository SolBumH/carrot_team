
public class Intro extends Thread{
  Thread thread = new Thread();
  public static void intro() {
    System.out.println("실험실에서 사람과 당근의 유전자 조합 실험으로 인해 당근쿤이 태어났다");
    try {
      Thread.sleep(1700);
    } catch (InterruptedException e) {
    }
    System.out.println("이 당근쿤은 실험실에서 탈출을 감행하다 강에 빠져 내려가던 중 당신은 당근쿤을 획득하게 되었다.");
    try {
      Thread.sleep(1700);
    } catch (InterruptedException e) {
    }
    System.out.println("당근쿤을 키워 성공적인 개발자로 양육하시오.");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
    }
    System.out.println("당근쿤에게 이름을 지어주세요.");
  }
}
