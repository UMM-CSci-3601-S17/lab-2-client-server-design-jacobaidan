 - What is the purpose of `.gitignore`?

.gitignore is used by Git to determine which files/directories to ignore before a commit is made.
These files should be committed into the repository in order to share it with other users.

 - Explain what a route is. 

As we understand it, a route is a function that takes a request and returns a response in relation to .html directories.

 - What is the purpose of umm3601.Server class?

The server class recieves a request and redirects the user to various .html files.

 - What is the purpose of the umm3601.user.UserController class?
 
The UserController filters Users by various key values.
 
 - users
  
You're brought to users.html.
  
 - api/users
   
You're brought to a JSON map of the listed users.
   
 - api/users?age=25
 
This sorts the users according to the age specified.

 - api/users/588935f5de613130e931ffd5 
 
This sorts the users according to the Id specified.

 - Adding Kittens and Meow
 
We added another route to Server.java and made a Kittens.html to redirect to.

 - What are the contents of the public folder? What is the purpose of each of the HTML files there? 
 
This folder contains anything that the user will be able to view, be it HTML to images.
The HTML files represent the structure of the webpages that can be visited and interacted with.

 - Describe what happens when you filter users by age in the client? What is read from the web page, and what request is sent to the server? What is received, and how/where is it displayed? 
 
The web page displays raw JSON text with the filtered attributes requested.
When a filter is asked for, a query is sent to Server.java, but is parced in UserController, then sent back through Server.java to the user.

 - 
 
 
