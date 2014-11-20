package bounceme.net.dur.jpa.facades;

import dur.beans.FeedFacadeRemote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.bounceme.dur.jpa.entities.Feed;

@Stateless
public class FeedFacade extends AbstractFacade<Feed> implements FeedFacadeLocal, FeedFacadeRemote {
    @PersistenceContext(unitName = "EntAppWeb-warPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FeedFacade() {
        super(Feed.class);
    }
    
}
