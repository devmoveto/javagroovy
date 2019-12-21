import org.testng.annotations.Test

class TestProj extends CoreScript {

    @Test
    void testFirst(){
        goTo("https://service.berlin.de/terminvereinbarung/termin/day/")
        sleep(0)
    }
}
