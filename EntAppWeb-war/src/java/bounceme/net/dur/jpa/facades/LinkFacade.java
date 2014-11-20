package bounceme.net.dur.jpa.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.bounceme.dur.jpa.entities.Link;

@Stateless
public class LinkFacade extends AbstractFacade<Link> implements LinkFacadeLocal, dur.beans.LinkFacadeRemote {
    @PersistenceContext(unitName = "EntAppWeb-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LinkFacade() {
        super(Link.class);
    }
    
}
