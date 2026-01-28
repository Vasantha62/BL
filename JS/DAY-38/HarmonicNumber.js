

const n = parseInt(process.argv[2]);

if (isNaN(n) || n <= 0) {
    console.log("Please provide a valid positive integer n");
    process.exit(1);
}

let harmonic = 0;

for (let i = 1; i <= n; i++) {
    harmonic += 1 / i;
}

console.log(`Harmonic Number H_${n} = ${harmonic}`);
