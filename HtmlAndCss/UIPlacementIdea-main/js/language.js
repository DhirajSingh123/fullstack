
loadData();
function loadData() {
  console.log("sdkfgdhsjasjkgsaj")
  const lang = findGetParameter("lang");
  console.log(lang);
  axios
    .get("http://localhost:9000/language/" + lang)
    .then((res) => {
      console.log(res);
      const header1elm=document.getElementById("header1");
      const box1=document.getElementById("div2");
      const box2=document.getElementById("div3");
      const box3=document.getElementById("div4");

      header1elm.innerText="Welcome to "+res.data[0].subjectTopic;
      // box2.innerText="Welcome to "+res.data[0].teacher;
      // header1elm.innerText="Welcome to "+res.data[0].subjectTopic;
      //Note:""
    //  console.log(res.data);
    })
    .catch((error) => {
      console.log(error);
    });
}

function findGetParameter(parameterName) {
  var result = null,
    tmp = [];
  location.search
    .substr(1)
    .split("&")
    .forEach(function (item) {
      tmp = item.split("=");
      if (tmp[0] === parameterName) result = decodeURIComponent(tmp[1]);
    });
  return result;
}