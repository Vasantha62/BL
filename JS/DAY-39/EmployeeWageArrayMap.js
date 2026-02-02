

const IS_PART_TIME = 1;
const IS_FULL_TIME = 2;
const PART_TIME_HOURS = 4;
const FULL_TIME_HOURS = 8;
const WAGE_PER_HOUR = 20;
const MAX_WORKING_DAYS = 20;

let dailyWageArray = [];
let dayWageMap = new Map();

let totalWage = 0;

// Generate Daily Wages
for (let day = 1; day <= MAX_WORKING_DAYS; day++) {
    let empType = Math.floor(Math.random() * 3);
    let empHrs = 0;

    switch (empType) {
        case IS_FULL_TIME:
            empHrs = FULL_TIME_HOURS;
            break;
        case IS_PART_TIME:
            empHrs = PART_TIME_HOURS;
            break;
        default:
            empHrs = 0;
    }

    let dailyWage = empHrs * WAGE_PER_HOUR;
    totalWage += dailyWage;

    dailyWageArray.push(dailyWage);
    dayWageMap.set(day, dailyWage);
}

console.log("Daily Wage Array:", dailyWageArray);
console.log("Total Wage:", totalWage);

console.log("--------------------------------------------------");

// a. Calculate total wage using reduce
let totalWageUsingReduce = dailyWageArray.reduce((sum, wage) => sum + wage, 0);
console.log("Total Wage using reduce:", totalWageUsingReduce);

// b. Show Day along with Daily Wage using map
let dayWithWage = dailyWageArray.map(
    (wage, index) => `Day ${index + 1} = ${wage}`
);
console.log("\nDay with Daily Wage:");
console.log(dayWithWage);

// c. Show days when Full Time wage (160) was earned using filter
let fullTimeWageDays = dayWithWage.filter(wage => wage.includes("160"));
console.log("\nDays with Full Time Wage (160):");
console.log(fullTimeWageDays);

// d. Find first occurrence of Full Time Wage using find
let firstFullTimeDay = dayWithWage.find(wage => wage.includes("160"));
console.log("\nFirst Day Full Time Wage Earned:");
console.log(firstFullTimeDay);

// e. Check if every element is Full Time Wage
let isEveryFullTime = dailyWageArray.every(wage => wage === 160);
console.log("\nIs every day Full Time Wage?", isEveryFullTime);

// f. Check if there is any Part Time Wage
let hasPartTime = dailyWageArray.some(wage => wage === 80);
console.log("Is there any Part Time Wage?", hasPartTime);

// g. Find number of days employee worked
let daysWorked = dailyWageArray.filter(wage => wage > 0).length;
console.log("Number of days employee worked:", daysWorked);

console.log("--------------------------------------------------");

// Map: Store Day wise Wage and compute total wage
let totalWageFromMap = 0;
for (let wage of dayWageMap.values()) {
    totalWageFromMap += wage;
}

console.log("Day-wise Wage using Map:");
console.log(dayWageMap);
console.log("Total Wage computed using Map:", totalWageFromMap);
