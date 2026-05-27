package binan.com.shop.repository;

import binan.com.shop.entity.Category;
import binan.com.shop.entity.Fruit;
import jakarta.persistence.*;

import java.util.List;

public class CategoryRepository {
    //chứa các hàm CRUD trwjc tieeps table category
    //hàm chuẩn nói chung: nhận vào và trả ra
    //MantraL User  --- Controller  --- Service --- Repo --- JPA/Hibernate --- JDBC --- Table
    //                  layer 1          layer 2    layer 3
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory
            ("binan.com.shop.superapp-PU");// thăngquanrnr lí kết nối cơ sở dữ liệu, là object móc với sql server, chơi với sserver
    //object quản lí ca table(entity)
    private final EntityManager em = emf.createEntityManager();
    public final void create(){
        EntityTransaction tx = em.getTransaction();//đám bảo dữ liệu được nhất quá, tại sao lại cần nhất quán ộ nó có gì không nhất quán à
    }

    public List<Category> findAll(){
        Query query = em.createQuery("select c from Category c");
        List<Category> categories = query.getResultList();
        System.out.println("Total Category: " +categories.size());
        return categories;
    }


}
