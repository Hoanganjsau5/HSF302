package binan.com.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder //Builder là một kĩ thuaatj mà nhóm lombok mượn để dùng chứ ko phải do lombox tạo

public class Fruit {
    private String id;
    private String name;
    private  String desc;
    private double price;

    //phải chột, generate, chọn constructor, toString, get/set...

}
