# CSCI 3601 Lab #2 - Javascript and Node Lab
[![Build Status](https://travis-ci.com/joethe/3601-S16-lab2_javascript-node.svg?token=LxxL6VKVhy5gSxgHFAQ4&branch=master)](https://travis-ci.com/joethe/3601-S16-lab2_javascript-node)

During this lab, you will explore serving up a simple website that you create, using a Node.js server. Your website will make use of JavaScript to enable you to accept and process user input. You will also be introduced to Karma / Jasmine testing, as well as test code coverage reporting and continuous integration using Travis CI.


Your specific tasks for this lab can be found in the [LABTASKS.md](LABTASKS.md) file in this repository.

#Setup:
Run:
```
npm install
```
> Protip: npm stands for "Node Package Manager"

#Running Your Project:
Run
```
node app.js
``` 
in the project directory to start the node server and serve the project. It should be available on localhost:9000 by default.

>If you get an error something along the lines of ``command 'node' not found`` try running ``nodejs app.js``
instead. If neither of these work, you likely don't have node installed.

Every time you make changes to your project that you want to see, you will need to restart your node server. This can be accomplished by pressing ``Crtl + C`` in the terminal (the one in which your node server is running) followed by reissuing the ``node app.js`` command.

#Testing Your Project:

You will test your project using the Karma and Jasmine. Karma is a test runner, and Jasmine is the framework / "language" that you will be writing your tests in. It is highly recommended that you read the Jasmine testing tutorial linked in the resourses
section at the bottom of this document.

The ``karma.conf.js`` file should already exist if you cloned the repo correctly.
To run your tests, run:
```
karma start karma.conf.js
```
> If you get a message along the lines of ``bash: karma: command not found`` you probably don't have karma installed
correctly. You'll have to run: ``node_modules/karma/bin/karma start karma.conf.js`` instead.

#Continuous Integration with Travis CI
Travis CI is a Continuous Integration tool that performs builds of your project every time you push to GitHub. This is very helpful, as it makes
keeping track of your testing over the lifetime of a project very easy. Having a build/test history makes finding where, or when, your project broke
less of a nightmare.

With Travis any open-source, public project on GitHub can use Travis CI for free whereas people normally
need to pay for the ability to use Travis to build private repositories. Through your GitHub Student pack,
you get free private builds on Travis while you're a student.

> Protip: The GitHub Student pack has a ton of really awesome stuff in it, including $100 of credit to Digital Ocean! https://education.github.com/pack/offers

Most of the work to set up Travis has already been done for you in this lab, but we recommend that you read up a bit on the process (it's actually quite simple!)
- Setting up Travis CI With a Node.js / Karma project: http://karma-runner.github.io/0.8/plus/Travis-CI.html

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
#####Handling POST requests in Express:
http://codeforgeek.com/2014/09/handle-get-post-request-express-4/

#####Security concerns for handling POST requests in Express:
https://groups.google.com/forum/#!topic/express-js/iP2VyhkypHo

#####Tutorial for testing with jasmine
http://jasmine.github.io/2.0/introduction.html
