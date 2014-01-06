package org.usaid.era.controllers;

import org.usaid.era.models.Employee;
import org.usaid.era.ejb.EmployeeFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "employeeController")
@SessionScoped
public class EmployeeController extends AbstractController<Employee> implements Serializable {

    @Inject
    private EmployeeFacade ejbFacade;

    public EmployeeController() {
        super(Employee.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
