import java.util.Scanner;

public class homeWork1{
    public static void main(String[] args) {
        System.out.println("Hello_World");
        System.out.println("Nurbek");
        String userFullName = "sensei_aleksey";
        String world = "hi";
        final int NUM = 4;
        userFullName = world + NUM;
        System.out.println(userFullName);
        System.out.println("world = " + world);
        System.out.println("NUM = " + NUM);
        System.out.println("userFullName = " + userFullName);

        if (NUM < 0 ) {
            System.out.println("Вы сохрвнили отрецательное число");
        }else if (NUM > 0 ){
            System.out.println("Вы сохранили положытельное число");
        }else {
            System.out.println("Вы сохранили ноль");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Видите ваше имя:");
        String userName = scanner.nextLine();
        System.out.println("hello " + userName + "!");

        scanner.close();
    }
}