// DSL Example
//
//List <String> dep= ["mech", "cse"]
//dep.with {
//    add "eee"
//}
//dep.add("ece")
//println dep;
//
//
//5.times {print"Hello"}




//Dsl Using Map

// hey show the squarerroot 0f 625  // at first - .MissingPropertyException
//def show = {println it}  //Closure
//def cube = {it*it*it}
//def squarerroot = {Math.sqrt(it)}
//def hey(action)   //what - squarerroot  , action - what
//{
//    [the:{what ->
//    [of:{number -> action(what(number))}]}]
//}
//hey show the squarerroot of 625
// hey show the cube of 25

// In java
//class Dsldemo {
//    static show(number) {
//        println number
//    }
//
//    static double squareroot(number) {
//        Math.sqrt(number)
//    }
//
//    static int cube(number) {
//        number * number * number
//    }
//
//    static def hey(actionMethod) {
//        return [
//                the: { operationMethod ->
//                    return [
//                            of: { number -> actionMethod(operationMethod(number)) }
//                    ]
//                }
//        ]
//    }
//
//    static void main(String[] args) {
//        // Use method references with the class name, not 'this'
//        hey(Dsldemo.&show).the(Dsldemo.&squareroot).of(49)
//        hey(Dsldemo.&show).the(Dsldemo.&cube).of(5)
//    }
//}




//// Want to display name : " " , age :
//class Student
//{
//    String name;
//    int age;
//    def name(String name)
//    {
//        this.name = name
//    }
//    def age (int age)
//    {
//        this.age = age;
//    }
//    String toString()
//    {
//        "Name: $name Age: $age"
//    }
//}
//
////Used for Connecting Class and Closure
//def Student(Closure c)
//{
//    def obj = new Student()
//    c.delegate= obj;
//    c()
//    println obj
//}
//
//Student{
//    name  "Vignesh"  //Method : parameter
//    age  21
//}


 def students = [[name: "bala"],[name: "krishan"],[name: "arun"]]
 println students
 println students.name
 println students*.name //this is a spread operator
