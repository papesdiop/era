package org.usaid.era.controllers;

import org.usaid.era.models.Unit;
import org.usaid.era.ejb.UnitFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "unitController")
@SessionScoped
public class UnitController extends AbstractController<Unit> implements Serializable {

    @Inject
    private UnitFacade ejbFacade;

    public UnitController() {
        super(Unit.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
