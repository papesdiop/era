package org.usaid.era.controllers;

import org.usaid.era.models.Delivery;
import org.usaid.era.ejb.DeliveryFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "deliveryController")
@SessionScoped
public class DeliveryController extends AbstractController<Delivery> implements Serializable {

    @Inject
    private DeliveryFacade ejbFacade;

    public DeliveryController() {
        super(Delivery.class);
    }

    @PostConstruct
    public void init() {
        super.setSelected(new Delivery());
        super.setFacade(ejbFacade);
    }

}
