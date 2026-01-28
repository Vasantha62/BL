// Read inputs from command line
const day = parseInt(process.argv[2]);
const month = process.argv[3];

// Validate inputs
if (isNaN(day) || !month) {
    console.log("Usage: node DayMonthRangeCheck.js <day> <month>");
    process.exit(1);
}

const m = month.toLowerCase();
let isInRange = false;

// Check date range: March 20 to June 20
if (
    (m === "march" && day >= 20 && day <= 31) ||
    (m === "april" && day >= 1 && day <= 30) ||
    (m === "may" && day >= 1 && day <= 31) ||
    (m === "june" && day >= 1 && day <= 20)
) {
    isInRange = true;
}


console.log(isInRange);
