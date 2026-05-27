package binan.com.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//DB - ORM
@Entity   //bắt buộc phải có để ánh xạ giữa class trong OOP World và Table trong DB World

@Table(name = "NgocTrinh") //tên table muốn tạo trong SQL Server
//nếu bỏ dòng @Table thì tên table mặc định là tên class tức là trong SQL Server sẽ có 1 table tên là Fruit luôn!!!
public class Fruit {

    @Id
    private String id;  //key tự tăng học sau
    private String name;
    private String color;
    private double price;
}
