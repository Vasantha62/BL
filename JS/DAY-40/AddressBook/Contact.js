class Contact {
    constructor(firstName, lastName, address, city, state, zip, phone, email) {
        const nameRegex = /^[A-Z][a-z]{2,}$/;
        const addressRegex = /^[A-Za-z ]{4,}$/;
        const zipRegex = /^[1-9][0-9]{5}$/;
        const phoneRegex = /^[6-9][0-9]{9}$/;
        const emailRegex = /^[a-z]{3}([._+-][a-z]+)?@[a-z]+\.co(\.[a-z]{2})?$/;

        if (!nameRegex.test(firstName)) throw new Error("Invalid First Name");
        if (!nameRegex.test(lastName)) throw new Error("Invalid Last Name");
        if (!addressRegex.test(address)) throw new Error("Invalid Address");
        if (!addressRegex.test(city)) throw new Error("Invalid City");
        if (!addressRegex.test(state)) throw new Error("Invalid State");
        if (!zipRegex.test(zip)) throw new Error("Invalid Zip");
        if (!phoneRegex.test(phone)) throw new Error("Invalid Phone");
        if (!emailRegex.test(email)) throw new Error("Invalid Email");

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    // Override toString for console display
    toString() {
        return `${this.firstName} ${this.lastName} | ${this.address}, ${this.city}, ${this.state} | ${this.zip} | ${this.phone} | ${this.email}`;
    }
}

module.exports = Contact;

