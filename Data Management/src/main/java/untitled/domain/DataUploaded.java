package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class DataUploaded extends AbstractEvent {

    private string dataId;
    private string dataName;
    private integer dataSize;
    private string dataType;
    private string dataLocation;
    private string dataPermissions;

    public DataUploaded(Data aggregate) {
        super(aggregate);
    }

    public DataUploaded() {
        super();
    }
}
