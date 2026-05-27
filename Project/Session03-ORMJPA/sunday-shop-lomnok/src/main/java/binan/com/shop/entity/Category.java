package binan.com.shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Category {
    @Id
    //MAWCJ ĐỊNH sTRING SẼ LÀ VARCHAR, THẾ LÀM SAO CHUYÊ THÀNH NVARCHAR
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "nvarchar(40)")
    private String name;
    @Column(name = "description", columnDefinition = "nvarchar(100)")
    private String desc;

}
