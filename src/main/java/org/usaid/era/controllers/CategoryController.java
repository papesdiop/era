package org.usaid.era.controllers;

import org.usaid.era.models.Category;
import org.usaid.era.ejb.CategoryFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "categoryController")
@SessionScoped
public class CategoryController extends AbstractController<Category> implements Serializable {

    @Inject
    private CategoryFacade ejbFacade;

    public CategoryController() {
        super(Category.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
