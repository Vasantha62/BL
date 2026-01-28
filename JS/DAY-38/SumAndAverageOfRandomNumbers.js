let Count = 5 ;
let sum = 0;
// Generate 5 random 2-digit numbers (10–99)
for(let i = 1; i<Count; i++){
    let num = Math.floor(Math.random()*90)+10;
    console.log("Random Number"+i + ":", num);
    sum += num;

}
//calculate Average
let average = sum/Count;
console.log("Average:", average);
console.log("sum:", sum);