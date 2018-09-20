import com.mybatis.entity.Student;
import com.mybatis.mapper.dao.StudentMapper;
import org.junit.Test;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MybatisSpringTest {

    @Test
    public void testMybatisSpring() {
        Student student = new Student();
        student.setName("studentNew");
        student.setAge(1111);
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        StudentMapper studentMapper = (StudentMapper) autowireCapableBeanFactory.getBean("studentMapper");
        studentMapper.addStudent(student);
    }
}
