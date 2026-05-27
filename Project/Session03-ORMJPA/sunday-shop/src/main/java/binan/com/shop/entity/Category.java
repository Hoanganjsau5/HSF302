package binan.com.shop.entity;

import jakarta.persistence.*;

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

    public Category(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
