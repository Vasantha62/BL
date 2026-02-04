

let employees = [];

function addEmployee() {

    let empId = document.getElementById("empId").value;
    let empName = document.getElementById("empName").value;
    let empSal = document.getElementById("empSal").value;
    let empGender = document.getElementById("empGender").value;

    
    if (!empId || !empName || !empSal || !empGender) {
        alert("Please fill all fields");
        return;
    }

    let employee = {
        id: empId,
        name: empName,
        salary: empSal,
        gender: empGender,
        startDate: new Date().toDateString()
    };

    employees.push(employee);
    displayEmployees();

    
    document.getElementById("empId").value = "";
    document.getElementById("empName").value = "";
    document.getElementById("empSal").value = "";
    document.getElementById("empGender").value = "";
}

function displayEmployees() {

    let tableBody = document.getElementById("empTable");
    tableBody.innerHTML = "";

    employees.forEach(emp => {
        tableBody.innerHTML += `
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.salary}</td>
                <td>${emp.gender}</td>
                <td>${emp.startDate}</td>
            </tr>
        `;
    });
}
