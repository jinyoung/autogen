package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.DataManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DataManagementApplication.class })
public class CucumberSpingConfiguration {}
