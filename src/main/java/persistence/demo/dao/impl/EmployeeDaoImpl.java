package persistence.demo.dao.impl;

import persistence.demo.dao.EmployeeDao;
import persistence.demo.entity.Employee;
import persistence.demo.entity.Name;

import javax.persistence.Query;
import java.util.List;

/**
 *
 */
public class EmployeeDaoImpl extends AbstractJpaDaoImpl<Long, Employee> implements EmployeeDao {
    @Override
    public List<Employee> getEmployeesByName(Name name) {
        Query namedQuery = getEntityManager().createNamedQuery("getEmployeeByName");
        List<Employee> empList = namedQuery.getResultList();
        return empList;
    }


}
