import java.util.Scanner;
import ru.netology.service.CustomService1;

public class CustomService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Здравствуйте " + name + "!");

        System.out.print("Введите стоимость товара (в руб.): ");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        int weight = scanner.nextInt();

        scanner.nextLine();

        CustomService1.calculateTotal(weight, price);

        System.out.println("Общая сумма пошлины: " + CustomService1.calculateTotal(weight, price) + " руб.\n");

        scanner.close();
    }
}