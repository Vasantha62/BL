let N = 60;
let n = N;
console.log(`Prime factors of ${N}:`);

while (n % 2 === 0) {
    process.stdout.write("2 ");
    n = n / 2;
}

for (let i = 3; i * i <= n; i += 2) {
    while (n % i === 0) {
        process.stdout.write(i + " ");
        n = n / i;
    }
}

if (n > 2) {
    process.stdout.write(n.toString());
}

console.log();
