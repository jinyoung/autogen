package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.CloudStorageApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CloudStorageApplication.class })
public class CucumberSpingConfiguration {}
