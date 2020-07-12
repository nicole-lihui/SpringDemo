package com.nicole.githubapi.controller;

import com.nicole.githubapi.service.RepoService;
import org.kohsuke.github.GitHub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("repo")
public class GithubRepoController {
    @Autowired
    private GitHub gitHub;

    @Autowired
    private RepoService repoService;

    @RequestMapping(value = "{login}/listrepo", method = RequestMethod.GET)
    public List<String> listRepo(@PathVariable String login) {
       return repoService.userListRepo(login);
    }

}
