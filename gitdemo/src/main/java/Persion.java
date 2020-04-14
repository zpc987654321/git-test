import lombok.Data;

@Data
public class Persion {
    private Integer age;
    private String name;

    public void eat(){
        System.out.println("喜欢吃肉");
    }

    public void dosomething(){
        System.out.println("play with beautiful girl");
    }
}
