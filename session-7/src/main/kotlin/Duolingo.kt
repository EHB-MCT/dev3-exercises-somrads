class Duolingo(
    val roundSize: Int = 5,
    val language: String = "fr"
)
{
    var words = mutableListOf<Word>(
        Word("jardin", "tuin", "frans"),
        Word("pool", "zwembad", "engels"),
        Word("ordinateur", "computer", "frans"),
        Word("tree", "boom", "engels"),
        Word("eau", "water", "frans"),
        )

    init{
        words = words.filter { it.language == language }.toMutableList()
    }


    fun play(){
        println("Welcome to duolingo")

        val currentWords = words.shuffled().take(roundSize).toMutableList()
        println(currentWords.count())
 
        while (currentWords.isNotEmpty()){
            val selectedWords = currentWords.random()
            println("what's the translation of ${selectedWords.original}")
            val userAnswer = readLine()

            if (selectedWords.translated == userAnswer){
                currentWords.remove(selectedWords)
            }
            println(currentWords.count())
        }
    }


}