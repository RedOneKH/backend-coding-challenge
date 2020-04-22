package com.example.backendcodingchallenge.model;

import lombok.Data;

import java.util.List;

/**
 * User: KaiTo
 * Date: 4/22/2020
 * Time: 5:20 PM
 * Github Api response model
 */

@Data
public class Response {

    private List<Repository> items;
}
