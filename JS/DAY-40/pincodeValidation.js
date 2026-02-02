

const pincodeRegex = /^[1-9][0-9]{2}\s?[0-9]{3}$/;

let testPins = [
    "400088",   // valid
    "400 088",  // valid
    "A400088",  // invalid
    "@400088",  // invalid
    "0400088",  // invalid
    "40008",    // invalid
];

testPins.forEach(pin => {
    console.log(`${pin} -> ${pincodeRegex.test(pin)}`);
});
