package org.usaid.era.controllers;

import org.usaid.era.models.ProductOperation;
import org.usaid.era.ejb.ProductOperationFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "productOperationController")
@SessionScoped
public class ProductOperationController extends AbstractController<ProductOperation> implements Serializable {

    @Inject
    private ProductOperationFacade ejbFacade;

    public ProductOperationController() {
        super(ProductOperation.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
