import express from "express";
// const express =require('express')
//const userController =require('../controllers/userC')
import { registerUser } from "../controllers/userC";
const router = express.Router();

router.post("/register", registerUser);

export default router;
