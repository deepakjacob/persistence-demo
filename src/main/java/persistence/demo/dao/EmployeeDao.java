package persistence.demo.dao;

import persistence.demo.entity.Employee;
import persistence.demo.entity.Name;

import java.util.List;

public interface EmployeeDao extends Dao<Long, Employee> {

    public List<Employee> getEmployeesByName(Name name);

}