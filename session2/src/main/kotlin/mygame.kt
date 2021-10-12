fun main(){
    println("play the game");
    challengeOne();


}

fun challengeOne() {
    val correctAnswer = "Luffy"
    val playerAnwser = readLine();

    if (playerAnwser != null) {
        if (playerAnwser.contains(correctAnswer)){
            println("You are correct, Monkey.D.Luffy is the name")
            challengeTwo()
        } else {
            println("Too bad " + playerAnwser + " is the wrong name " )
        }
    }

}

fun challengeTwo() {
        println("Guess the dice number");
        val diceNumbers =  intArrayOf(1, 2, 3,4,5,6).random()
        val lowNumber = intArrayOf(1,2,3).random()
        val highNumber = intArrayOf(4,5,6).random()


}





