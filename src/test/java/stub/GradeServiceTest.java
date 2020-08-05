package stub;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */

    @BeforeEach
    public void setUp() {

    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        MockGradeSystem gradeSystem = mock(MockGradeSystem.class);
        when(gradeSystem.gradesFor(0L)).thenReturn(Arrays.asList(80.0, 90.0, 100.0));

        GradeService gradeService = new GradeService(gradeSystem);
        Assertions.assertEquals(90.0, gradeService.calculateAverageGrades(0L));
    }
}
