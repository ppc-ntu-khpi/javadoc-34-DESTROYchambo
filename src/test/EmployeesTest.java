package test;

import domain.*;

/**
 * Тестовий клас для демонстрації роботи програми, взаємодії класів.
 *
 * @author Oleksandr
 */
public class EmployeesTest {

    /**
     * Головний метод
     *
     * @param args
     */
    public static void main(String args[]) {
        /**
         * Уміння класу {@link Artist} та {@link Editor}.
         */
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        /**
         * Створення редактора.
         */
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        /**
         * Створення звичайного робітника.
         */
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");
        /**
         * Створення художника.
         */
        Artist art = new Artist(skills);
        /**
         * Масив підлеглих робітників менеджера.
         */
        Employee[] people = {ed, em, art};
        /**
         * Створення менеджера.
         */
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        /**
         * Виведення інформації про менеджера.
         */
        System.out.println(man);

    }
}
