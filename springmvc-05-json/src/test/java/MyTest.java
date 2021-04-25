import com.alibaba.fastjson.JSON;
import com.wuyiwen.pojo.User;
import org.junit.Test;

import java.util.ArrayList;

public class MyTest {


    @Test
    public void test1(){
        ArrayList<User> users = new ArrayList<User>();


        User user = new User("wuyiwen", 1, "nan");
        User user2 = new User("rwqer", 13, "nan");
        User user3 = new User("ere", 14123, "nan");

        users.add(user);
        users.add(user2);
        users.add(user3);

        String s = JSON.toJSONString(users);

        System.out.println(s);
    }
}
