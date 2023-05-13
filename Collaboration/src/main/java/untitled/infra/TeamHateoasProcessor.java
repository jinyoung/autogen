package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class TeamHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Team>> {

    @Override
    public EntityModel<Team> process(EntityModel<Team> model) {
        return model;
    }
}
