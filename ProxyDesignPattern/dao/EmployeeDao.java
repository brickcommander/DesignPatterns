package ProxyDesignPattern.dao;

import ProxyDesignPattern.Employee;

public interface EmployeeDao {
    void create(String user, Employee employee);

    void delete(String user, Employee employee);

    Employee get(String user, int employeeId);
}
