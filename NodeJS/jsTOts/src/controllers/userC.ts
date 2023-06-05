import { addUserToDB } from "../models/userM";
// import {Request, Response} from 'express';
// const {Request, Response} =require('express')

const registerUser = (req:any, res:any) => {
  const userName = "Dhiraj";
  const passowrd = "Singh";

  const result=addUserToDB(userName, passowrd);

  res.send(result);
};

export { registerUser };
