/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.usaid.era.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.usaid.era.models.Unit;

/**
 *
 * @author papesdiop
 */
@Stateless
public class UnitFacade extends AbstractFacade<Unit> {
    @PersistenceContext(unitName = "org.usaid.era_era-webapp_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UnitFacade() {
        super(Unit.class);
    }
    
}
