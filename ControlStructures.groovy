def num = 10

if (num) {
    println "$num is truthy"
}

for (i in 1..5) {
    println i
}

def list = [10, 20, 30]
list.each { item -> println "Item: $item" }

def x = 3
switch(x) {
    case 1..5: println "Between 1 and 5"; break
    default: println "Other value"
}
