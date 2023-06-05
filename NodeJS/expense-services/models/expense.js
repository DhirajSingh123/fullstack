const mongoose = require("mongoose");

const expenseSchema = new mongoose.Schema({
  product: {
    type: String,
    required: true,
  },
  date: {
    type: String,
    required: true,
  },
  price: {
    type: String,
    required: true,
  },
});

module.exports = mongoose.model("Expense", expenseSchema);
