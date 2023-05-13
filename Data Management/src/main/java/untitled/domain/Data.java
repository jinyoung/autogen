package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DataManagementApplication;
import untitled.domain.DataDownloaded;
import untitled.domain.DataShared;
import untitled.domain.DataUploaded;

@Entity
@Table(name = "Data_table")
@Data
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string dataId;

    private string dataName;

    private integer dataSize;

    private string dataType;

    private string dataLocation;

    private string dataPermissions;

    @PostPersist
    public void onPostPersist() {
        DataUploaded dataUploaded = new DataUploaded(this);
        dataUploaded.publishAfterCommit();

        DataDownloaded dataDownloaded = new DataDownloaded(this);
        dataDownloaded.publishAfterCommit();

        DataShared dataShared = new DataShared(this);
        dataShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DataRepository repository() {
        DataRepository dataRepository = DataManagementApplication.applicationContext.getBean(
            DataRepository.class
        );
        return dataRepository;
    }

    public static void dataBackupPolicy(DataUploaded dataUploaded) {
        /** Example 1:  new item 
        Data data = new Data();
        repository().save(data);

        */

        /** Example 2:  finding and process
        
        repository().findById(dataUploaded.get???()).ifPresent(data->{
            
            data // do something
            repository().save(data);


         });
        */

    }
}
