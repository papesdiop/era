package org.usaid.era.controllers;

import org.usaid.era.models.Operation;
import org.usaid.era.ejb.OperationFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "operationController")
@SessionScoped
public class OperationController extends AbstractController<Operation> implements Serializable {

    @Inject
    private OperationFacade ejbFacade;

    public OperationController() {
        super(Operation.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
