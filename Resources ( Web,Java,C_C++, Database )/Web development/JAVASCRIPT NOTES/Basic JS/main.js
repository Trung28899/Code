// writing on console: dev tool > console
// use console for debugging
//console.log("Hello World"); 
//console.error("this is an error");

// I. Variables
// how to assign variable
// use let or var to declare and assign a variable
// if you use const, the var cant be changed
let age = 30; 
age = 31; 
var newAge = 32; 
newAge = 33; 
const myAge = 34; 
//myAge = 35; 
console.log(age); // see on consoloe 31
console.log(newAge); // see 32 on console
console.log(myAge); // see error on console if myAge=35

// II. Data Types: 
// String, Numbers, Boolean, null, undefined
const name= 'John'; // can use either single or double quote
const agee= 30; 
const isCool = true; 
const rating = 4.5; 
const x = null; 
const m = undefined; 
let z; // same as const z = undefined; 

console.log(typeof name); 
// STRING CONCATENATION: 
console.log('My name is ' + name + 'and I am ' + age);
const s = "Hello world"; 
console.log(s.length);  // get the length of the string
console.log(s.toUpperCase()); // Transfer to all uppercase
console.log(s.substring(0,5).toUpperCase()); // get substring in the whole string
console.log(s.split('')); 

// example of using split function:
// getting substrings that are seperated by comma 
const y = 'technology, computers, it, code'; 
console.log(y.split(',')); 

// III. Arrays: variables that hold multiple values
// In JS an array can store multiple data type
const numbers = new Array(1,2,3,4,5);
const fruits = ['apples', 'oranges', 'pear']; 
fruits[3]= 'grapes'; // watch video minute 27 - 28 if have concerns
fruits.push('mangos'); 
fruits.unshift("Berry"); 
fruits.pop(); // remove the last index of the array

console.log(numbers); 
console.log(fruits);
console.log(fruits[2]); // oranges
console.log(Array.isArray(fruits)); // output: true
console.log(fruits.indexOf('oranges')); // output: 2

// IV. Object: 
const person ={
	firstName: 'John', 
	lastName: 'Doe', 
	age: 30, 
	hobbies: ['music', 'movies', 'sport'], 
	address:{
		street: '50 main st', 
		city: 'Boston', 
		state: 'MA'
	}
}

console.log(person.firstName, person.lastName); 
console.log(person.hobbies[1]); //output: movies
console.log(person.address.city); // output: boston

const{firstName, lastName, address: { city }} = person; 
// dont understand ?? watch minute 33:00
// this is called destructuring
console.log(firstName); // output: John
console.log(city);  // output: Boston

// Adding properties
person.email='John@gmail.com'; 
console.log(person.email); 

// ARRAY OBJECT: 
const todos = [
	{
		id: 1, 
		text: 'Take out trash', 
		isCompleted: true
	}, 
	
	{
		id: 2, 
		text: 'Meeting with boss', 
		isCompleted: true
	}, 
	
	{
		id: 3, 
		text: 'dentist appointment', 
		isCompleted: false
	}, 
]; 

console.log(todos[1].text + " --BEFORE FOREACH--"); 
// MISS THE JSON PART MINUTE 36:00: BASICALLY JUST INTRODUCTION

// V. Loops and Conditional statements: same as Java and C
// a. For Loop, While Loop and Conditional statement: same as Java and C
x1 = 20; 
if(x1 === 10)
{
	console.log('x1 is 10');
} else if(x1 < 10)
{
	console.log('x1 < 10'); 
} else if(x1 > 10)
{
	console.log('x1 > 10'); 
}

// b. forEach: get the specific field of all the objects in an array object
console.log("\nFOREACH\n");
todos.forEach(function(variable){
	console.log(variable.text); 
}); 

console.log("\nMAPS\n");
// c. Maps: get the specific field of all the objects in an array object
// Maps work somewhat like forEach
const todoText = todos.map(function(varr){
	return varr.text; 
});

console.log(todoText); 

console.log("\nFilter\n");
// d.Filter: Filter out the whole objects that have isCompleted==true
const todoCompleted = todos.filter(function(var1){
	return var1.isCompleted===true; 
}); 

console.log(todoCompleted); 

//VI. Function: 
function addNums(num1, num2){
	return num1+num2; 
}
console.log('Using AddNums Function: '+addNums(3,5)); 

// Constructor Function
function Person(firstName, lastName, dob)
{
	this.firstName = firstName; 
	this.lastName = lastName; 
	this.dob=dob; 
}
// Instantiate object
const person1 = new Person('Trung','Trinh', '28-8-1999');
console.log(person1); 
console.log(person1.dob); 

// VII.Class: 
class Person1{
	constructor(firstName, lastName, dob){
		this.firstName = firstName; 
		this.lastName = lastName; 
		this.dob = new Date(dob); 
	}
	
	getBirthYear(){
		return this.dob.getFullYear(); 
	}
	
	getFullName(){
		return this.firstName+this.lastName; 
	}
}
const personn = new Person1('Dzung', 'Trinh', '10-6-1963');
console.log(personn.getBirthYear()); 

/* --- END OF BASIC OF JS PROGRAMMING, FROM NOW MOVING ON TO 
	DOM MANIPULATION --- */
	
/*
	DOM MANIPULATION
*/

/* show the window object in console,
   Window is the parent object of every
   webpage */
console.log(window); 

// I. HOW TO SELECT THINGS IN DOM: 

// 1. SINGLE ELEMENT SELECTOR: 

// a. could have getElementsByClassName, getElementsByTagName
const form = document.getElementById('my-form');

// b. querySelector like jQuery, grab anything and display
// the first thing it found
const form1 = document.querySelector('h1'); 
console.log(form); 
console.log(form1); 

// 2. MULTIPLE ELEMENT SELECTOR: 
// grab an array of objects that has same class
console.log(document.querySelectorAll('.item')); 

// II. MANIPULATING THINGS IN DOM:
// 1. Common Manipulations:  
const ul = document.querySelector('.items');
// ul.remove();  
// ul.lastElementChild.remove(); 
/*
ul.firstElementChild.textContent = 'Hello'; 
ul.children[1].innerText = 'Trung'; 
ul.lastElementChild.innerHTML = '<h1>Hello</h1>'; 

const btn = document.querySelector('.btn'); 
btn.style.background = 'red'; 
*/

// 2. Events:
const btn1 = document.querySelector('.btn'); 
// Can lookup the different events
/*
btn1.addEventListener('click', (e) => {
	// making the output stays on console
	e.preventDefault(); 
	console.log('Button Clicked'); 
	//console.log(e.target.className); 
	document.querySelector('#my-form')
	.style.background = '#ccc'; 
	// bg-dark is the class could be found in css
	// document.querySelector('body').classList.add('bg-dark'); 
	document.querySelector('.items').lastElementChild
	.innerHTML = '<h1>Hello</h1>'; 
}); 
*/

// 3. Example of this current page for DOM Mani:
const myForm = document.querySelector('#my-form'); 
const nameInput = document.querySelector('#name'); 
const emailInput = document.querySelector('#email'); 
const msg = document.querySelector('.msg');
const userList = document.querySelector('#users'); 

myForm.addEventListener('submit', onSubmit);
function onSubmit(e){
	e.preventDefault(); 
	
	if(nameInput.value === '' || emailInput.value === ''){
		// error class could be found in css
		msg.classList.add('error'); 
		msg.innerHTML = 'Please Enter Fields'; 
		
		// error message disapper in 3 seconds
		setTimeout(() => msg.remove(), 3000); 
	} else {
		const li = document.createElement('li');
		li.appendChild(document.createTextNode(nameInput.value+' : '+emailInput.value));
		
		userList.appendChild(li); 
		
		// Clear Fields: 
		nameInput.value = ''; 
		emailInput.value = '';
	}
}

