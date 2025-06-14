package ProxyDesignPattern;

import ProxyDesignPattern.dao.EmployeeDao;
import ProxyDesignPattern.dao.EmployeeDaoProxy;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDaoProxy = new EmployeeDaoProxy();
        Employee e1 = new Employee(1, "Pawan");
        Employee e2 = new Employee(2, "Satyam");
        Employee e3 = new Employee(3, "Yash");

        employeeDaoProxy.create("ADMIN", e1);
        employeeDaoProxy.create("USER", e2);
        employeeDaoProxy.get("USER", e1.getEmployeeId());
        employeeDaoProxy.delete("ADMIN", e1);
    }
}
