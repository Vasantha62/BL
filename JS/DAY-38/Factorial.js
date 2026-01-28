

// Step 1: Read the number from command-line arguments
const n = parseInt(process.argv[2]);

// Step 2: Validate input
// Factorial is defined only for non-negative integers
if (isNaN(n) || n < 0) {
    console.log("Please enter a valid non-negative integer");
    process.exit(1);
}

// Step 3: Initialize factorial result
let factorial = 1;

// Step 4: Use a loop to calculate factorial
// Multiply numbers from 1 to n
for (let i = 1; i <= n; i++) {
    factorial = factorial * i;
}


console.log(`${n}! = ${factorial}`);
