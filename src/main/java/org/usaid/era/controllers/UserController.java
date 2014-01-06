package org.usaid.era.controllers;

import org.usaid.era.models.User;
import org.usaid.era.ejb.UserFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "userController")
@SessionScoped
public class UserController extends AbstractController<User> implements Serializable {

    @Inject
    private UserFacade ejbFacade;

    public UserController() {
        super(User.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
