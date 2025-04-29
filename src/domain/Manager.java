package domain;

/**
 * Клас менеджера, наслідує {@link Employee}.
 *
 * @author Oleksandr
 */
public class Manager extends Employee {

    /**
     * Конструктор з повним набором параметрів.
     *
     * @param employees підлеглі
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень доступу
     * @param dept департамент
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Рядкове представлення менеджера з параметрами з класу {@link Employee},
     * та списком підлеглих.
     *
     * @return рядок з даними менеджера
     */
    @Override
    public String toString() {
        return super.toString() + "\nEmployees: " + getEmployees();
    }

    /**
     * Масив підлеглих менеджера.
     *
     * @param employees масив підлеглих
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Коснтруктор за замовчуванням з порожнім масивом підлеглих.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Рядок з іменами підлеглих.
     *
     * @return рядок з підлеглими менеджера
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлення нового масиву підлеглих.
     *
     * @param employees масив підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * Повертання масиву підлеглих менеджера.
     *
     * @return масив підлеглих
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

}
