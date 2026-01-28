// Read number from command line
const num = parseInt(process.argv[2]);

// a. Function to check if number is Prime
function isPrime(n) {
    if (n <= 1) return false;

    for (let i = 2; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            return false;
        }
    }
    return true;
}

// b. Function to get Palindrome of a number
function getPalindrome(n) {
    let reverse = 0;
    let temp = n;

    while (temp > 0) {
        let digit = temp % 10;
        reverse = reverse * 10 + digit;
        temp = Math.floor(temp / 10);
    }
    return reverse;
}

// Input validation
if (isNaN(num) || num <= 0) {
    console.log("Please enter a valid positive number");
    process.exit(1);
}

// c. Check conditions
if (isPrime(num)) {
    console.log(num + " is a Prime Number");

    let palindrome = getPalindrome(num);
    console.log("Palindrome of the number is:", palindrome);

    if (isPrime(palindrome)) {
        console.log("Palindrome is also a Prime Number");
    } else {
        console.log("Palindrome is NOT a Prime Number");
    }
} else {
    console.log(num + " is NOT a Prime Number");
}
