package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateTeamCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string teamName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private array teamMembers;
}
