import express from "express";
const log =require('./controllers/test')

import userRoutes from "./routes/userR";

const app = express();

app.use("/user", userRoutes);


app.listen(process.env.PORT||3005,log("listing at port 3005"));
