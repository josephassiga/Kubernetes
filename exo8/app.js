const http  = require('http');
const os = require('os');


console.log('Kubia server starting ......');
var handler = function(request,response){
  console.log('Receive request from '+ request.connection.remoteAddress);
  response.writeHead(200);
  response.end("This is v4 running in pod "+ os.hostname()+ "\n");

}

var www = http.createServer(handler);
www.listen(8080);
