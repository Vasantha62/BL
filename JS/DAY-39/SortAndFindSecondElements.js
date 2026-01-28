// a. Generate 10 random 3-digit numbers
let numbers = [];

for (let i = 0; i < 10; i++) {
    let num = Math.floor(Math.random() * 900) + 100; // 100–999
    numbers.push(num);
}

// b. Display original array
console.log("Original Array:", numbers);

// c. Sort the array
numbers.sort((a, b) => a - b);
console.log("Sorted Array:", numbers);

// d. Find 2nd smallest and 2nd largest
let secondSmallest = numbers[1];
let secondLargest = numbers[numbers.length - 2];

// Output results
console.log("2nd Smallest Number:", secondSmallest);
console.log("2nd Largest Number:", secondLargest);
