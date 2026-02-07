

let employeeList = [];

document.addEventListener("DOMContentLoaded", () => {
    employeeList = JSON.parse(localStorage.getItem("EmployeePayrollData")) || [];
    renderTable();
});

function renderTable() {
    document.getElementById("empCount").textContent = `(${employeeList.length})`;

    let tbody = document.getElementById("tableBody");
    tbody.innerHTML = "";

    employeeList.forEach((emp, index) => {
        tbody.innerHTML += `
        <tr>
            <td>${emp._name}</td>
            <td>${emp._gender}</td>
            <td>${emp._department.map(d => `<span>${d}</span>`).join("")}</td>
            <td>₹ ${emp._salary}</td>
            <td>${emp._startDate}</td>
            <td>
                <button onclick="editEmployee(${index})">✏️</button>
                <button onclick="deleteEmployee(${index})">🗑️</button>
            </td>
        </tr>`;
    });
}

function addEmployee() {
    localStorage.removeItem("editIndex");
    location.href = "add-employee.html";
}

function editEmployee(index) {
    localStorage.setItem("editIndex", index);
    location.href = "add-employee.html";
}

function deleteEmployee(index) {
    if (confirm("Delete this employee?")) {
        employeeList.splice(index, 1);
        localStorage.setItem("EmployeePayrollData", JSON.stringify(employeeList));
        renderTable();
    }
}
