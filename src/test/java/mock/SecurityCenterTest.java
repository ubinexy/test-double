package mock;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SecurityCenterTest {
    /* 需求描述：
    编写SecurityCenter类的单元测试，单元测试switchOn方法，不依赖于DoorPanel的close的方法实现
    * */


    @BeforeEach
    public void setUp() {

    }

    @Test
    public void shouldVerifyDoorIsClosed() {
        DoorPanel mockDoorPanel = mock(DoorPanel.class);
        SecurityCenter securityCenter = new SecurityCenter(mockDoorPanel);
        securityCenter.switchOn();
        verify(mockDoorPanel).close();
    }
}
