package com.example.backendcodingchallenge.controller;

import com.example.backendcodingchallenge.model.Language;
import com.example.backendcodingchallenge.model.Repository;
import com.example.backendcodingchallenge.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * User: RedOne
 * Date: 4/22/2020
 * Time: 4:18 PM
 */

@RestController
@RequestMapping("/api/repository")
public class RepoController {


    private final RepoService repoService;

    public RepoController(RepoService repoService) {
        this.repoService = repoService;
    }


    @GetMapping("/")
    public List<Language> getRepos() {
        return repoService.getLanguages();
    }

}
