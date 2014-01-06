package org.usaid.era.controllers;

import org.usaid.era.models.Profil;
import org.usaid.era.ejb.ProfilFacade;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.inject.Inject;
import javax.enterprise.context.SessionScoped;

@Named(value = "profilController")
@SessionScoped
public class ProfilController extends AbstractController<Profil> implements Serializable {

    @Inject
    private ProfilFacade ejbFacade;

    public ProfilController() {
        super(Profil.class);
    }

    @PostConstruct
    public void init() {
        super.setFacade(ejbFacade);
    }

}
