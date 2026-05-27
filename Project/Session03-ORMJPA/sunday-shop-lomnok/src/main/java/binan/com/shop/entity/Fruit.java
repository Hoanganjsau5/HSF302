package binan.com.shop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
