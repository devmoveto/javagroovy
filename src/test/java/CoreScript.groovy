import Initialiser.DriverManager
import org.junit.Before
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

class CoreScript extends DriverManager {

    @BeforeMethod
    void beginningOfTheTest() {
        println("############################# STAR OF THE TEST #############################")
    }

    @AfterMethod
    void endOfTheTest() {
        println("############################## END OF THE TEST #############################")
        endSession()
    }
}