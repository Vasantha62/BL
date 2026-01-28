let headCount = 0 ; 
let tailCount = 0;

while(headCount<11 && tailCount<11){
    let flip = Math.floor(Math.random()*2);

    if(flip==0){
        tailCount++;
        console.log("Tails");

    
    }else{
        headCount++;
        console.log("Heads");
    }
}
console.log("Final Score:");
console.log("heads:" ,  headCount);
console.log("tails:", tailCount);

if(headCount == 11){
    console.log("heads win!");
}else{
    console.log("Tails win!")
}

