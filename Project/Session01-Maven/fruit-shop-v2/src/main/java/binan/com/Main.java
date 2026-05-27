package binan.com;

import binan.com.entity.Fruit;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws JsonProcessingException {
        //new 2 trái cây theo 2 style: truyền thống và Builder
        Fruit cau = new Fruit();
        Fruit sung = new Fruit("SU", "Trái sung", "Trái sung là quả...", 5.0);

        //style Builder
        Fruit dua = Fruit.builder()
                .id("DU")
                .name("Trái Dừa")
                .price(9.0)
                .build(); //new
        System.out.println("Sung: " + sung);
        System.out.println("Dua: " + dua);

        ObjectMapper mapper = new ObjectMapper();
        String duaJSON = mapper.writeValueAsString(dua);
        System.out.println("Dừa JSON: " + duaJSON);
    }

}
