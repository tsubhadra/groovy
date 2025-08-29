import java.time.LocalDate

println "Today: " + LocalDate.now()

def nums = [1, 2, 3, 4, 5]

// Find even numbers
println nums.findAll { it % 2 == 0 }

// Transform list
println nums.collect { it * 10 }

// Range
(1..5).each { println "Range value: $it" }
