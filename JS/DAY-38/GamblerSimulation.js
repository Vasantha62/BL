let money = 100;      // Initial amount
let goal = 200;       // Target amount
let bet = 1;

let bets = 0;
let wins = 0;

while (money > 0 && money < goal) {
    bets++;

    // Random win or loss (0 = lose, 1 = win)
    let result = Math.floor(Math.random() * 2);

    if (result === 1) {
        money += bet;
        wins++;
    } else {
        money -= bet;
    }
}

console.log("Final Money:", money);
console.log("Total Bets Made:", bets);
console.log("Total Wins:", wins);

if (money === goal) {
    console.log("Gambler reached the goal of Rs 200 ");
} else {
    console.log("Gambler went broke ");
}
