package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UploadDataCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string dataName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private integer dataSize;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string dataType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string dataLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string dataPermissions;
}
