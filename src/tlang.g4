grammar tlang;

program: 'get' statement +'out';

statement: assign | add |  print | sub | reasign;

assign: 'let' ID '=' (NUMBER | ID);

reasign: ID '=' (NUMBER | ID);

print: 'print' (NUMBER | ID);

add: (NUMBER | ID) '+' (NUMBER | ID);

sub: (NUMBER | ID) '-' (NUMBER | ID);

ID: [a-z][a-zA-Z0-9_]*;
NUMBER: [0-9]+;
COMMENT : '//' ~[\r\n]* -> skip;
WS: [ \n\t]+ -> skip;