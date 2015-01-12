/**
 * Created by joseph on 1/9/15.
 */

var express = require('express');
var app = express();


var options = {
    root: __dirname + '/public',
    dotfiles: 'deny'
};

app.use(express.static(__dirname + '/public'));

app.get('/kittens', function(req, res){
    res.send("Page under construction!");
    //res.sendfile('public/kittens.html');
});

app.get('/about', function(req, res){
    res.sendFile('about.html', options);
});

app.get('/', function(req, res){
    res.sendFile('home.html', options);
});

app.get('*', function(req, res){
    res.send("404");
});

var server = app.listen(9000, function(){
   var host = server.address().address;
   var port = server.address().port;

   console.log("server listening on http://%s:%s", host, port);
});