function isPalindrome(num) {
    let original = num;
    let reverse = 0;

    while (num > 0) {
        let digit = num % 10;
        reverse = reverse * 10 + digit;
        num = Math.floor(num / 10);
    }

    return original === reverse;
}

// Test numbers
let num1 = 121;
let num2 = 121;

if (isPalindrome(num1) && isPalindrome(num2)) {
    console.log("Both numbers are Palindromes");
} else {
    console.log("Both numbers are NOT Palindromes");
}
