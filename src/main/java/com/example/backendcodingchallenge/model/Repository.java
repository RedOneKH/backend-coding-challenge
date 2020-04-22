package com.example.backendcodingchallenge.model;

import lombok.Data;

/**
 * User: RedOne
 * Date: 4/22/2020
 * Time: 4:20 PM
 * Representation of Github repository object
 */

@Data
public class Repository {

    private String name;
    private String html_url;
    private String created_at;
    private String stargazers_count;
    private String language;

}
