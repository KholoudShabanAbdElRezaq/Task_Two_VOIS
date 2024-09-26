package Test;

import Base.BaseClass;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.testng.annotations.Test;
import pages.SelectSeat;

public class Run_Test extends BaseClass {
//
    @Test
    public void TC()
    {
        SelectSeat selectSeat=homePage.fill_data();
    }
}
