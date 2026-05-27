package binan.com;

import binan.com.entity.Fruit;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws JsonProcessingException {
    //TẠO MỚI TRÁI CÂY
        Fruit xoai = new Fruit("X01", "Xoài",
                                "làm sinh tố thì ngon", 1.99);
        System.out.println(xoai.toString());

        //xoai la object của trái mãng cầu trong RAM
        //ta biến hình nó thành JSON và nguowjc lại
        //ta nhờ thư viện Jackson, class trong thư viện này giúp
        ObjectMapper mapper = new ObjectMapper();
        String xoaiJson = mapper.writeValueAsString(xoai);// hãy biến đổi chuô thành json
        System.out.println("Xoài as a JSONL: " + xoaiJson);

        //ngược lại, có JSON thì ra object
        String sungJson = """
                {"id":"SS","name":"SUNG SƯỚNG","desc":"Sung là trái thứ 2 trong mâm ngũ quả","price":3.33}
                """;
        Fruit sung = mapper.readValue(sungJson, Fruit.class);
        System.out.println(sung.toString());
    }
}
