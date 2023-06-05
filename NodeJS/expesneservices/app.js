const express = require("express");
const mongoose = require("mongoose");
const url = "mongodb://localhost/ExpenseDB";

const app = express();

mongoose.connect(url, { useNewUrlParser: true });

const con = mongoose.connection;

con.on("open", function () {
  console.log("connected....");
});

app.use(express.json());

const aliensRouter = require("./routers/router");
app.use("/aliens", aliensRouter);

app.listen(9000, function () {
  console.log("server started");
});
 