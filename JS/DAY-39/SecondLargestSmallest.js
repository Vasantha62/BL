// a. Generate 10 random 3-digit numbers
let numbers = [];

for (let i = 0; i < 10; i++) {
    let num = Math.floor(Math.random() * 900) + 100; // 100–999
    numbers.push(num);
}

// b. Store numbers in array
console.log("Generated Numbers:", numbers);

// c. Find 2nd largest and 2nd smallest without sorting
let largest = -Infinity;
let secondLargest = -Infinity;

let smallest = Infinity;
let secondSmallest = Infinity;

for (let i = 0; i < numbers.length; i++) {
    let value = numbers[i];

    // Largest & Second Largest
    if (value > largest) {
        secondLargest = largest;
        largest = value;
    } else if (value > secondLargest && value !== largest) {
        secondLargest = value;
    }

    // Smallest & Second Smallest
    if (value < smallest) {
        secondSmallest = smallest;
        smallest = value;
    } else if (value < secondSmallest && value !== smallest) {
        secondSmallest = value;
    }
}

// Output results
console.log("2nd Largest Number:", secondLargest);
console.log("2nd Smallest Number:", secondSmallest);

