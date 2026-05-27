package binan.com.shop;

import binan.com.shop.entity.Category;
import binan.com.shop.entity.Fruit;
import jakarta.persistence.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory
            ("binan.com.shop.superapp-PU");// thăngquanrnr lí kết nối cơ sở dữ liệu, là object móc với sql server, chơi với sserver
    //object quản lí ca table(entity)
    private static EntityManager em = emf.createEntityManager();
    public static void create(){
        EntityTransaction tx = em.getTransaction();//đám bảo dữ liệu được nhất quá, tại sao lại cần nhất quán ộ nó có gì không nhất quán à

    }
    static void main() {
        createFruits();
//        getFruits();
//        getFruitById();
//        updateFruitById();
//        deleteFruitById();
        createCategory();
    }

    public static void createCategory(){
        //tạo object new Fruit(..)
        //nhớ đến em - entitymanager có ẵn 1 loạt hanfm CRUD table Fruit luôn

        Category c1 = Category.builder().name("Trai cay nhap khau")
                                        .desc("Trai cay nhap khau theo mua")
                                        .build();
        Category c2 = Category.builder().name("Trai cay trong nuoc")
                                        .desc("Trai cay den tu nha vuon")
                                        .build();
        Category c3 = Category.builder().name("Trai cay say kho")
                                        .desc("Trai cay say kho det")
                                        .build();


        em.getTransaction().begin();
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.getTransaction().commit();
    }
    public static void updateFruitById(){
        Fruit fruit = em.find(Fruit.class, "d");
        if(fruit == null){
            System.out.println("not found");
        }
        fruit.setName("Zdua Zdua");
        em.getTransaction().begin();
        em.merge(fruit);
        em.getTransaction().commit();

        getFruits();
    }

    public static void deleteFruitById(){
        Fruit fruit = em.find(Fruit.class, "d");
        if(fruit == null){
            System.out.println("not found");
        }
//        fruit.setName("Zdua Zdua");
        em.getTransaction().begin();
        em.remove(fruit);
        em.getTransaction().commit();

        getFruits();
    }

    public static void getFruitById(){
        Fruit fruit = em.find(Fruit.class, "abd");
        if(fruit == null){
            System.out.println("not found");
        }
        fruit = em.find(Fruit.class, "mc");
        System.out.println("FOUND: " +fruit.toString());
    }

    public static void getFruits(){
        //câu Sql style object: JPQL
        Query query = em.createQuery("select f from Fruit f");
        List<Fruit> fruits = query.getResultList();
        System.out.println("Total Fruit: " +fruits.size());
        for(Fruit a: fruits){
            System.out.println(a.toString());
        }
    }

    public static void createFruits(){
        //tạo object new Fruit(..)
        //nhớ đến em - entitymanager có ẵn 1 loạt hanfm CRUD table Fruit luôn

        Fruit cau = Fruit.builder()
                .id("MC")
                .name("Mãng cầu")
                .desc("cầu là trái đầu tiên")
                .price(5.0)
                .build();
        Fruit sung = Fruit.builder()
                .id("S")
                .name("Sung")
                .desc("Sung là trái 2")
                .price(9.0)
                .build();
        Fruit dua = Fruit.builder()
                .id("D")
                .name("Dua")
                .desc("Sung là trái 3")
                .price(4.0)
                .build();

        em.getTransaction().begin();
        em.persist(cau);
        em.persist(sung);
        em.persist(dua);
        em.getTransaction().commit();

    }

}
