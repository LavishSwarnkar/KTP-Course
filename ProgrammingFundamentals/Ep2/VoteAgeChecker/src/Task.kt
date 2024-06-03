import com.faangx.ktp.basics.VoteAgeCheckerMiniApp

fun canVote(age: Int): Boolean {
	age <= 18
}


fun main() {
    VoteAgeCheckerMiniApp(::canVote)
}