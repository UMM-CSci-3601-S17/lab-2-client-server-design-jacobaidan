# Lab Tasks

- Questions that you need to answer (as a group!) are indicated with question mark symbols (:question:).
- Tasks that specify work to do without a written response will be bulleted.

Responses to questions should be submitted as specified by your instructor.

If you're ever confused about what you need to do for a given task, ask.

## Exploring the project

Look over the directory structure of the project before you start
making changes to it, and consider the various tools that we are
using to manage our project.

:question: What is the purpose of `.gitignore`?
:question: What is 'Gradle'? What is the purpose of `build.gradle`?
:question: What is the purpose of 'Travis'?

## Exploring the server

Study the server (Java) code in project you have cloned.
Run it according to the instructions in the
[README](./README.md), including running the JUnit tests. Answer
the following questions.

> Protip: Using Google to gain additional knowledge or support your conjectures about how something works is great! It's important that you think about everything and come to an understanding, though, so don't use Google as a scapegoat to get the questions done quickly or you will regret it!

:question: Explain what a _route_ is.

:question: What is the purpose of `umm3601.Server` class?
What is the purpose of the `umm3601.user.UserController` class?
Explain what happens when a user accesses each of the
following URLs:
- :question: The page `users`
- :question: The page `api/users`
- :question: The page `api/users?age=25`
- :question: The page `api/users/588935f5de613130e931ffd5`

Look at the tests in `src/test/java/umm3601.user` as they can
provide useful information about the intention of various
functions in the `UserController` class, and thus `Server`.

You should make sure you run the JUnit tests, and it would be
good to deliberately modify some of the tests and see what
happens when they break. (But make sure you restore them to
their passing state when you're done.)

:question: What happens when the user accesses the page
"kittens"? Modify the server code so accessing the page
"kittens" results in the text "Meow". Describe what you
did and how it worked.

## Exploring the client

The client resources are in `src/main/resources/public`, which
contains the necessary HTML, CSS, and JavaScript files to
construct the client-side web app. To simplify things below
we'll just refer to this as the `public` folder.

:question: What are the contents of the `public` folder? What is the purpose of each of the HTML files there?

:question: Describe what happens when you filter users by
age in the client? What is read from the web page, and what
request is sent to the server? What is received, and how/where
is it displayed?

:question: Where is the client-side JavaScript defined? Name the file(s) in which it is used.

## Extending the server API

The initial server (Java) code demonstrates reading in a
collection of (randomly generated) user data, and making it
available (with filtering) via the simple API you explored above.

Your task here is to use test-driven development (TDD) to
extend the server's API to support serving 'to-do' data. There
is a file `data/todos` that has several hundred randomly
generated "to-do"s, each of which has:
* A unique `_id`
* An `owner`
* A `status` (which is a boolean - is the task completed or not)
* A `body` that describes the task
* A `category`

At the very least (necessary to get 85% of this part of the lab)
you should implement the following API endpoints:
* `api/todos`, which returns all the to-dos
* `api/todos/:id`, which returns the to-do with the specified ID
* `api/todos?limit=7`, which lets you specify that maximum
number of todos that the server returns
* `api/todos?status=complete` (or `incomplete`), which lets you
filter the todos and only return the complete (or incomplete)
ones
* `api/todos?contains=banana`, which lets you search for to-dos
whose _bodies_ contain (anywhere) the given string (in this
case "banana")

To get full (100%) credit on this part of the lab you should
implement the additional endpoints:
* `api/todos?owner=Blanche`, which returns just the to-dos
owned by Blanche
* `api/todos?category=groceries`, which returns just the to-dos
in the `groceries` category
* `api/todos?orderBy=owner` (or `body`, `status`, or `category`),
which sorts the returned to-dos alphabetically by the specified
field

For full credit you also need to support arbitrary combinations
of these filters, e.g.,

```
api/todos?owner=Blanche&status=complete&limit=12
```

which would return the first 12 completed to-dos owned by
Blanche.
