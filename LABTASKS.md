#Lab Tasks

## Part #1: exploring the node.js project
Study the project you have cloned. Run it according to the instrucitons in the README, including running the tests. Answer the following questions by editing this file.  This will give you a chance to play with markdown.

#####What is the purpose of app.js? Explain what happens when a user is trying to access a page "kittens", when a user is trying to access the page "petForm", and when the user submits a form on "petForm". Explain what a "route" is.

> Your Answer Here!

#####What is the contents of the "public" folder? What is each of the html files there and how are they referenced in app.js?

> Your Answer Here!

#####In your project change the message that appears when the user is trying to access the page "kittens". Describe what you did and how it worked.

> You get the idea...

#####Also change the message that a user sees when they are trying to find a page that doesn't exist.

#####Describe what happens when you submit a form on petForm page. What are the form parameters in petForm? What is the method for the form? Where is the form submission handled in the project? How are parameters extracted? How is the resulting message generated? How is this different from accessing the page petForm the first time (to see the form)?

#####Where is client-side Javascript defined? Name file(s) in which it is used.

#####Where is server-side Javascript helper file defined? Where can it be used? Add a function to it and experiment with where you can call this function.

#####What is the purpose of package.json file? What's in it, and what does it mean?

#####What's in .giignore file? What's the purpose of it?

## Part #2: exploring testing

#####Find the testing file, describe where it is located and what it is testing. Run karma (the testing engine) as specified in the Readme and describe results.

- Study jasmine testing syntax. Think of a Javascript function, describe its behavior by writing tests for it (this is test-driven development, or TDD). Add the function, run the tests. (Actually do this. Don't forget to commit your changes!)

## Part #3: adding a GPA calculator

- Add a page to the project (don't forget to add it to git) that has a form for letter grades and credits for three classes.

- In TDD fashion, add tests for functions needed to compute the GPA and then implement the functions themselves. Note, however, that karma doesn't work with exports, so after you have tested the functions, you would need to create copies of them that you are exporting. This is awkward and will be fixed in subsequent node setups. Also make sure to add the file that you are testing to karma.conf.js.

- Add a route to app.js to display the GPA on the resulting page.

- Add the basic html to the send so that the GPA is displayed as an html page. Don't add too much: later we will be using various libraries to take care of generating html.

- As you are working, don't forget to change drivers in pair-programming, practice TDD, write comments, and make frequent commits. As before, at the end just push all the changes to github.

