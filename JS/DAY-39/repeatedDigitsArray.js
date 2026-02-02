

let repeatedDigits = [];

for (let i = 0; i <= 100; i++) {
    // Convert number to string
    let numStr = i.toString();

    // Check for two-digit numbers with same digits
    if (numStr.length === 2 && numStr[0] === numStr[1]) {
        repeatedDigits.push(i);
    }
}

console.log("Numbers with repeated digits:", repeatedDigits);
