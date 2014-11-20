package bounceme.net.dur.jpa.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.bounceme.dur.jpa.entities.Page;

@Stateless
public class PageFacade extends AbstractFacade<Page> implements PageFacadeLocal, dur.beans.PageFacadeRemote {
    @PersistenceContext(unitName = "EntAppWeb-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PageFacade() {
        super(Page.class);
    }
    
}
