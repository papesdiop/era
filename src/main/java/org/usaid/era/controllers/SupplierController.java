package org.usaid.era.controllers;

import org.usaid.era.models.Supplier;
import org.usaid.era.ejb.SupplierFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "supplierController")
@SessionScoped
public class SupplierController extends AbstractController<Supplier> implements Serializable {

    @Inject
    private SupplierFacade ejbFacade;

    public SupplierController() {
        super(Supplier.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
