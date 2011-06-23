package org.jboss.seam.university.action;

import java.util.Date;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.jboss.seam.transaction.Transactional;
import org.jboss.seam.university.model.LatestContent;

/**
 * 
 * @author Shane Bryzak
 *
 */
public class LatestContentAction {

    @Inject EntityManager entityManager;
    
    @Transactional
    public void add(String identifier, Date updated) {
        LatestContent lc = new LatestContent();
        lc.setUuid(identifier);
        lc.setUpdated(updated);
        entityManager.persist(lc);
    }
}
