import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.util.*

fun main() {
    val credentials = Credentials()
    val connection = getConnection(credentials)

    println("Where do you want to go?")
    val destination = readLine()!!

    val result = executeQuery(connection,
        "SELECT rides.*, platforms.name AS platform_name FROM rides " +
                "INNER JOIN cities ON rides.destination_city_id = cities.id " +
                "INNER JOIN platforms ON rides.departure_platform_id = platforms.id " +
                "WHERE cities.name = ? " +
                "AND rides.departure_time > NOW() " +
                "AND rides.departure_time < (CURDATE() + INTERVAL 1 DAY) " +
                "ORDER BY rides.departure_time ASC " +
                "LIMIT 3;",
        destination)

    while (result!!.next()) {
        println("You should get ride nr ${result.getString("train_id")}, leaving at ${result.getString("departure_time")} from platform ${result.getString("platform_name")}")
    }
}

fun getConnection(credentials: Credentials): Connection {
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()
    return DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)
}

fun executeQuery(connection: Connection, query: String, destination: String): ResultSet? {
    val statement = connection.prepareStatement(query)
    statement.setString(1, destination)
    return statement.executeQuery()
}