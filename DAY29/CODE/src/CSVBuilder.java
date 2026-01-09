import com.opencsv.bean.CsvToBeanBuilder;
import java.io.Reader;
import java.util.Iterator;

public class CSVBuilder<T> {

    public Iterator<T> getCSVIterator(Reader reader, Class<T> clazz)
            throws CensusAnalyserException {

        try {
            return new CsvToBeanBuilder<T>(reader)
                    .withType(clazz)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSeparator('\t')   // <-- important for your tab-delimited files
                    .build()
                    .iterator();

        } catch (RuntimeException e) {
            throw new CensusAnalyserException(
                    "Invalid CSV Header or Format",
                    CensusAnalyserException.ExceptionType.INVALID_HEADER
            );
        }
    }
}
