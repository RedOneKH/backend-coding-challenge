package com.example.backendcodingchallenge.controller;

import com.example.backendcodingchallenge.model.Language;
import com.example.backendcodingchallenge.model.Repository;
import com.example.backendcodingchallenge.service.RepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * User: RedOne
 * Date: 4/22/2020
 * Time: 4:18 PM
 */

@RestController
@RequestMapping("/api/languages")
public class RepoController {


    private final RepoService repoService;

    public RepoController(RepoService repoService) {
        this.repoService = repoService;
    }


    @GetMapping("")
    public ResponseEntity<List<Language>> getRepos() {

        // return response with status OK if there is content

        return repoService.getLanguages()
                .map(languages -> new ResponseEntity<>(languages, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(new ArrayList<>(), HttpStatus.NO_CONTENT));
    }

}
