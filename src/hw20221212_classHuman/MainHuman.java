package hw20221212_classHuman;
import java.util.*;
import java.util.Arrays;

public class MainHuman {
    public static void main(String[] args) {

        Human human1 = new Human("Минск", "Максим", 1988, "бренд-менеджер");
        Human human2 = new Human("Москва", "Аня", 1993, "методист образовательных программ");
        Human human3 = new Human("Калининград", "Катя", 1992, "продакт-менеджер");
        Human human4 = new Human("Москва", "Артем", 1995, "директор по развитию бизнеса");
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
    }

}
