package sky.pro.home2_4_1;

import org.springframework.http.server.DelegatingServerHttpResponse;
import org.springframework.stereotype.Service;


import java.util.HashMap;

import java.util.Map;

@Service
public class EmployeeServis {
    private Map<String, Employee> employee = new HashMap<>() {
    };


    public Employee addEmployee(String firstName, String lastName) {
        if (employee.containsKey(conkatinate(firstName, lastName))){
            throw new AlreadyHasException();
        }
        employee.put(conkatinate(firstName, lastName), new Employee(firstName, lastName));
        return employee.get(conkatinate(firstName, lastName));
    }

    public Employee deleteEmployee(String firstName, String lastName) {
        Employee employee1 = new Employee(firstName, lastName);
        if (employee.containsKey(conkatinate(firstName, lastName))) {
            employee.remove(conkatinate(firstName, lastName));
            return employee1;
        }
        throw new NotFoundException();
    }


    public Employee findEmployee(String firstName, String lastName) {
        if (employee.containsKey(conkatinate(firstName, lastName))) {
            return employee.get(conkatinate(firstName, lastName));
        }
        throw new NotFoundException();
    }

    public String listOfEmployee() {
        return employee.toString();
    }

    private String conkatinate(String firstName, String lastName) {
        return firstName + lastName;
    }
}












