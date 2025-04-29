package domain;

/**
 * Клас редактора, наслідує {@link Artist}
 *
 * @author Oleksandr
 */
public class Editor extends Artist {

    /**
     * Конструктор класу редактора, ініціалізує об'єкт з параметрами.
     *
     * @param electronicEditing вид редагування
     * @param skiils уміння
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень доступу
     * @param dept департамент
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор створення редактора з видом редагування та уміннями.
     *
     * @param electronicEditing вид редагування
     * @param skiils уміння
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створення редактора тільки з видом редагування.
     *
     * @param electronicEditing вид редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створення редактора за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Рядкове представлення редактора з інформацією з класу {@link Artist} та
     * видом редагування.
     *
     * @return рядок з інформацією
     */
    @Override
    public String toString() {
        String s = super.toString() + "\nEditing preferences= ";
        if (electronicEditing) {
            s = s + "electronic";
        } else {
            s = s + "paper";
        }
        return s;

    }

    private boolean electronicEditing;

    /**
     * Повертає вид редагування
     *
     * @return вид редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлення виду редагування
     *
     * @param electronic 
     * (@code true) електронне редагування 
     * (@code false)не електронне редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
