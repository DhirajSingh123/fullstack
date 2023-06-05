import express from 'express';
const cors = require("cors");
const bodyparser = require("body-parser");
 const app = express();

const employeeRouter = require("../handler/expense_handler");
app.use(cors());
app.use(bodyparser.json());
app.use("/allexpense", employeeRouter.getAllExpense);
app.use("/addexpense", employeeRouter.addExpense);

exports = { app };
