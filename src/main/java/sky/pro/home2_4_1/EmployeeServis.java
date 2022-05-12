package sky.pro.home2_4_1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServis {
    private final List<Employee> employee = new ArrayList<>();


    public Employee addEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        int d = 0;
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i) != null && employee.get(i).equals(employee1)) {
                throw new AlreadyHasException();
            }
        }
        employee.add(new Employee(firstName, lastName));
        return employee1; }
    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i) != null && employee.get(i).equals(employee1)) {
                employee.remove(i);
                return employee1;
            }
        }
        throw new NotFoundException();
    }


    public Employee findEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i) != null && employee.get(i).equals(employee1)) {
                return employee1;
            }
        }
        throw new NotFoundException();
    }
    public String listOfEmployee () {
       return employee.toString();
    }
}












