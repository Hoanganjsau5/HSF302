package binan.com.shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
//@Table(name = "TRAI_CAY")
public class Fruit {
    @Id
    //MAWCJ ĐỊNH sTRING SẼ LÀ VARCHAR, THẾ LÀM SAO CHUYÊ THÀNH NVARCHAR
    @Column(length = 5)
    private String id;
    @Column(columnDefinition = "nvarchar(40)", nullable = false, unique = true)
    private String name;
    @Column(name = "description", columnDefinition = "nvarchar(100)")
    private String desc;
    @Column(nullable = false)
    private double price;

    //Mối quan hệ Many To One
    //Nhiều Fruit cùng thuô v 1 Cate x nào đó
    @ManyToOne
    @JoinColumn(name = "cate_id") //Tên cột FK ở bên Cate
    private Category cate;


}
