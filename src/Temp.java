import java.util.List;

import com.carrot.dao.Carrot_DAO;
import com.carrot.dto.Carrot_DTO;

public class Temp {
  public static void main(String[] args) {
    Carrot_DAO dao = new Carrot_DAO();
    List<Carrot_DTO> list = dao.doTest();
    
    for (Carrot_DTO e : list) {
      System.out.println(e.getTest_content());
      System.out.println();
      System.out.println(e.getTest_answer());
      System.out.println();
    }
  }
}
