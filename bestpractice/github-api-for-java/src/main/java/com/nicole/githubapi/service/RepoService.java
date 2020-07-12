package com.nicole.githubapi.service;

import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.PagedIterable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@Service
public class RepoService {

    @Autowired
    private GitHub gitHub;

    public List<String> userListRepo(String login) {
        List<String> repolist = null;
        try {
            repolist = new LinkedList<>();
            PagedIterable<GHRepository> rplist = gitHub.getUser(login).listRepositories();
            if (rplist != null) {
                for (GHRepository repo : rplist) {
                    repolist.add(repo.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return repolist;
    }

    public List<String> origListRepo(String origName) {
        PagedIterable<GHRepository> repol = null;
        List<String> repolist = null;
        try {
            repol = gitHub.getOrganization("wit-course").listRepositories();
            if (repol != null) {
                repolist = new LinkedList<>();
                for (GHRepository repo : repol) {
                    repolist.add(repo.getName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return repolist;
    }
}
