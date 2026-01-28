const FEET_TO_METER = 0.3048;
const SQMETER_IN_ACRE = 4046.86;

// Plot size in feet
let lengthFt = 60;
let widthFt = 40;

// Convert to meters
let lengthMeter = lengthFt * FEET_TO_METER;
let widthMeter = widthFt * FEET_TO_METER;

// Area calculations
let areaOnePlot = lengthMeter * widthMeter;
let totalArea = areaOnePlot * 25;
let areaInAcres = totalArea / SQMETER_IN_ACRE;

console.log("Area of 25 plots in acres:", areaInAcres);
