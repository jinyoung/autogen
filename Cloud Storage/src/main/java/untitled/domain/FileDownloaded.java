package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class FileDownloaded extends AbstractEvent {

    private string fileId;
    private string fileName;
    private integer fileSize;
    private string fileType;
    private string fileLocation;
    private string filePermissions;

    public FileDownloaded(File aggregate) {
        super(aggregate);
    }

    public FileDownloaded() {
        super();
    }
}
