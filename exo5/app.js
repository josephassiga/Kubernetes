const http  = require('http');
const os = require('os');

console.log('Kubia server starting ......');
var handler = function(request,response){
  console.log('Receive request from '+ request.connection.remoteAddress);
  response.writeHead(200);
  console.log(request);
  response.end("You have hit : "+ os.hostname()+  "\n");

}

var serverOne = http.createServer(handler);
serverOne.listen(8080);
var serverTwo = http.createServer(handler);
serverTwo.listen(8443);
