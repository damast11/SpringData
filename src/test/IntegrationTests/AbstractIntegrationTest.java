package com.kulishd.springData.IntegrationTests;

import com.kulishd.springData.SpringDataApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringDataApplication.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AbstractIntegrationTest {
    protected AbstractIntegrationTest() {}
}
