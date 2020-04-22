package com.example.backendcodingchallenge;

import com.example.backendcodingchallenge.service.RepoService;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BackendCodingChallengeApplicationTests {

    @Autowired
    RepoService repoService;

    @Test
    void contextLoads() {
        Assertions.assertTrue(repoService.getLanguages().isPresent());
    }

}
