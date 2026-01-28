


const n = parseInt(process.argv[2]);

if (isNaN(n) || n < 0) {
    console.log("Please provide a valid non-negative integer n");
    process.exit(1);
}

let power = 1;

for (let i = 0; i <= n; i++) {
    console.log(`2^${i} = ${power}`);
    power = power * 2;
}
