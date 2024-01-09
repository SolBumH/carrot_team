import java.util.List;
import java.util.Scanner;

import com.carrot.dao.Carrot_DAO;
import com.carrot.dto.Carrot_DTO;

public class Quiz {
  public static int quiz() {
    int result = 0;
    Carrot_DAO dao = new Carrot_DAO();
    Scanner sc = new Scanner(System.in);
    
    List<Carrot_DTO> list = dao.doTest_one();
    System.out.println(list.get(0).getTest_content());
   
    System.out.print("정답 : ");
    
    int answer = sc.nextInt();
    
    if (answer == list.get(0).getTest_answer()) {
      result = 1;
    }
    
    return result;
  }
}
