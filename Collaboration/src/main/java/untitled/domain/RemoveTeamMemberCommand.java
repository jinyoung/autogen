package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class RemoveTeamMemberCommand {

    private string teamId;
    private string teamMember;
}
