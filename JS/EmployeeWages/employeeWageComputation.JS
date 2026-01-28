

 // UC 1: Check Employee is Present or Absent
 

// Constants (won't be reassigned)
const IS_ABSENT = 0;
const IS_PRESENT = 1;

// Random check for attendance (0 or 1)
let empAttendance = Math.floor(Math.random() * 10) % 2;

if (empAttendance === IS_ABSENT) {
    console.log("Employee is Absent");
} else {
    console.log("Employee is Present");
}

 // UC 2: Calculate Daily Employee Wage
 // Part Time / Full Time using Switch Statement


// Constants
const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;

const PART_TIME_HOURS = 4;
const FULL_TIME_HOURS = 8;
const WAGE_PER_HOUR = 20;

// Random check: 0 = No Work, 1 = Part Time, 2 = Full Time
let empCheck = Math.floor(Math.random() * 10) % 3;

let empHrs = 0;

switch (empCheck) {
    case IS_PART_TIME:
        empHrs = PART_TIME_HOURS;
        break;

    case IS_FULL_TIME:
        empHrs = FULL_TIME_HOURS;
        break;

    default:
        empHrs = 0;
}

// Daily wage
let dailyWage = empHrs * WAGE_PER_HOUR;
console.log("Daily Employee Wage: $" + dailyWage);


 // UC 3: Refactor – Function to Get Work Hours


function getWorkHours(empCheck) {
    switch (empCheck) {
        case IS_PART_TIME:
            return PART_TIME_HOURS;

        case IS_FULL_TIME:
            return FULL_TIME_HOURS;

        default:
            return 0;
    }
}


 // UC 4: Calculate Wages for a Month (20 Working Days)


const TOTAL_WORKING_DAYS = 20;

let totalEmpHrs = 0;

for (let day = 1; day <= TOTAL_WORKING_DAYS; day++) {
    let empCheck = Math.floor(Math.random() * 10) % 3;
    totalEmpHrs += getWorkHours(empCheck);
}

let monthlyWage = totalEmpHrs * WAGE_PER_HOUR;

console.log("Total Hours in Month: " + totalEmpHrs);
console.log("Monthly Employee Wage: $" + monthlyWage);


 // UC 5: Calculate Wages Till Max Hours (160)
 // or Max Days (20) is Reached
 

const MAX_WORKING_HOURS = 160;
const MAX_WORKING_DAYS = 20;

let totalHours = 0;
let totalDays = 0;

while (totalHours < MAX_WORKING_HOURS && totalDays < MAX_WORKING_DAYS) {
    totalDays++;

    let empCheck = Math.floor(Math.random() * 10) % 3;
    totalHours += getWorkHours(empCheck);
}

let totalWage = totalHours * WAGE_PER_HOUR;

console.log("Total Working Days: " + totalDays);
console.log("Total Working Hours: " + totalHours);
console.log("Total Employee Wage: $" + totalWage);
