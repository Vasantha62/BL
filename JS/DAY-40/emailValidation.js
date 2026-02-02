

const emailRegex = /^[a-z]{3}([._+-][a-z]+)?@bridgelabz\.co(\.[a-z]{2})?$/;

let testEmails = [
    "abc@bridgelabz.co",
    "abc.xyz@bridgelabz.co",
    "abc.xyz@bridgelabz.co.in",
    "abc-xyz@bridgelabz.co.in",
    "abc+xyz@bridgelabz.co",
    "ab@bridgelabz.co",          // invalid
    "abc@bridgelabzcom",         // invalid
    "abc@bridgelabz.co.ind",     // invalid
    "abc@google.co.in",          // invalid
];

testEmails.forEach(email => {
    console.log(`${email} -> ${emailRegex.test(email)}`);
});
