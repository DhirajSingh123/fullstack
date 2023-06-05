"use strict";
exports.__esModule = true;
var express_1 = require("express");
var app = (0, express_1["default"])();
app.get("/", function (req, res) {
    res.send("hello ankit");
});
app.listen(9000, function () {
    console.log("server started at 9000 port");
});
