fun main(){
    println("Guess the name main character of One Piece is");
    challengeOne()

}

fun challengeOne(){
    val correctAnswer = "Luffy"
    val playerAnwser = readLine();

    if (playerAnwser != null) {
        if (playerAnwser.contains(correctAnswer)){
            challengeTwo()
        } else {
            println("Too bad " + playerAnwser + " is the wrong name " )
        }
    }

    fun challengeTwo(){
        val userGuess = readLine().toString();
        val diceResult = (1..6).random();

        if (diceResult >=4){
            winner()
        } else {
            gameOver()
        }
    }


}
