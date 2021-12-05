package com.kulishd.springData.IntegrationTests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.web.util.UriComponentsBuilder;

public class BookingIT extends AbstractIntegrationTest{

    @Autowired
    private TestRestTemplate restTemplate;

    private HttpHeaders httpHeaders;

    @BeforeEach
    public void setup() {
        httpHeaders.add("lang", "en");
    }

    @Test
    void shouldGetBannerResponse() {
        httpHeaders = new HttpHeaders();
        var httpEntity = new HttpEntity<>(null, httpHeaders);

        var actual = restTemplate
            .exchange(UriComponentsBuilder.fromUriString("http://localhost:8080/booking/Capitan/me/5").toUriString(),
                HttpMethod.POST, httpEntity, String.class);

        assertThat(actual).isNotNull();
        assertThat(actual.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(actual.getBody()).isNotNull().satisfies(response -> assertThat(response).isEqualTo("123")
        );

    }
}
