const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Think of a number between 1 and 100.");

let low = 1;
let high = 100;

function guess() {
    let mid = Math.floor((low + high) / 2);
    rl.question(`Is your number ${mid}? (yes/no) `, (answer) => {
        answer = answer.toLowerCase();
        if (answer === "yes") {
            console.log(`Yay! The magic number is ${mid}.`);
            rl.close();
        } else {
            rl.question(`Is your number greater than ${mid}? (yes/no) `, (ans) => {
                ans = ans.toLowerCase();
                if (ans === "yes") {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                guess(); // repeat
            });
        }
    });
}

guess();
