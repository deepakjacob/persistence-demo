package persistence.demo.service.impl;

import persistence.demo.dao.EmployeeDao;
import persistence.demo.entity.Employee;
import persistence.demo.entity.Name;
import persistence.demo.service.EmployeeService;

import java.util.List;

/**
 * Transactions will be applied on this object
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public Employee getEmployee(Long id) {
        return getEmployeeDao().findById(id);
    }


    @Override
    public List<Employee> getEmployeesByName(Name name) {
        return getEmployeeDao().getEmployeesByName(name);
    }

    @Override
    public Employee save(Employee employee) {
        return getEmployeeDao().save(employee);
    }

    @Override
    public Employee remove(Employee employee) {
        return null;
    }
}