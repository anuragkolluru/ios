import UIKit

var greeting = "Hello, playground"

print("Hi", 10, 12.25) // comma separated gives a space in the output

//String interpolation
//  \(variable name)
var name =  "Anurag"
var grade = 89.92
//Hello, Anurag!
print("Hello , \(name)")
//Hello, Anurag! your grade is 89.2
print("Hello, \(name) your grade is \(grade)")

var proLan = "Swift";
print("I like the \(proLan) programming language")
var age = 23
print("You are \(age) years old and in another \(age) years, you will be \(age * 2)")
// \r carriage return
print ("Hello All,\r Welcome to Swift programming")

print("Welcome to Swift Programming")
print("Fall 2021")
print("*************")
print("Welcome to Sfift programming", terminator: ":-")
print("spring 2022")

//separator
print("The list of numbers are ", terminator: "---")
print(1,2,3,4,5,6)
print("The new pattern is", terminator: ":-")
print(1,2,3,4,5,6, separator: "-")

// Worksheet 2 on constants and variables.
let pi = 3.14
print(pi)

var years : Int = 2
years = 2 * 2
print(years)

var Anurag = 23
print("Kolluru")
print(Anurag)

var course1 = "mobile computing"
var course2 = "pattterns and frameworks"
print(course1, "---" ,course2)

print( "2,4,3.6")

var person = (age: 23 , height: 5.8)
print(person)
print(person.age, terminator: "and" )
print(person.1)
