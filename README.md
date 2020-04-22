# REST microservice that list the languages used by the 100 trending public repos on GitHub

For every language, you need to calculate the attributes below 👇:

    Number of repos using this language
    The list of repos using the language



## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[Unirest](http://kong.github.io/unirest-java/) - Unirest is a lightweight HTTP client library from Mashape. Along with Java, it's also available for Node.js, .Net, Python, Ruby, etc.

## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.example.backendcodingchallenge.BackendCodingChallengeApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

# REST API

The REST API to the this app is described below.

## List the languages used by the 100 trending public repos on GitHub

### Request

`GET /api/languages`

    curl -i -H 'Accept: application/json' http://localhost:8080/api/languages

### Response

    HTTP/1.1 200 OK
    Status: 200 OK
    Content-Type: application/json

    [
        {
            "name": "C++",
            "repositories": [
                {
                    "name": "obs-mac-virtualcam",
                    "html_url": "https://github.com/johnboiles/obs-mac-virtualcam",
                    "created_at": "2020-04-01T20:08:12Z",
                    "stargazers_count": "425",
                    "language": "C++"
                },
                {
                    "name": "graph-learn",
                    "html_url": "https://github.com/alibaba/graph-learn",
                    "created_at": "2020-03-26T10:39:32Z",
                    "stargazers_count": "381",
                    "language": "C++"
                }
            ],
            ....
    ]
    
   
## Files and Directories

The project (a.k.a. project directory) has a particular directory structure. A representative project is shown below:

```
.
├───src
│   ├───main
│   │   ├───java
│   │   │   └───com
│   │   │       └───example
│   │   │           └───backendcodingchallenge
│   │   │               ├───controller
│   │   │               ├───model
│   │   │               └───service
│   │   └───resources
│   │       └── application.properties
│   └───test
│       └───java
│           └───com
│               └───example
│                   └───backendcodingchallenge
├── pom.xml
└── README.md
```

## packages

- `model` — to hold our entities;
- `service` — to hold our business logic;
- `controller` — to listen to the client;

- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies

## Copyright

Radouane KHOUADRI