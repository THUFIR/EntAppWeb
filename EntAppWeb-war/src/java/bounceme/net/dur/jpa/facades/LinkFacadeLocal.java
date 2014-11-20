package bounceme.net.dur.jpa.facades;

import java.util.List;
import javax.ejb.Local;
import net.bounceme.dur.jpa.entities.Link;

@Local
public interface LinkFacadeLocal {

    void create(Link link);

    void edit(Link link);

    void remove(Link link);

    Link find(Object id);

    List<Link> findAll();

    List<Link> findRange(int[] range);

    int count();
    
}
