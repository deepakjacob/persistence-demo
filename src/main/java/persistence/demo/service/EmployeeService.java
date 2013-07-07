package persistence.demo.service;

import persistence.demo.entity.Employee;
import persistence.demo.entity.Name;

import java.util.List;

/**
 * Service class for managing employees
 *
 */
public interface EmployeeService {

    /**
     * Return the employee matching the provided id;
     *
     * @param id - used as the search key.
     * @return the employee matching the search key, if no employee is found
     *         with the matching key, then return null
     */
    public Employee getEmployee(Long id);


    /**
     * Get all employees matching the supplied <code>Name</code> criteria. Note
     * that if attributes of the Name contain patterns then a substring matching
     * should be done.
     *
     * @param name the pattern to be searched for.
     * @return the list of employees having matching names.
     */
    public List<Employee> getEmployeesByName(Name name);

    /**
     * Persist the employee and return the id.
     *
     * @return the employee instance that just got persisted.
     */
    public Employee save(Employee employee);

    /**
     * Removes the employee from the team
     *
     */
    public Employee remove(Employee employee);
}