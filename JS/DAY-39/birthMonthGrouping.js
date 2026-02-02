

// Dictionary to store months and individuals
let birthMonthMap = {};

// Initialize months
for (let month = 1; month <= 12; month++) {
    birthMonthMap[month] = [];
}

// Generate birth months for 50 individuals
for (let i = 1; i <= 50; i++) {
    let month = Math.floor(Math.random() * 12) + 1; // 1 to 12
    let year = Math.random() < 0.5 ? 1992 : 1993;

    birthMonthMap[month].push(`Person${i} (${year})`);
}

// Print individuals grouped by birth month
console.log("Individuals grouped by birth month:\n");

for (let month in birthMonthMap) {
    if (birthMonthMap[month].length > 0) {
        console.log(`Month ${month}:`);
        console.log(birthMonthMap[month].join(", "));
        console.log("----------------------------");
    }
}
