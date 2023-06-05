const express = require('express');
const router = express.Router();
const userCtrl = require("../controller/userCntrl");
router.get('/', userCtrl.userList);
module.exports = router;
