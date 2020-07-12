package com.nicole.githubapi;

import com.nicole.githubapi.service.RepoService;
import org.junit.jupiter.api.Test;
import org.kohsuke.github.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
public class SimpleTest {

    @Autowired
    private RepoService repoService;

    @Test
    public void listRepo() {
        List<String> l = repoService.origListRepo("jee-code");
        l.forEach(r -> System.out.println(r));
    }
}
