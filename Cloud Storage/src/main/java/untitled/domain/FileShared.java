package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileShared extends AbstractEvent {

    private string fileId;
    private string fileName;
    private integer fileSize;
    private string fileType;
    private string fileLocation;
    private string filePermissions;

    public FileShared(File aggregate) {
        super(aggregate);
    }

    public FileShared() {
        super();
    }
}
