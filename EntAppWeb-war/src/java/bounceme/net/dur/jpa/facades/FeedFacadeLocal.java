package bounceme.net.dur.jpa.facades;

import java.util.List;
import javax.ejb.Local;
import net.bounceme.dur.jpa.entities.Feed;

@Local
public interface FeedFacadeLocal {

    void create(Feed feed);

    void edit(Feed feed);

    void remove(Feed feed);

    Feed find(Object id);

    List<Feed> findAll();

    List<Feed> findRange(int[] range);

    int count();
    
}
