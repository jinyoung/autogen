package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class AddTeamMemberCommand {

    private string teamId;
    private string teamMember;
}
