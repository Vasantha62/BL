
const FULL_TIME_HOURS = 8;
const PART_TIME_HOURS = 4;
const WAGE_PER_HOUR = 20;
const MAX_WORKING_DAYS = 20;

// ---------- Employee Validation using Regex & Try Catch ----------
class Employee {
    constructor(id, salary, gender, startDate) {
        try {
            if (!/^[1-9][0-9]*$/.test(id)) {
                throw "Employee ID must be a positive non-zero number";
            }
            if (!/^[1-9][0-9]*$/.test(salary)) {
                throw "Salary must be a positive non-zero number";
            }
            if (!/^[MF]$/.test(gender)) {
                throw "Gender must be M or F";
            }
            if (new Date(startDate) > new Date()) {
                throw "Start Date cannot be a future date";
            }

            this.id = id;
            this.salary = salary;
            this.gender = gender;
            this.startDate = new Date(startDate);

        } catch (error) {
            console.error("Validation Error:", error);
        }
    }
}

// Create employee object
let emp = new Employee(1, 30000, "M", "2024-01-10");

// ---------- Wage Computation ----------
let dayWageObject = {};
let totalWage = 0;

for (let day = 1; day <= MAX_WORKING_DAYS; day++) {
    let empType = Math.floor(Math.random() * 3);
    let hours = empType === 2 ? FULL_TIME_HOURS :
                empType === 1 ? PART_TIME_HOURS : 0;

    let dailyWage = hours * WAGE_PER_HOUR;
    dayWageObject[day] = dailyWage;
    totalWage += dailyWage;
}

console.log("\nDay-Wise Wage Object:", dayWageObject);

// a. Calculate total wage using Object.values + reduce
let totalWageCalc = Object.values(dayWageObject)
    .reduce((sum, wage) => sum + wage, 0);

console.log("Total Wage:", totalWageCalc);

// b. Show Day along with Daily Wage using map
let dayWithWage = Object.entries(dayWageObject)
    .map(([day, wage]) => `Day ${day} = ${wage}`);

console.log("\nDay with Daily Wage:");
console.log(dayWithWage);

// c. Show days when Full Time wage (160) was earned
let fullTimeDays = dayWithWage
    .filter(entry => entry.includes("160"));

console.log("\nDays with Full Time Wage (160):");
console.log(fullTimeDays);

// d. Find first occurrence of Full Time Wage
let firstFullTimeDay = dayWithWage
    .find(entry => entry.includes("160"));

console.log("\nFirst Day Full Time Wage Earned:");
console.log(firstFullTimeDay);

// e. Check if every element is Full Time Wage
let allFullTime = Object.values(dayWageObject)
    .every(wage => wage === 160);

console.log("\nIs every day Full Time Wage?", allFullTime);

// f. Check if there is any Part Time Wage
let hasPartTime = Object.values(dayWageObject)
    .some(wage => wage === 80);

console.log("Is there any Part Time Wage?", hasPartTime);

// g. Find number of days employee worked
let daysWorked = Object.values(dayWageObject)
    .filter(wage => wage > 0).length;

console.log("Number of days Employee worked:", daysWorked);
