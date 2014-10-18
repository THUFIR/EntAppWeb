package dur.database;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class QueryBeanWithEntityManager {

    private static final long serialVersionUID = 1L;
//    private final Logger log = Logger.getLogger(QueryBeanWithEntityManager.class.getName());

    @PersistenceContext(name = "EnterpriseBirdsJPA-warPU")
    EntityManager em;

    public QueryBeanWithEntityManager() {
    }

    public Clients getClientById(int id) {
        TypedQuery<Clients> query = em.createQuery("Select e from Clients e where e.id = :id", Clients.class);
        query.setParameter("id", id);
        Clients c = query.getSingleResult();
        return c;
    }

    public List<Clients> getClients() {
        TypedQuery<Clients> query = em.createQuery("select c from Clients c", Clients.class);
        List<Clients> result = query.getResultList();
        return result;
    }

}
