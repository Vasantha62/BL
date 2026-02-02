const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter first integer: ", (a) => {
    rl.question("Enter second integer: ", (b) => {
        rl.question("Enter third integer: ", (c) => {

            a = parseInt(a);
            b = parseInt(b);
            c = parseInt(c);

            if (a + b + c === 0) {
                console.log("Sum of three integers is ZERO");
            } else {
                console.log("Sum of three integers is NOT ZERO");
            }

            rl.close();
        });
    });
});
