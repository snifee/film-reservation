package com.challenge4.FilmApp.testing;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.http.*;

import java.net.http.HttpHeaders;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FilmTest {
    @Autowired
    private TestRestTemplate restTemplate;

//    @Test
//    private void testId(){
//        HttpHeaders headers = new HttpHeaders();
//        headers.set
//    }
}