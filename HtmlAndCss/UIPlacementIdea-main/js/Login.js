
var email;
var password;

function userLogin(e) {
  let users;

  
  console.log("Hello"+e)
  e.preventDefault();

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

}