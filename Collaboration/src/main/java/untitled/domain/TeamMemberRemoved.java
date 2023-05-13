package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class TeamMemberRemoved extends AbstractEvent {

    private string teamId;
    private string teamMember;

    public TeamMemberRemoved(Team aggregate) {
        super(aggregate);
    }

    public TeamMemberRemoved() {
        super();
    }
}
