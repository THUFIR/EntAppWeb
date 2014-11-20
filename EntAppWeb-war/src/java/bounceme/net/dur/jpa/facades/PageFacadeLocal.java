package bounceme.net.dur.jpa.facades;

import java.util.List;
import javax.ejb.Local;
import net.bounceme.dur.jpa.entities.Page;

@Local
public interface PageFacadeLocal {

    void create(Page page);

    void edit(Page page);

    void remove(Page page);

    Page find(Object id);

    List<Page> findAll();

    List<Page> findRange(int[] range);

    int count();
    
}
