# CSCI 3601 Lab #2 - JavaScript and Spark Lab

[![Build Status](https://travis-ci.com/joethe/3601-S16-lab2_javascript-node.svg?token=LxxL6VKVhy5gSxgHFAQ4&branch=master)](https://travis-ci.com/joethe/3601-S16-lab2_javascript-node)

During this lab, you will explore serving up a simple website that you create, using a [Spark][spark] server. Spark is a micro framework for creating web applications in Java. You will be using Spark to create the back-end of your website.

Your website will make use of JavaScript on the front-end to enable you to accept and process user input. You will also be introduced to Karma / Jasmine testing, as well as test code coverage reporting and continuous integration using [Travis CI][travis].

Your specific tasks for this lab can be found in the [LABTASKS.md][labtasks] file in this repository.

## Setup

1. Clone your repository into a new project in WebStorm.
2. Run `./gradlew build -x test` to build the project initially and fetch dependencies.

## Running Your project

We use the [Gradle][gradle] build tool to build and run our web application. Gradle is a powerful task running system that allows us to easily build and test our full web application.

You will use the included gradle wrapper to run the project. A *gradle wrapper* is a way to run gradle projects without having to install gradle globally.

To start your web server, run:

```bash
./gradlew run
```

You'll probably be wondering why you're getting yelled at and why there are a bunch of errors -- this is because there are failing tests. In a production application, builds typically fail when there are tests failing.

Let's start the server for real. We can ignore tests by passing the `-PskipTests` flag:

```bash
./gradlew run -PskipTests
```

Your server should now be running on port 4567, the default Spark port. Visit it at [http://localhost:4567][local].

## Testing Your Project

### Client-side

The client-side portion of your project will be tested using [Karma][karma] and [Jasmine][jasmine]. Karma is a JavaScript test runner, and Jasmine is the framework / "language" that you will write tests in. It is highly recommend that you read the Jasmine testing tutorial linked in the resources section at the bottom of this README.

Client-sided tests are located in the `src/test/javascript` directory. Naming follows a simple pattern. For a file such as `clientJavascript.js`, the test would be called `clientJavascript.spec.js`. All client-side tests end in `.spec.js`.

To run your client-side tests, run:
```bash
./gradlew karmaRun
```

### Server-side

The server-side portion of this project will be tested using JUnit.

Server-sided tests are located in the `src/test/java` directory. Naming convention for this also follows a simple pattern. For a file such as `Server.java`, the test would be called `ServerSpec.java`.

To run your server-side tests, run:

```bash
./gradlew test -x karmaRun
```

### Both

To run both tests at the same time, run:

```bash
./gradlew test
```

## Continuous Integration with Travis CI
[Travis CI][travis] is a Continuous Integration tool that performs builds of your project every time you push to GitHub. This is very helpful, as it makes keeping track of your testing over the lifetime of a project very easy. Having a build/test history makes finding where, or when, your project broke less of a nightmare.

With Travis any open-source, public project on GitHub can use Travis CI for free whereas people normally need to pay for the ability to use Travis to build private repositories. Through your GitHub Student pack, you get free private builds on Travis while you're a student.

> Protip: The GitHub Student pack has a ton of really awesome stuff in it, including $100 of credit to Digital Ocean! https://education.github.com/pack/offers

We've done the hard part of setting up the [.travis.yml][travis-yml] file. You can look at it by clicking the previous link or read about setting up a Java Gradle project with Travis by [clicking here][travis-java].

What you need to do:
- Sign into Travis CI with your GitHub account.

> Protip: We'd recommend having everyone in your group do this.

- Authorize the application to access your GitHub account.
  - Read through the "First Time Here?" instructions.
- Click on the "+" on the left side of the page near "My Repositories".
- Find your fork for this lab in the list of repositories.
- Enable continuous integration for it by clicking the big toggle switch beside it.
- Then, click on the gear icon (settings) directly next to the previous toggle switch.
- From here, you can see various pieces of information and settings regarding the builds of your project.
- At this point, make some change to your forked project and add those changes to GitHub (It doesn't really matter what you do, this is needed to trigger a Travis build).
- Click on the Build Status Image button to the right of the name of the repository.
  - Select "Master" for the Branch.
  - Select "Markdown" for the drop-down.
  - Copy the markdown it provides.
  - Update the README.md file to swap out the build status image at the top with your own.

Your own forked project is now ready for the magic of continuous integration!

## Resources
##### Handling requests in Spark:
- [Using Spark to create APIs in Java][spark-api]
- [Response handling with Spark][spark-response]
- [Spark documentation][spark-documentation]

##### Tutorial for testing with Jasmine
- [Introduction to Jasmine testing][jasmine-introduction]

[gradle]: https://gradle.org/
[jasmine]: https://jasmine.github.io/
[jasmine-introduction]: http://jasmine.github.io/2.0/introduction.html
[karma]: https://karma-runner.github.io/1.0/index.html
[labtasks]: LABTASKS.md
[local]: http://localhost:4567/
[spark]: http://sparkjava.com/
[spark-api]: http://nordicapis.com/using-spark-to-create-apis-in-java/
[spark-documentation]: http://sparkjava.com/documentation.html
[spark-response]: http://sparkjava.com/documentation.html#response
[travis]: https://travis-ci.org/
[travis-java]: https://docs.travis-ci.com/user/languages/java/
[travis-yml]: .travis.yml
