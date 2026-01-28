// Read year from command line
const year = parseInt(process.argv[2]);

// Input validation
if (isNaN(year) || year < 1000 || year > 9999) {
    console.log(" Please enter a valid 4-digit year");
    process.exit(1);
}

// Leap year logic
let isLeap = false;

if ((year % 4 === 0 && year % 100 !== 0) || (year % 400 === 0)) {
    isLeap = true;
}

// Output result
if (isLeap) {
    console.log(year + " is a Leap Year");
} else {
    console.log(year + " is not a Leap Year");
}
