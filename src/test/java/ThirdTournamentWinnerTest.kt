import org.junit.jupiter.api.Test

 class ThirdTournamentWinnerTest {
// [home team =>1,away team=>0]
        @Test
        fun tournamentWinner() {
            val competitions = listOf(
                listOf("HTML", "C#"),
                listOf("C#", "Python"),
                listOf("Python", "HTML")
            )
            val results = listOf(0, 0, 1)
            val expected = "Python"
            val output = tournamentWinner(competitions, results)
            assert(expected == output)
        }

}