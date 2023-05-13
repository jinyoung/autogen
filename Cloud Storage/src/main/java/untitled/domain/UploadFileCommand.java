package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UploadFileCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileName;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private integer fileSize;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileType;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string fileLocation;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private string filePermissions;
}
