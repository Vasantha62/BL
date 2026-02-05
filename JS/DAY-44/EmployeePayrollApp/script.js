console.log(" script.js loaded");

let employeeList = JSON.parse(localStorage.getItem("employees")) || [];

document.addEventListener("DOMContentLoaded", () => {
    console.log(" DOM Loaded");

    const salary = document.getElementById("salary");
    const salaryValue = document.getElementById("salaryValue");

    salaryValue.textContent = salary.value;

    salary.addEventListener("input", () => {
        salaryValue.textContent = salary.value;
    });

    document.getElementById("saveBtn")
        .addEventListener("click", saveEmployee);

    
    document.getElementById("resetBtn")
        .addEventListener("click", resetForm);

    displayEmployees();
});

function saveEmployee() {
    let name = document.getElementById("name").value.trim();
    let startDate = document.getElementById("startDate").value;

    document.getElementById("nameError").textContent = "";
    document.getElementById("dateError").textContent = "";

    if (name === "") {
        document.getElementById("nameError").textContent = "Name required";
        return;
    }

    if (startDate === "") {
        document.getElementById("dateError").textContent = "Date required";
        return;
    }

    let gender =
        document.querySelector('input[name="gender"]:checked')?.value || "-";

    let departments = [];
    document.querySelectorAll('input[type="checkbox"]:checked')
        .forEach(d => departments.push(d.value));

    let profile =
        document.querySelector('input[name="profile"]:checked')?.value || "";

    let employee = {
        profile,
        name,
        gender,
        departments: departments.join(", "),
        salary: document.getElementById("salary").value,
        startDate,
        notes: document.getElementById("notes").value
    };

    employeeList.push(employee);

    localStorage.setItem("employees", JSON.stringify(employeeList));

    console.log(" Employee Saved:", employee);
    console.table(employeeList);

    displayEmployees();
}

function resetForm() {
    document.getElementById("empForm").reset();

    document.getElementById("nameError").textContent = "";
    document.getElementById("dateError").textContent = "";

    const salary = document.getElementById("salary");
    const salaryValue = document.getElementById("salaryValue");
    salaryValue.textContent = salary.value;
   

    console.log(" Form reset");
}

function displayEmployees() {
    const table = document.getElementById("empTable");
    table.innerHTML = "";

    employeeList.forEach(emp => {
        let row = `
            <tr>
                <td>${emp.profile ? `<img src="${emp.profile}">` : "-"}</td>
                <td>${emp.name}</td>
                <td>${emp.gender}</td>
                <td>${emp.departments}</td>
                <td>₹${emp.salary}</td>
                <td>${emp.startDate}</td>
                <td>${emp.notes}</td>
            </tr>
        `;
        table.innerHTML += row;
    });
}
