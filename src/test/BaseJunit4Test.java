import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@ContextConfiguration(locations = {"classpath:applicationContext-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseJunit4Test {

}
