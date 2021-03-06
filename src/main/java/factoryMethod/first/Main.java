package factoryMethod.first;

import factoryMethod.first.factory.MSIFactory;
import factoryMethod.first.factory.MacFactory;
import factoryMethod.first.factory.NotebookFactory;
import factoryMethod.first.product.Notebook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/***
 * Имя: Фабричный метод
 *
 * Группа: порождающий
 *
 * Назначение: Определяет общий интерфейс для создания объектов в суперклассе,
 * позволяя подклассам изменять тип создаваемых объектов.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/factory-method
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/factory-method/java/example
 */

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        NotebookFactory usersNotebook;

        while (true) {
            System.out.println("Please choose what your want 'Mac' or 'MSI'?");
            String userChoose = reader.readLine();
            if (userChoose.equalsIgnoreCase("mac")) {
                usersNotebook = new MacFactory();
                break;
            }
            if (userChoose.equalsIgnoreCase("msi")) {
                usersNotebook = new MSIFactory();
                break;
            }
            System.out.println("You write wrong name...");
        }

        Notebook notebook = usersNotebook.creator();
        System.out.println("Your notebook:\n" + notebook.toString());
    }
}
