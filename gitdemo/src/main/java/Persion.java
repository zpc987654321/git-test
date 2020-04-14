import lombok.Data;

@Data
public class Persion {
    private Integer age;
    private String name;

    public void drink(){
        System.out.println("fei zai kuai le shui");

    }
    public void test(){
        System.out.println("========");
    }

    public void eat(){
        System.out.println("喜欢吃肉");
    }

    public void dosomething(){
        System.out.println("play with beautiful girl");
    }
}
