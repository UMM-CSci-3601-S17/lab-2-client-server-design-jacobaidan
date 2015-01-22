# nodeLabExample
Playing with node and express a bit. This setup might be used to teach students about nodejs and routing.


#Setup:
Run:
```
npm install
```

#Running Your Project:
Run
```
node app.js
``` 
in the project directory to serve the project. It should be available on localhost:9000 by default.

>If you get an error something along the lines of ``command 'node' not found`` try running ``nodejs app.js``
instead. If neither of these work, you likely don't have node installed.

Every time you make changes to your project that you want to see, you will need to restart your node server. This can be accomplished by pressing ``Crtl + C`` in the terminal (the one in which your node server is running) followed by reissuing the ``node app.js`` command.

#Testing Your Project

The ``karma.conf.js`` file should already exist if you cloned the repo correctly.
To run your tests, run:
```
karma start karma.conf.js
```
> If you get a message along the lines of ``bash: karma: command not found`` you probably don't have karma installed
correctly. You'll have to run: ``node_modules/karma/bin/karma start karma.conf.js`` instead.

##Resoures
#####Handling POST requests in Express:
http://codeforgeek.com/2014/09/handle-get-post-request-express-4/

#####Security concerns for handling POST requests in Express:
https://groups.google.com/forum/#!topic/express-js/iP2VyhkypHo

#####Tutorial for testing with jasmine
http://jasmine.github.io/2.0/introduction.html
