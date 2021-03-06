package org.del.dao;

import org.del.entities.Employee;
import org.del.exceptions.EmployeeNotFoundException;

public interface IEmployeeDao {

    void save(Employee employee);

    Employee update(Employee employee);

    void remove(Employee employee);

    Employee findEmployeeById(int id) throws EmployeeNotFoundException;

    boolean checkCredentials(int id,String password);

}
