

const Contact = require("./Contact");
try {
    let contact = new Contact(
        "Vasantha",
        
        "Reddy",
        "MG Road",
        "Chennai",
        "Tamilnadu",
        "600001",
        "9876543210",
        "abc.xyz@bridgelabz.co.in"
    );

    console.log("Contact validated successfully");
} catch (error) {
    console.error("Validation Error:", error.message);
}

// Invalid Contact Test
try {
    new Contact(
        "vas",
        "r",
        "St",
        "Che",
        "TN",
        "060001",
        "12345",
        "abc@gmail"
    );
} catch (error) {
    console.error("Validation Error:", error.message);
}

