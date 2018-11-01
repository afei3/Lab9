/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/9/">Lab 9 Description</a>
 */
public class Employee {

    /**
     * Name.
     */
    private String name;
    /**
     * Manager.
     */
    private String manager;

    /**
     * Constructor for initialization.
     * @param name of employee
     * @param manager of manager
     */
    public Employee(final String name, final String manager) {
        this.name = name;
        this.manager = manager;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param name sets name
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param manager sets manager
     */
    public void setManager(final String manager) {
        this.manager = manager;
    }
}
