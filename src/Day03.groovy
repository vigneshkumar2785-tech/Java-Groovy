//Groovy Beans

// class student
// {
//   String name;
//   int age;
// }
// void setname()
// {

// }
// void getname()
// {

// }
//Automatically created getter and setter

// def obj = new student();
// println obj.name = "Vignesh"
// println obj.getName()    // prints "Vignesh"
// obj.setName("World")     // change name
// println obj.getName()    // prints "World"



//Annotation

// import groovy.transform.ToString

// @ToString  //Annotation - create ToString Method
// class Emp{
//   String name;
//   int age;
//   // It act like -
//   // String ToString()
//   // {
//   //   return "Emp(${name} , ${age})"   //With and Without that also it will display
//   // }
// }
// def e = new Emp(name:"Vimal",age:21);
// print e;


// import groovy.transform.ToString

// @ToString  //Annotation - create ToString Method
// class Emp{
//   String name;
//   int age;
//   String toString()
//   {
//     return "Hello"          // It was separated and Overrise
//   }
// }
// def e = new Emp(name:"Vimal",age:21);
// print e;


//
//import groovy.transform.EqualsAndHashCode
//
//@EqualsAndHashCode
//class Emp{
//    String name;
//    int age;
//    boolean equals(other)
//    {
//        return (this.name == other.name &&
//                this.age == other.age)                // Without that also it may Run in equals method
//    }                                                  // Can also override it using
//}
//def e = new Emp(name:"Vimal",age:21);
//def f = new Emp(name:"Vimal",age:21);
//print e.equals(f);



//import groovy.transform.TupleConstructor
//
//@TupleConstructor
//class Emp{
//    String name;
//    int age;                    // Can also override it using
//}
//def e = new Emp("Vimal",21);
//def f = new Emp("Vicky",21);
//println e.name  //Automatically display the Names not need to initialize
//println f.name



import groovy.transform.Canonical

import javax.swing.JWindow

/*
@Canonical    // tostring , equals and Hashcode are all combine
class Emp{
    String name;
    int age;
}
def e = new Emp(name:"Vicky",age:21);
def f = new Emp(name:"Vimal",age:21);
println e == f        // false - Because Both String not same
println e.hashCode()   // 581791654
println f.hashCode()   // Address - 582339587
 */
//
//import groovy.transform.Immutable                 //Caught: groovy.lang.ReadOnlyPropertyException: Cannot set read-only property: name for class: Emp
//                                                    // - Exception Throws Because can't Mute (or) Change
//@Immutable
//class Emp{
//    String name = "vimal";
//    int age= 22;
//}
//def e = new Emp(name:"Vicky",age:21);
//println e.name = "Virat";


//Categories - already exists class add the Temporary Method // Not change the Entire class, just used it for the Temporary class
//class StringUtils{
//    static  String shout(String s)
//    {
//        s.toUpperCase();
//    }
//}
//use(StringUtils)
//        {
//            println "Groovy".shout();
//        }


//class window{
//    def run()
//    {
//        println"Running..."
//    }
//}
//class Mirror{
//
//}
//Mirror.mixin window
//def ob = new Mirror()
//ob.run()


import groovy.lang.Singleton
@Singleton
class Database{
    void connect()
    {
        println "Connecting"
    }
}
def obj = new Database();
obj.connect()                           // Can't instantiate singleton Database
