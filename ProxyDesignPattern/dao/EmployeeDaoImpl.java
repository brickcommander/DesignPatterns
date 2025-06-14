package ProxyDesignPattern.dao;

import ProxyDesignPattern.Employee;

import java.util.ArrayList;
import java.util.List;

class EmployeeDaoImpl implements EmployeeDao {
    List<Employee> employeeList = new ArrayList<>();

    @Override
    public void create(String user, Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public void delete(String user, Employee employee) {
        employeeList.remove(employee);
    }

    @Override
    public Employee get(String user, int employeeId) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }
}
