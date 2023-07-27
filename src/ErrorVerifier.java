import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class ErrorVerifier extends BaseErrorListener {
    private final List<String> errors = new ArrayList<>();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        String errorMessage = "Error at line " + line + ":" + charPositionInLine + " - " + msg;
        errors.add(errorMessage);
    }

    public List<String> getErrors() {
        return errors;
    }
}