

// Step 1: Read command-line arguments
// process.argv[2] -> starting number
// process.argv[3] -> ending number
const start = parseInt(process.argv[2]);
const end = parseInt(process.argv[3]);

// Step 2: Validate input
// Check if inputs are numbers, start is >= 2, and start <= end
if (isNaN(start) || isNaN(end) || start < 2 || start > end) {
    console.log("Usage: node PrimeRange.js <start> <end>");
    console.log("Example: node PrimeRange.js 10 50");
    process.exit(1); // Stop program if input is invalid
}

// Step 3: Function to check if a number is prime
function isPrime(num) {
    // Numbers less than or equal to 1 are not prime
    if (num <= 1) return false;

    // Check divisibility from 2 to square root of the number
    for (let i = 2; i <= Math.sqrt(num); i++) {
        // If number is divisible, it's not prime
        if (num % i === 0) {
            return false;
        }
    }
    // If no divisors found, number is prime
    return true;
}

// Step 4: Loop through the given range
console.log(`Prime numbers between ${start} and ${end}:`);

for (let i = start; i <= end; i++) {
    // Step 5: Print number if it is prime
    if (isPrime(i)) {
        console.log(i);
    }
}
