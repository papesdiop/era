package org.usaid.era.controllers;

import org.usaid.era.models.Department;
import org.usaid.era.ejb.DepartmentFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "departmentController")
@SessionScoped
public class DepartmentController extends AbstractController<Department> implements Serializable {

    @Inject
    private DepartmentFacade ejbFacade;

    public DepartmentController() {
        super(Department.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
