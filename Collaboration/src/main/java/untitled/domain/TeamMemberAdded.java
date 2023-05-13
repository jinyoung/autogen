package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class TeamMemberAdded extends AbstractEvent {

    private string teamId;
    private string teamMember;

    public TeamMemberAdded(Team aggregate) {
        super(aggregate);
    }

    public TeamMemberAdded() {
        super();
    }
}
