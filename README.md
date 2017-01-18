# CSCI 3601 Lab #2 - JavaScript and Node Lab
> TODO: Replace build status icon

During this lab, you will explore serving up a simple website that you create, using a [Spark][spark] server. Spark is a micro framework for creating web applications in Java.

Your website will make use of JavaScript to enable you to accept and process user input. You will also be introduced to Karma / Jasmine testing, as well as test code coverage reporting and continuous integration using Travis CI.

Your specific tasks for this lab can be found in the [LABTASKS.md][labtasks] file in this repository.

#Setup:

1. Clone your repository into a new project in WebStorm.
2. Run ``gradle build`` to build the project initially and fetch dependencies.

#Running Your Project:

You can run your project by running the command ``gradle run`` in the top of your project directory.
To access the your project, navigate to the address ``localhost:4567``.

#Testing Your Project:

The client-side portion of your project will be tested using Karma and Jasmine.
Karma is a test runner, and Jasmine is the framework / "language" that you will
write tests in. It is highly reccomended that you read the Jasmine testing
tutorial linked in the resources section at the bottom of this readme.

Karma is configured in the "karma" section of the ``build.gradle``.


#Continuous Integration with Travis CI
Travis CI is a Continuous Integration tool that performs builds of your project every time you push to GitHub. This is very helpful, as it makes
keeping track of your testing over the lifetime of a project very easy. Having a build/test history makes finding where, or when, your project broke
less of a nightmare.

With Travis any open-source, public project on GitHub can use Travis CI for free whereas people normally
need to pay for the ability to use Travis to build private repositories. Through your GitHub Student pack,
you get free private builds on Travis while you're a student.

> Protip: The GitHub Student pack has a ton of really awesome stuff in it, including $100 of credit to Digital Ocean! https://education.github.com/pack/offers

:question: Are there any good tutorials for setting up Travis with these
technologies? If so we should consider linking one of them here.

What you need to do:
- Sign into Travis CI with your GitHub account.

> Protip: We'd receommend having everyone in your group do this.

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

##Resoures
#####Handling requests in Spark:
> todo: add this information

#####Tutorial for testing with jasmine
http://jasmine.github.io/2.0/introduction.html

[labtasks]: LABTASKS.md
[spark]: http://sparkjava.com/
