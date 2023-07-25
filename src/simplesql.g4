grammar simplesql;

// Reglas léxicas (tokens)
SELECT   : 'SELECT';
INSERT   : 'INSERT';
INTO     : 'INTO';
VALUES   : 'VALUES';
UPDATE   : 'UPDATE';
SET      : 'SET';
DELETE   : 'DELETE';
FROM     : 'FROM';
WHERE    : 'WHERE';
AND      : 'AND';
OR       : 'OR';
ID       : [a-zA-Z_][a-zA-Z0-9_]* ;
INT      : [0-9]+ ;
STRING   : '\'' ~('\'' | '\r' | '\n')* '\'' ;
WS       : [ \t\r\n]+ -> skip ;

// Reglas sintácticas
query : selectStatement | insertStatement | updateStatement | deleteStatement ;

selectStatement : SELECT columnList FROM tableName ( WHERE condition )?;

columnList : ID ( ',' ID )* ;

tableName : ID ;

insertStatement : INSERT INTO ID '(' columnList ')' VALUES '(' valueList ')' ;

valueList : literal ( ',' literal )* ;

updateStatement : UPDATE ID SET assignmentList ( WHERE condition )?;

assignmentList : ID '=' literal ( ',' ID '=' literal )* ;

deleteStatement : DELETE FROM ID ( WHERE condition )?;

condition : predicate ( ( AND | OR ) predicate )* ;

predicate : expression ( '=' | '<>' | '<' | '>' | '<=' | '>=' ) expression ;

expression : ID | literal ;

literal : INT | STRING ;