
// Length Unit Conversion using Node.js

const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Choose Conversion:");
console.log("1. Feet to Inch");
console.log("2. Feet to Meter");
console.log("3. Inch to Feet");
console.log("4. Meter to Feet");

rl.question("Enter your choice: ", (choice) => {
    rl.question("Enter the value to convert: ", (value) => {
        choice = parseInt(choice);
        value = parseFloat(value);
        let result;

        switch (choice) {
            case 1:
                result = value * 12;
                console.log(`${value} Feet = ${result} Inches`);
                break;

            case 2:
                result = value * 0.3048;
                console.log(`${value} Feet = ${result} Meters`);
                break;

            case 3:
                result = value / 12;
                console.log(`${value} Inches = ${result} Feet`);
                break;

            case 4:
                result = value * 3.28084;
                console.log(`${value} Meters = ${result} Feet`);
                break;

            default:
                console.log("Invalid Choice");
        }

        rl.close();
    });
});
