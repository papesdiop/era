package org.usaid.era.controllers;

import org.usaid.era.models.Product;
import org.usaid.era.ejb.ProductFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "productController")
@SessionScoped
public class ProductController extends AbstractController<Product> implements Serializable {

    @Inject
    private ProductFacade ejbFacade;

    public ProductController() {
        super(Product.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }
 
}
