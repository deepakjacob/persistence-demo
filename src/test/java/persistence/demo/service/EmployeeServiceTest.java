package persistence.demo.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import persistence.demo.entity.Band;
import persistence.demo.entity.Employee;
import persistence.demo.entity.Name;
import persistence.demo.entity.Phone;

import java.util.Date;

/**
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jpa-config.xml", "classpath:eclipselink-config.xml", "classpath:tx-config.xml",
        "classpath:dao-config.xml", "classpath:service-config.xml"})
public class EmployeeServiceTest {


    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSaveEmployee() {
        Employee emp = createEmployee();
        employeeService.save(emp);

    }

    @Test
    public void testGetEmployee(){
        Employee employee = employeeService.getEmployee(new Long(1));
        System.out.println("======================> " + employee);
    }

    private Employee createEmployee() {
        Employee employee = new Employee();
        Name name = new Name();
        name.setFirstName("Deepak");
        name.setLastName("Jacob");
        employee.setName(name);
        employee.setBand(Band.A);
        employee.setBloodGroup("A+");
        employee.setDoj(new Date());
        employee.setDol(new Date());
        Phone landPhone = new Phone();
        landPhone.setCountryCode(91);
        landPhone.setStdCode(1234);
        landPhone.setNumber(12121212);
        employee.setLandPhone(landPhone);
        return employee;
    }
}
