import java.util.Random;

/**
 * @author: fanfan187
 */
public class programmersDay {
    public static void main(String[] args) {
        String[] wishes = {
                "嘿，程序员们！愿你们的代码向Java的面向对象一样清晰，生活像Spring Boot一样高效！",
                "在1024程序员节，愿你们的代码没有bug，就像Java的垃圾回收器一样靠谱！",
                "1024,祝程序员们的逻辑如Java的多线程一样强大，创意如java8的新特性一样酷炫！",
        };
        Random random = new Random();
        int index = random.nextInt(wishes.length);
        System.out.println(wishes[index]);
    }
}
