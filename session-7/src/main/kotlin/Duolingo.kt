class Duolingo(
    val roundSize: Int = 5,
    val language: String = "fr"
)
{
    var words = mutableListOf<Word>(
        FrenchWord("jardin", "tuin"),
        EnglishWord("pool", "zwembad"),
        FrenchWord("ordinateur", "computer"),
        EnglishWord("tree", "boom"),
        FrenchWord("eau", "water"),
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