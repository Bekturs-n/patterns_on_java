package factoryMethod;

import factoryMethod.shop.factory.MSIFactory;
import factoryMethod.shop.factory.MacFactory;
import factoryMethod.shop.factory.NotebookFactory;
import factoryMethod.shop.product.Notebook;

/***
 * Фабричный метод — это порождающий паттерн проектирования, который определяет
 * общий интерфейс для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
 *
 * Подробнее:
 * https://refactoring.guru/ru/design-patterns/factory-method
 *
 * Java-example:
 * https://refactoring.guru/ru/design-patterns/factory-method/java/example
 */

public class Main {
    public static void main(String[] args) {
        NotebookFactory msiFactory = new MSIFactory();
        NotebookFactory macFactory = new MacFactory();

        Notebook mac = macFactory.creator();
        Notebook msi = msiFactory.creator();

        System.out.println(mac.toString());
        System.out.println(msi.toString());
    }
}
