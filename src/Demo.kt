fun main(args: Array<String>) {
	val day = 2

	val result = when (day) {
		1 -> "Monday"
		2 -> "Tuesday"
		3 -> "Wednesday"
		4 -> "Thursday"
		5 -> "Friday"
		6 -> "Saturday"
		7 -> "Sunday"
		else -> "Invalid day."
	}
	println(result)
	when (day) {
		1 -> println("Monday")
		2 -> println("Tuesday")
		3 -> println("Wednesday")
		4 -> println("Thursday")
		5 -> println("Friday")
		6 -> println("Saturday")
		7 -> println("Sunday")
		else -> println("Invalid day.")
	}

	
	//We can combine multiple when conditions into a single condition.
	when (day) {
		1, 2, 3, 4, 5 -> println("Weekday")
		else -> println("Weekend")
	}

	//Kotlin ranges are created using double dots .. and we can use them while checking when condition with the help of in operator.
	when (day) {
		in 1..5 -> println("Weekday")
		else -> println("Weekend")
	}
}