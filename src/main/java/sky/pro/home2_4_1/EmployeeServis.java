package sky.pro.home2_4_1;

public interface EmployeeServis {

    public Employee addEmployee(String firstName, String lastName);

    public Employee deleteEmployee(String firstName, String lastName);

    public Employee findEmployee(String firstName, String lastName);

}
