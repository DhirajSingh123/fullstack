var name;
var tech;
var sub;
function getData(e) {
  e.preventDefault();

  name = document.getElementById("name").value;
  tech = document.getElementById("tech").value;
  //sub = document.getElementById("sub").value;

  const radioButtons = document.querySelectorAll('input[name="subscriber"]');

  for (const radioButton of radioButtons) {
    console.log(radioButton.checked);
    if (radioButton.checked) {
      sub = radioButton.value;
      if (sub == "yes") {
        sub = true;
      } else {
        sub = false;
      }
      break;
    }
  }

  for (let index = 0; index < radioButtons.length; index++) {
    const element = radioButtons[index];
  }

  console.log({ name, tech, sub });

  axios
    .post("http://localhost:9000/addemployee", {
      name: name,
      tech: tech,
      sub: sub,
    })
    .then((response) => {
      console.log(response.data);
    })
    .catch((err) => {
      console.log(err);
    });
}

function setData() {
  axios
    .get("http://localhost:9000/employees")
    .then((respose) => {
      for (let todo of respose.data) {
        console.log(todo);
      }

      // console.log(respose.data.map(d=>{
      //   return {
      //     id:d.id
      //   }
      // }))
    })
    .catch(console.error);
}
