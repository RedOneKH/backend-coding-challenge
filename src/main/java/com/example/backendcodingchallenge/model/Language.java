package com.example.backendcodingchallenge.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * User: KaiTo
 * Date: 4/22/2020
 * Time: 6:00 PM
 * Bean holds Language used by repositories
 */
@Builder
@Data
public class Language {

    private String name;
    private List<Repository> repositories;
    private int repos_count;

}
