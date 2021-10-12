fun main(){
    println("Guess the name main character of One Piece is");
    challengeOne()

}

fun challengeOne(){
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
