import com.lanclaw.dao.UserDaoMysqlImpl;
import com.lanclaw.dao.UserDaoOracleImpl;
import com.lanclaw.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoOracleImpl());
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
