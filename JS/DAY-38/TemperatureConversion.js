const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

console.log("Temperature Conversion");
console.log("1. Celsius to Fahrenheit");
console.log("2. Fahrenheit to Celsius");

rl.question("Enter your choice (1 or 2): ", (choice) => {
    rl.question("Enter temperature value: ", (temp) => {
        choice = parseInt(choice);
        temp = parseFloat(temp);

        switch (choice) {
            case 1: // Celsius to Fahrenheit
                if (temp < 0 || temp > 100) {
                    console.log("Temperature must be between 0°C and 100°C");
                } else {
                    let degF = (temp * 9 / 5) + 32;
                    console.log(`${temp}°C = ${degF}°F`);
                }
                break;

            case 2: // Fahrenheit to Celsius
                if (temp < 32 || temp > 212) {
                    console.log("Temperature must be between 32°F and 212°F");
                } else {
                    let degC = (temp - 32) * 5 / 9;
                    console.log(`${temp}°F = ${degC}°C`);
                }
                break;

            default:
                console.log("Invalid selection");
        }

        rl.close();
    });
});
