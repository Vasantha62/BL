const COUNT = 5;
let min = 999;
let max = 100;

// Generate 5 random 3-digit numbers (100–999)
for (let i = 1; i <= COUNT; i++) {
    let num = Math.floor(Math.random() * 900) + 100;
    console.log("Random Number " + i + ":", num);

    // Update minimum value
    if (num < min) {
        min = num;
    }

    // Update maximum value
    if (num > max) {
        max = num;
    }
}

// Output results
console.log("Minimum Value:", min);
console.log("Maximum Value:", max);
