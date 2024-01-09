import java.util.Scanner;

public class Hp {

  public static void main(String[] args) {
    // playCarrotGame();
  }

  public static void playCarrotGame() {
    int carrotHp = 10;
    int maxTurns = 30;
    int currentTurn = 0;

    System.out.println("당근쿠니의 체력은 " + carrotHp);
    Scanner sc = new Scanner(System.in);
    while (currentTurn < maxTurns) {
      printMenu();
      System.out.println("턴 : " + (currentTurn + 1) + ", 남은 턴 : " + (maxTurns - currentTurn));
      System.out.println("당근쿠니의 체력을 높여보자 :");
      int num = sc.nextInt();

      if (num == 5) {
        handleGameEnd();
        break;
      } else if (num < 1 || num > 4) {
        handleInvalidInput();
        continue;
      }

      handleUserChoice(num, carrotHp, currentTurn);
      carrotHp += 10; // Increase carrotHp by 10
      System.out.println("당근쿠니의 체력은 " + carrotHp);
      currentTurn++;

      if (currentTurn < maxTurns) {
        handleNextTurn();
      }
    }

    if (currentTurn < maxTurns) {
      handleNextTurn();
    }
  }

  private static void printMenu() {
    System.out.println("┌──────────────────────────────────────────────────────────┐");
    System.out.println("│1. 물주기\t2. 운동시키기\t3. 영양제 먹기\t4.  종료   │");
    System.out.println("└──────────────────────────────────────────────────────────┘");
  }

  private static void handleInvalidInput() {
    System.out.println("아니야!!! 1부터 4까지 숫자 중 하나만 선택해죠!!!!");
  }

  private static void handleUserChoice(int num, int carrotHp, int count) {
    switch (num) {
    case 1:
      rockPaperScissorsGameString();
      increaseCarrotHp(carrotHp, 10, "물 주기");
      System.out.println();
      System.out.println("물을 먹었더니 싱싱해졌엉 곰마워");
      System.out.println();
      break;
    case 2:
      rockPaperScissorsGameString();
      increaseCarrotHp(carrotHp, 10, "운동 시키기");
      System.out.println();
      System.out.println("근육빵빵이가 된거같아 곰마워");
      System.out.println();
      break;
    case 3:
      rockPaperScissorsGameString();
      increaseCarrotHp(carrotHp, 30, "영양제 먹기");
      System.out.println();
      System.out.println("영양제까지 챙겨주다니~ 넘모 천사인걸 곰마워");
      System.out.println();
      break;
    default:
      System.out.println();
      handleInvalidInput();
      System.out.println();
      break;
    }
  }

  private static void rockPaperScissorsGameString() {
    Scanner sc = new Scanner(System.in);
    System.out.println("가위 바위 보를 고르세요. (1.가위, 2.바위, 3. 보)");

    int user = sc.nextInt();
    int com = (int) (Math.random() * 3) + 1;

    System.out.println("컴퓨터는" + com);

    if (com == 1 && user == 3 || com == 2 && user == 1 || com == 3 && user == 2) {
      System.out.println("졌습니다");
    } else if (com == 1 && user == 2 || com == 2 && user == 3 || com == 3 && user == 1) {
      System.out.println("이겼습니다");
    } else if (com == user) {
      System.out.println("비겼습니다");

    }

  }

  private static void increaseCarrotHp(int carrotHp, int increaseAmount, String action) {
    carrotHp += increaseAmount;
    System.out.println(action + "! 당근쿠니의 체력이 " + increaseAmount + " 증가했습니다.");
  }

  private static void handleNextTurn() {
    System.out.println("체력을 더 높여볼까??");
  }

  private static void handleGameEnd() {
    System.err.println("자 이제는 쉬고시펑 :)");
  }
}
