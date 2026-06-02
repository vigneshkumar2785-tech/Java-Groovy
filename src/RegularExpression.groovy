//1.Regular Expression

println "12345" ==~ /\d+/          //true
//   / = Start
//   \d = number
//   + = one are More than one
// ==~  = Exact Match

//Regax Operator
// ~ = Used for create pattern
def pat = ~/groovy/
println pat.getClass()              //class java.util.regex.Pattern


// ==~   ==Check exact match
println "Vicky" ==~ /Vick/          //false

// To check the Word Appear
println "hai Vicky" =~/Vicky/       //java.util.regex.Matcher[pattern=Vicky region=0,9 lastmatch=]


def language = ~/grovvy/
if("grovvy" =~ language)
{
    println("Hello")
}


// 2. Symbols
println "123" ==~ /\d+/
println "heai^*9766" ==~ /\w+/
println "^*" ==~ /\W+/
println " "==~ /\s/


// 3. Quantifiers
//* + ? {n}

println "9197492867293" ==~ /\d+{10}/
println "567899992738" ==~ /\d+{12}/

////Vicky787@gmail.com
//def email = "Vicky767@gmail.in"
//println email ==~ /^[a-z0-9,~]+@[a-z]+\.[a-z]{2,}$/

def words ="eat walk sleep cat run"
def match = words =~/\w+t/
match.each{println it}

def text = "Love programming and song"
println text.replaceAll("song","eat")


def name = "virat14161"
println name.replaceAll(/\d+/,"")

// Convert Str to Integer
def number = "456"
//number = Integer.parseInt(number)
//print number.getClass()

//(OR)

res = number.toInteger()
println res.getClass();

//(OR)
//
//res = number.replaceAll(/\s+/,"").toInteger()
println res.getClass();


