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
public class Category {
    @Id
    //MAWCJ ĐỊNH sTRING SẼ LÀ VARCHAR, THẾ LÀM SAO CHUYÊ THÀNH NVARCHAR
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "nvarchar(40)")
    private String name;
    @Column(name = "description", columnDefinition = "nvarchar(100)")
    private String desc;

    //thiết lập quan he - relationship 1 N one to many
    //1 category bất kỳ có nhiều Fruit - Nhiều tức là List, Set, Map
    @OneToMany
    @JoinColumn(name = "cate_id")  //cootj nào sẽ dùng làm khóa ngoại
    private List<Fruit> fruits; //OOP, chưa tin DB
}
