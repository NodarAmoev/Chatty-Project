import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (Categories.class)
@Categories.IncludeCategory()
@Suite.SuiteClasses ({LoginTest.class,HeaderTest.class,HomePageTest.class,LoginTest.class,PostTest.class,ProfileTest.class,RegisterTest.class})
public class RunnerTest {

}



