package binan.com.entity;

public class Fruit {
    private String id;
    private String name;
    private String desc;
    private double price;

    public Fruit() {
    }

    public Fruit(String id, String name, String desc, double price) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + desc + " | " + price;
    }
}
//ĐOẠN CODE NHÀM CHÁN NHƯNG BẮT BUỘC PHẢI VIẾT RA, ĐỂ ĐẢM BẢO ĐÚNG NGỮ NGHĨA, VIỆC XỬ LÍ CỦA
//1 CLASS, CLASS BẮT BUỘC PHẢI CÓ FULL CONSTRUCTOR RỖNG, FULL, GET, SET ĐỂ ĐẢM BẢO ĐÚNG
//NGỮ NGHIÃ
