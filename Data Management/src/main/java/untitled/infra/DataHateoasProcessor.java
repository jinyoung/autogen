package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class DataHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Data>> {

    @Override
    public EntityModel<Data> process(EntityModel<Data> model) {
        return model;
    }
}
