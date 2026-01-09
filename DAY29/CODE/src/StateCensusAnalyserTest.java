import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {

    private static final String STATE_CENSUS_CSV = "CODE/StateCensusData.csv";
    private static final String STATE_CODE_CSV = "CODE/IndiaStateCode.csv";

    //  Happy Test Case: Correct Census CSV should return 28 records
    @Test
    public void givenCorrectCensusCSV_ShouldReturnCount() throws Exception {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        int count = analyser.loadStateCensusData(STATE_CENSUS_CSV);
        Assert.assertEquals(28, count);
    }

    //  Sad Test Case: Wrong file should throw FILE_NOT_FOUND exception
    @Test
    public void givenWrongFile_ShouldThrowFileNotFoundException() {
        try {
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            analyser.loadStateCensusData("wrong.csv");
            Assert.fail("Expected a CensusAnalyserException to be thrown");
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(
                    CensusAnalyserException.ExceptionType.FILE_NOT_FOUND,
                    e.type
            );
        }
    }

    //  Sad Test Case: Wrong file type should throw INVALID_FILE_TYPE exception
    @Test
    public void givenWrongType_ShouldThrowInvalidFileTypeException() {
        try {
            StateCensusAnalyser analyser = new StateCensusAnalyser();
            analyser.loadStateCensusData("wrong_type.txt");
            Assert.fail("Expected a CensusAnalyserException to be thrown");
        } catch (CensusAnalyserException e) {
            Assert.assertEquals(
                    CensusAnalyserException.ExceptionType.INVALID_TYPE,
                    e.type
            );
        }
    }

    // Optional: Display number of states (just info)
    @Test
    public void testLoadStateCensusData() throws CensusAnalyserException {
        StateCensusAnalyser analyser = new StateCensusAnalyser();
        int count = analyser.loadStateCensusData(STATE_CENSUS_CSV);
        System.out.println("Number of states in CSV: " + count);
    }
}
