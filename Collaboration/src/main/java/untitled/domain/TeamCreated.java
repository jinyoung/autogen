package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class TeamCreated extends AbstractEvent {

    private string teamId;
    private string teamName;
    private array teamMembers;

    public TeamCreated(Team aggregate) {
        super(aggregate);
    }

    public TeamCreated() {
        super();
    }
}
