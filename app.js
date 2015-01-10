/**
 * Created by joseph on 1/9/15.
 */

var express = require('express');
var app = express();

app.use(express.static(__dirname + '/public'));

app.get('/', function(req, res){
    res.send('lelelelelelelle');
});

app.get('/kittens', function(req, res){
    res.sendfile('public/index.html');
});

var server = app.listen(9000, function(){
   var host = server.address().address;
   var port = server.address().port;

   console.log("server listening on http://%s:%s", host, port);
});