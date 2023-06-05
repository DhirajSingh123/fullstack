//for Loop Example

function forLooExample() {
  for (i = 0; i <= 5; i++) {
    console.log("This is for loop" + i);
  }
}

forLooExample();

//for in Loop Example

const person={fname:"Dhiraj",lname:"Singh",age:"27"}

for(let x in person){
    console.log("This for In loop example "+person[x])
}


// for each example

const a = ["a", "b", "c"];
a.forEach((element) => {
    console.log(element);
});
