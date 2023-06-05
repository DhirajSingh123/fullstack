const mongosse = require("mongoose");

const url = "mongodb://localhost/expense-service";
mongosse.connect(url, { useNewUrlParser: true });

const con=mongosse.connection

con.on('open',function(){
    console.log("data base coneected successfully");
})


//here we are importing controller class
const { app } = require("./controller/appcontreller");

//Note
//app.use(bodyparser.json());


app.listen(9000, () => {
    console.log("server started at 9000 port");
  });
