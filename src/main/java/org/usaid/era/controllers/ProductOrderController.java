package org.usaid.era.controllers;

import org.usaid.era.models.ProductOrder;
import org.usaid.era.ejb.ProductOrderFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "productOrderController")
@SessionScoped
public class ProductOrderController extends AbstractController<ProductOrder> implements Serializable {

    @Inject
    private ProductOrderFacade ejbFacade;

    public ProductOrderController() {
        super(ProductOrder.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
