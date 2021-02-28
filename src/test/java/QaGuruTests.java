import model.Courses;
import model.QaStudent;
import model.Registration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.BaseFunc;
import pages.qaguru.Homepage;
import pages.qaguru.RegistrationPage;
import pages.qaguru.SuccessPage;

public class QaGuruTests {
    private final String URL = "http://qaguru.lv/totest/";
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private final String SUCCESS_TX ="Paldies! Reģistrācija ir veiksmīga. Tuvākajā laikā mēs sazināsimies ar jums un piedāvāsim detalizēto informāciju par kursu, laiku un norises vietu :)";
    private final BaseFunc baseFunc = new BaseFunc();

    @Test
    public void registrationCheck() {
        LOGGER.info("");

        baseFunc.openUrl((URL));

        Homepage homepage = new Homepage(baseFunc);
        RegistrationPage registrationPage = homepage.openRegistrationPage();

        QaStudent student = new QaStudent();
        student.setFirstName("AT FN");
        student.setLastName("AT LN");
        student.setEmail("ats@kjf.lv");
        student.setPhone("128735765295");

        Registration registration = new Registration();
        registration.setStudent(student);
        registration.setCode("Code");
        registration.setComment("please comment here");
        registration.setCourses(Courses.QA2);

        registrationPage.fillInRegistrationForm(registration);
        registrationPage.submitForm();

        SuccessPage successPage = new SuccessPage(baseFunc);
        Assertions.assertEquals(SUCCESS_TX, successPage.getSuccessMsg(), "problem with success msg!");

    }

    @AfterEach
    public void close() {
        baseFunc.closeBrowser();
    }
}


