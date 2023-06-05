import {Request, Response} from 'express';
import express from 'express';


const getAllExpense = express.Router();
const addExpense = express.Router();
const Expense = require("../models/expense");

getAllExpense.get("/", async (req, res) => {
  try {
    const exp = await Expense.find();

    const obj = exp;

    res.json(exp);
  } catch (err) {
    res.send(`Error` + err);
  }
});

addExpense.post("/", async (req: Request, res: Response) => {
    console.log(req.body);
    const exp = new Expense({
        product: req.body.product,
        date: req.body.date,
        price: req.body.price,
    });
  
    try {
      const a1 = await exp.save();
      res.json(a1);
    } catch (error) {
      res.send("Error");
    }
  });

exports = {
  getAllExpense,
  addExpense
};


