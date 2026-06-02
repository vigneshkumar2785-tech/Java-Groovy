//Meta Programming
//
//class Student
//{
//    String name;
//}
//Student.metaClass.study ={
//    println "${delegate.name} is Studying"
//}
//def sd = new Student(name : "Vimal")
//Student.metaClass.id = 116;
//sd.study()
//print(sd.id)
//
//
//// Delegate - CurrentInstance - greet
//String.metaClass.greet = { -> "Hello $delegate" }
//String str = "Vignesh"
//println str.greet()
//
////Expando MetaClass
//class MathUtil{}
//MathUtil.metaClass.static.square = {
//    int x -> x*x
//}
//println MathUtil.square(5)
//
//
//// Invoked Mehod
//class Laptop{
//    def invokeMethod(String method_name , args)
//    {
//        println "$method_name invoked , $args"
//    }
//    def methodMissing(String method_name ,args)
//    {
//        println"No method Called $method_name with $args"
//    }
//    def sayhello(name)
//    {
//        println"Hello $name"
//    }
//
//}
//def l = new Laptop();
//l.greet() //No method Called greet with [hai]   // Are all Output
//l.sayHi(); //No method Called sayHi with []
//l.sayhello() //Hello null
//l.invokeMethod() //No method Called invokedMethod with []
//
//
//class Laptop1
//{
//    def propertyMissing(String property)
//    {
//        println "No Property $property"
////        return "Hello World"
//    }
//}
//def l1 = new Laptop1()
//l1.location;   // Output : No Property location
//
//
//println "2+3 = ${2+5}"  // ==Trick
//
