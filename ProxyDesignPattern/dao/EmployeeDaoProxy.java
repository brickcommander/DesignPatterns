package ProxyDesignPattern.dao;

import ProxyDesignPattern.Employee;

public class EmployeeDaoProxy implements EmployeeDao {
    EmployeeDao employeeDaoImpl = new EmployeeDaoImpl();

    @Override
    public void create(String user, Employee employee) {
        if (user.equals("ADMIN")) {
            employeeDaoImpl.create(user, employee);
        }
    }

    @Override
    public void delete(String user, Employee employee) {
        if (user.equals("ADMIN")) {
            employeeDaoImpl.delete(user, employee);
        }
    }

    @Override
    public Employee get(String user, int employeeId) {
        return employeeDaoImpl.get(user, employeeId);
    }
}
