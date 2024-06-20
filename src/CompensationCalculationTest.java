

import com.example.losscompensation.model.UserInput;
import com.example.losscompensation.service.CompensationCalculation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompensationCalculationTest {
    @Test
    public void testCalculateCompensation() {
        UserInput input = new UserInput(20, 45, 50000);
        CompensationCalculation calculation = new CompensationCalculation();
        double expectedCompensation = 220000.0; // Example expected result
        double actualCompensation = calculation.calculateCompensation(input);
        assertEquals(expectedCompensation, actualCompensation, 0.01);
    }
}
