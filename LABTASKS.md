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

Make sure you understand what role Gradle is playing in the
project, and what the purpose of `build.gradle` is. Also make
sure you understand the purpose of Travis.

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

## Use ZenHub to support Agile development

We'll be using ZenHub to augment the standard GitHub issues
system with nifty powers to aid in Agile estimating,
planning, tracking, and development. The next two sections
describe the software development tasks you need to complete
for this lab, which fall into two main groups:
* Augmenting the server API with new functionality
* Augmenting the client to allow the user to access that new
functionality.

### Setting up the project ZenHub board

So before you actually start _coding_ on any of that, you
should spend some time using ZenHub to capture and estimate
stories and do some planning.

* Make sure you've turned on [ZenHub](http://zenhub.com) so it works :smile:
* Create at least one Milestone that starts on the first day of lab and ends when the lab is due
   * If you want to break the lab period into smaller time boxes and have multiple, smaller Milestones, that would be OK as well. If you do this, make sure you provide
   reasonable start and end dates so one follows on from the
   other, and the first starts at the beginning of the lab
   and the last ends when the lab is due.
* Create two Epics:
   * One for augmenting the backend API
   * One for adding client-side support for accessing those
   new API features
* Create a collection of stories/issues for the different
development activities in the lab
   * You'll want to go through the descriptions below of the
     desired tasks, and turn those into individuals stories
   * You should add an estimate to each story; we'll say more
     about that below
   * You should add each story to the appropriate Epic
* Once you've created and estimated all the stories, you
should think about which ones you think you can reasonably
do in this lab. This could be all of them, but it doesn't
have to be. You can always add stories to this Milestone as
things progress, and in general customers would rather see
the set of stories you expect to complete in this Milestone
_increase_ rather than _decrease_, so being conservative in
your initial planning is probably a Good Thing.
   * You should add the stories that you _expect_ to do in the lab to your Milestone.
   * You should move the stories you expect to do into the Backlog track, and move all the other stories into the Icebox track.

### Using the board

You'll then need to keep an eye on your board throughout the
lab, using it to guide your decisions about what to work on,
updating issues as you make progress, etc.

Whenever you sit down to work on the project, you should be
clearly working on a specific story. If you feel like there's
something that _needs_ to be done but isn't in a card, you
should make a story for that before you start working on it.

When you start work on a new story, you should create a
feature branch for that story, and commit your work on that
story to that branch. Commit messages should refer to that
story (by number, e.g., `Issue #8`) so GitHub can auto-link
the commits to that issue for you.

When you feel like a story is complete
* Move that card to the Review/QA track
* Issue a Pull Request (_we'll have to talk about this in lab_) from your feature branch onto your master branch

Then step away from that story for a while,
either by working on a different part of the lab, or by
doing something unrelated to Software Design. Then come back
back to that _as a team_ and review the requirements
described in the story and compare them to the functionality
you implemented. Is the story _done done_? Are there solid
and complete tests that back up the work? Can you break it?
Have you tried? Would you bet your career (or at least your
next raise) on this working in a customer demo or out in the
field?

If you find issues, document them, either in the existing
story, or through new stories. Then go back to working in
the feature branch for that story, and repeat the whole
process.

Once the story passes review, you should
* Merge the associated feature branch into master by accepting the (perhaps modified) pull request
* Move the story to the Done or Closed track as you see fit

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

## Extending the client functionality

Once you've made some progress in setting up your API, your
group should implement a new web page to make accessing your
API easier.

* Create a new HTML file called `todo.html`
* Create a new Javascript file called `todo.js`

> Make sure you create these files in the right locations! ;)

* Use basic HTML form elements and javascript to create a simple
interface for making requests to your API.

> You don't have to worry about actually using the returned JSON,
just dumping it onto the web page (like in the 'users' example) is fine.

