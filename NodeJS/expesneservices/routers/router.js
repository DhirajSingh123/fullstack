const express = require("express");
const router = express.Router();
const Alien = require("../model/alien");

router.get("/", async (req, res) => {
  try {
    const aliens = await Alien.find();
    res.json(aliens);
  } catch {
    res.send(" Error " + err);
  }
  console.log("get request hello bhai");
  res.send("get request for postman");
});

router.post("/", async (req, res) => {
   
      const alien = new Alien({
        name: req.body.name,
        tech: req.body.tech,
        sub: req.body.sub
      })
      try {
        const a1= await alien.save()
        res.json(a1)

      }
     catch(err) {
      res.send(" Error " + err);
    }
    console.log("get request hello bhai");
    res.send("get request for postman");
  })

module.exports = router;
