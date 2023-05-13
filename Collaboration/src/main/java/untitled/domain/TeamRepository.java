package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "teams", path = "teams")
public interface TeamRepository
    extends PagingAndSortingRepository<Team, string> {}
