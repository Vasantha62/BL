

// a. Create a dictionary (object) to store die roll counts
let dieResult = {
    1: 0,
    2: 0,
    3: 0,
    4: 0,
    5: 0,
    6: 0
};

// b, c, d. Roll the die until any number reaches 10 times
while (true) {
    // Roll die (1 to 6)
    let roll = Math.floor(Math.random() * 6) + 1;

    // Store result in dictionary
    dieResult[roll]++;

    // Check if any number reached 10 times
    if (dieResult[roll] === 10) {
        break;
    }
}

// Print die roll counts
console.log("Die Roll Results:", dieResult);

// e. Find maximum and minimum occurred numbers
let maxCount = 0;
let minCount = Infinity;
let maxNumber, minNumber;

for (let number in dieResult) {
    if (dieResult[number] > maxCount) {
        maxCount = dieResult[number];
        maxNumber = number;
    }

    if (dieResult[number] < minCount) {
        minCount = dieResult[number];
        minNumber = number;
    }
}

console.log(`Number reached maximum times: ${maxNumber} (${maxCount} times)`);
console.log(`Number reached minimum times: ${minNumber} (${minCount} times)`);
