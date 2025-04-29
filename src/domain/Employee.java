package domain;

/**
 * Загальний клас працівника компанії з базовими характеристиками. Батьківський
 * клас для {@link Artist} та {@link Editor}
 *
 * @author Oleksandr
 */
public class Employee {

    /**
     * Рядкове представлення працівника з основими параметрами.
     *
     * @return рядок з даними працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

    /**
     * Конструктор,створення працівника з вказаними параметрами.
     *
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень доступу
     * @param dept департамент
     */
    // private static int employeesCount = 0;
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Генерує ID працівника від 0 до 999.
     */
    public Employee() {
        ID = (int) (Math.random() * 1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлення посади працівника.
     *
     * @param job посаду
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return посада
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return ім'я
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлення рівня доступу працівника.
     *
     * @param level рівень доступу
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівня доступу працівника.
     *
     * @return рівень доступу
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає департамент працівника.
     *
     * @return департамент
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлення департаменту працівника.
     *
     * @param dept департамент
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлення імені працівника з правильним форматом введення.
     *
     * @param name нове ім'я
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
