def greet(name="World") {
    return "Hello, $name!"
}

println greet()
println greet("Arun")

// Closure example
def square = { x -> x * x }
println square(5)

// Passing closure
def operate(num, closure) {
    closure(num)
}
println operate(4, square)
