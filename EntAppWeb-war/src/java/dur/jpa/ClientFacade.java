package dur.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClientFacade extends AbstractFacade<Client> implements ClientFacadeInterface {
    @PersistenceContext(unitName = "EntAppWeb-warPU")
    private EntityManager em;

    
    @Override
     protected EntityManager getEntityManager() {
        return em;
    }

    public ClientFacade() {
        super(Client.class);
    }
    
}
