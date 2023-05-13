package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CollaborationApplication;
import untitled.domain.TeamCreated;
import untitled.domain.TeamMemberAdded;
import untitled.domain.TeamMemberRemoved;

@Entity
@Table(name = "Team_table")
@Data
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string teamId;

    private string teamName;

    private array teamMembers;

    @PostPersist
    public void onPostPersist() {
        TeamCreated teamCreated = new TeamCreated(this);
        teamCreated.publishAfterCommit();

        TeamMemberAdded teamMemberAdded = new TeamMemberAdded(this);
        teamMemberAdded.publishAfterCommit();

        TeamMemberRemoved teamMemberRemoved = new TeamMemberRemoved(this);
        teamMemberRemoved.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TeamRepository repository() {
        TeamRepository teamRepository = CollaborationApplication.applicationContext.getBean(
            TeamRepository.class
        );
        return teamRepository;
    }
}
