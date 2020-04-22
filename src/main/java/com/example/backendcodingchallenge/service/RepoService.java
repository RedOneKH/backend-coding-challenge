package com.example.backendcodingchallenge.service;

import com.example.backendcodingchallenge.model.Language;
import com.example.backendcodingchallenge.model.Repository;
import com.example.backendcodingchallenge.model.Response;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: RedOne
 * Date: 4/22/2020
 * Time: 4:19 PM
 */

@Service
public class RepoService {

    private List<Repository> getRepos() {


        //get date from 30 days ago
        LocalDate localDate = LocalDate.now().minusDays(30);

        String date = localDate.toString(); // format the date as needed for the api "yyyy-MM-dd

        Response response = Unirest.get("https://api.github.com/search/repositories")
                .header("accept", "application/json")
                .queryString("q", "created:>=" + date) // query repos from the last 30 days
                .queryString("sort", "stars") // sort the resuts by number of stars
                .queryString("order", "desc") // order descending
                .queryString("per_page", "100") // get 100 item per page
                .asObject(Response.class)
                .getBody();


        return response.getItems();
    }
    

}
