package org.usaid.era.controllers;

import org.usaid.era.models.Orders;
import org.usaid.era.ejb.OrdersFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "ordersController")
@SessionScoped
public class OrdersController extends AbstractController<Orders> implements Serializable {

    @Inject
    private OrdersFacade ejbFacade;

    public OrdersController() {
        super(Orders.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
