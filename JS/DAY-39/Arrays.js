// ALL-IN-ONE ARRAY PROGRAM IN JAVASCRIPT

// 1. Create an array
let numbers = [10, 20 , 30 , 40 , 50];
console.log("intial Arrays:" , numbers);
// 2. Access elements
console.log("The first element is:" ,numbers[0]);
console.log("The third element is :" , numbers[2]);
// 3. Modify element
numbers[1] = 25;
console.log("After Modifications:", numbers);
//4.Array Length
console.log("Array length is:", numbers.length);
// 5. Loop using for loop
console.log("\nUsing for loop:");
for (let i = 0; i < numbers.length; i++) {
    console.log(numbers[i]);
}

// 6. Loop using for...of
console.log("\nUsing for...of loop:");
for (let num of numbers) {
    console.log(num);
}

// 7. Array methods
numbers.push(60);           // add at end
console.log("\nAfter push:", numbers);

numbers.pop();              // remove last
console.log("After pop:", numbers);

numbers.unshift(5);         // add at start
console.log("After unshift:", numbers);

numbers.shift();            // remove first
console.log("After shift:", numbers);

// 8. Sum of array elements
let sum = 0;
for (let num of numbers) {
    sum += num;
}
console.log("\nSum of elements:", sum);

// 9. Find maximum value
let max = numbers[0];
for (let i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
console.log("Maximum value:", max);

// 10. Array of strings
let fruits = ["Apple", "Banana", "Mango"];
console.log("\nFruits array:");
for (let fruit of fruits) {
    console.log(fruit);
}