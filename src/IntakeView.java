import antlrData.simplesqlBaseVisitor;
import antlrData.simplesqlLexer;
import antlrData.simplesqlParser;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.swing.*;

public class IntakeView extends JFrame{
    private JPanel mainPane;
    private JButton button1;
    private JButton cleanButton;
    private JTextPane textPane1;
    private JTextArea a0TextArea; // CONSOLA

    public IntakeView() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = textPane1.getText();
                List<String> errors = verifyText(inputText);

                if (errors != null && !errors.isEmpty()) {
                    StringBuilder errorMessage = new StringBuilder();
                    for (String error : errors) {
                        errorMessage.append(error).append("\n");
                    }
                    a0TextArea.setText(errorMessage.toString());
                } else {
                    a0TextArea.setText("No se encontraron errores.");
                }
            }
        });
        cleanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a0TextArea.setText("");
                textPane1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        IntakeView window =  new IntakeView();
        window.setContentPane(window.mainPane);
        window.setTitle("SQL Parser");
        window.setSize(1366,766);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static List<String> verifyText(String text) {
        CharStream input = CharStreams.fromString(text);
        simplesqlLexer lexer = new simplesqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simplesqlParser parser = new simplesqlParser(tokens);

        parser.removeErrorListeners();
        ErrorVerifier errorVerifier= new ErrorVerifier();
        parser.addErrorListener(errorVerifier);

        simplesqlParser.QueryContext queryContext = parser.query();
        simplesqlBaseVisitor visitor = new simplesqlBaseVisitor();
        visitor.visit(queryContext);

        return errorVerifier.getErrors();
    }
}
