 fun challengeTwo(){
        val userGuess = readLine().toString();
        val diceResult = (1..6).random();

        if (diceResult >=4){
            println("win")
        } else {
            println("loss")

        }
    }


}
