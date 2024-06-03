import com.faangx.ktp.basics.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {
	repeat(n + 1) { r ->
		val combinationsOf = combinationsOf(n, r)
		if (combinationsOf != 1L) print("$combinationsOf")

		if (n - r > 0) {
			print("a")
			if (n - r > 1) print("^${n - r}")
		}
		if (r > 0) {
			print("b")
			if (r > 1) print("^$r")
		}
		if (r < n) {
			print(" + ")
		}
	}
	// println()
}

fun factorialOf(x: Int): Long {
	var factorial = 1L
	for (i in 2..x) {
		factorial *= i
	}
	return factorial
}

fun permutationsOf(n: Int, r: Int): Long {
	var permutations = 1L
	for (i in n - r + 1..n) {
		permutations *= i
	}
	return permutations
}

fun combinationsOf(n: Int, r: Int): Long {
	return permutationsOf(n, r) / factorialOf(r)
}


fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}