package domain;

/**
 * Клас представлення художника компанії з певними уміннями. Наслідує клаc
 * {@link Employee}.
 *
 * @author Oleksandr
 */
public class Artist extends Employee {

    /**
     * Конструктор класу художника, ініціалізує об'єкт з параметрами.
     *
     * @param skiils масив умінь
     * @param name ім'я художника
     * @param jobTitle посада
     * @param level рівень доступу
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створення художника з масивом умінь.
     *
     * @param skiils масив умінь
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створення художника з пустим масивом умінь.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Строкове представлення художника, інформацію з {@link Employee} та його
     * умінь.
     *
     * @return рядок з художником та його даними
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }
    /**
     * Масив умінь художника.
     */
    private String[] skiils;

    /**
     * Метод повертає уміння художника через кому.
     *
     * @return рядок умінь художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s = s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлення нового масиву з уміннями художника.
     *
     * @param skills масив умінь
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертання масиву з уміннями художника.
     *
     * @return масив умінь
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
