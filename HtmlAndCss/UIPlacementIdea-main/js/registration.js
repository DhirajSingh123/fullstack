var userName;
var phoneNo;
var password;
var email;
function addUser(e) {

  console.log("Hello"+e)
  e.preventDefault();
  email =document.getElementById("email").value;
  userName = document.getElementById("userName").value;
  phoneNo = document.getElementById("phoneNo").value;
  password = document.getElementById("password").value;

 
  console.log({ userName, phoneNo, password });

  axios
    .post("http://localhost:9000/addUser", {
      userName: userName,
      email:email,
      mobileNo: phoneNo,
      password: password,
    })
    .then((response) => {
      console.log(response.data);
    })
    .catch((err) => {
      console.log(err);
    });
    alertAction();
   
}


function alertAction(){
  console.log("%%%%%%%%%%%"+userName)
  if (confirm("Congratulation! Are you want to login?")) {
    txt = "You pressed OK!";
    email = document.getElementById("email").value;
  password = document.getElementById("password").value;

  axios
    .post("http://localhost:9000/login", {
      email: email,
      password: password,
    })
    .then((response) => {
      
      if(response.data!="No User Found"){
          window.location.href='home.html';
      }
      
    })
    .catch((err) => {
      console.log(err);
    });
  
  } else {
    txt = "You pressed Cancel!";
    url= '../html/signup.html'
    window.location.href = url;
  }
}


// var email;
// var password;

// function userLogin(e) {
//   let users;

  
//   console.log("Hello"+e)
//   e.preventDefault();

//   email = document.getElementById("email").value;
//   password = document.getElementById("password").value;

//   axios
//     .post("http://localhost:9000/login", {
//       email: email,
//       password: password,
//     })
//     .then((response) => {
      
//       if(response.data!="No User Found"){
//           window.location.href='home.html';
//       }
      
//     })
//     .catch((err) => {
//       console.log(err);
//     });

// }


