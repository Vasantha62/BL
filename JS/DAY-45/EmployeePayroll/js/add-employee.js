document.getElementById("employeeForm")
    .addEventListener("submit", saveEmployee);

function saveEmployee(event) {
    event.preventDefault();

    let name = document.getElementById("name").value;
    let gender =
        document.querySelector('input[name="gender"]:checked').value;

    let departments = [];
    document.querySelectorAll(
        'input[type="checkbox"]:checked'
    ).forEach(dep => departments.push(dep.value));

    let salary = document.getElementById("salary").value;
    let startDate = document.getElementById("startDate").value;

    let employee = {
        _name: name,
        _gender: gender,
        _department: departments,
        _salary: salary,
        _startDate: startDate
    };

    let employeeList =
        JSON.parse(localStorage.getItem("EmployeePayrollData")) || [];

    employeeList.push(employee);

    localStorage.setItem(
        "EmployeePayrollData",
        JSON.stringify(employeeList)
    );

    window.location.href = "index.html";
}
