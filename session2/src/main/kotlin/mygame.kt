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

        } else {
            println("Too bad " + playerAnwser + " is the wrong name " )
        }
    }

}

fun challengeTwo(){
        val userGuess = readLine().toString();
        val diceResult = (1..6).random();

        if (diceResult >=4){
            println("win")
        } else {
            println("loss")

        }
    }



