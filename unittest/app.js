const express = require('express');
const port=8080;
const app = express();
// app.get('/',(req,resp)=>{
//     resp.send("hello")
// })

app.use('user',require('./routes/user'))

app.listen(port,()=>{
    console.log("App is startted ad 8080 port"); 
})