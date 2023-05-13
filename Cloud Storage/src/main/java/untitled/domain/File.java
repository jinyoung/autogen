package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CloudStorageApplication;
import untitled.domain.FileDownloaded;
import untitled.domain.FileShared;
import untitled.domain.FileUploaded;

@Entity
@Table(name = "File_table")
@Data
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private string fileId;

    private string fileName;

    private integer fileSize;

    private string fileType;

    private string fileLocation;

    private string filePermissions;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();

        FileDownloaded fileDownloaded = new FileDownloaded(this);
        fileDownloaded.publishAfterCommit();

        FileShared fileShared = new FileShared(this);
        fileShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static FileRepository repository() {
        FileRepository fileRepository = CloudStorageApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }

    public static void filePermissionsPolicy(FileShared fileShared) {
        /** Example 1:  new item 
        File file = new File();
        repository().save(file);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileShared.get???()).ifPresent(file->{
            
            file // do something
            repository().save(file);


         });
        */

    }
}
