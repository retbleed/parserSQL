import org.antlr.v4.runtime.*;

public class Main {
    public static void main(String[] args) {
        //Consulta SQL
        String sqlQuery = "SELECT column1, column2 FROM table WHERE column3 = 'value' ORDER BY column1;";

        CharStream input = CharStreams.fromString(sqlQuery);
        simplesqlLexer lexer = new simplesqlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        simplesqlParser parser = new simplesqlParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ConsoleErrorListener());
        simplesqlParser .QueryContext queryContext = parser.query();
        simplesqlBaseVisitor visitor = new simplesqlBaseVisitor();
        String[] columnNames = (String[]) visitor.visitQuery(queryContext);

        if (columnNames != null) {
            System.out.println("Columnas seleccionadas:");
            for (String columnName : columnNames) {
                System.out.println(columnName);
            }
        } else {
            System.out.println("No se encontraron columnas seleccionadas.");
        }
    }
}