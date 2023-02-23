
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyListener extends tlangBaseListener {
    private final Map<String, Integer> variables;
    public MyListener() {
        variables = new HashMap<>();
    }

    @Override
    public void exitAssign(tlangParser.AssignContext ctx) {
        String variableName = ctx.ID(0).getText();
        String value = ctx.ID().size() > 1
                ? ctx.ID(1).getText()
                : ctx.NUMBER().getText();

        if(ctx.ID().size() > 1) {
            variables.put(variableName, variables.get(value));
        } else {
            variables.put(variableName, Integer.parseInt(value));
        }
    }

    @Override
    public void exitReasign(tlangParser.ReasignContext ctx) {
        String variableName = ctx.ID(0).getText();
        String value = ctx.ID().size() > 1
                ? ctx.ID(1).getText()
                : ctx.NUMBER().getText();

        if(ctx.ID().size() > 1) {
            variables.put(variableName, variables.get(value));
        } else {
            variables.put(variableName, Integer.parseInt(value));
        }
    }

    @Override
    public void exitPrint(tlangParser.PrintContext ctx) {
        String output = ctx.ID() == null
                ? ctx.NUMBER().getText()
                : variables.get(ctx.ID().getText()).toString();
        System.out.println(output);
    }

    @Override
    public void exitAdd(tlangParser.AddContext ctx) {
        String variableName = ctx.ID(0).getText();
        int value;
        if(ctx.ID().size() > 1) {
            value = variables.get(ctx.ID(0).getText()) + variables.get(ctx.ID(1).getText());
        } else {
            value = variables.get(ctx.ID(0).getText()) + Integer.parseInt(ctx.ID(1).getText());
        }

        variables.put(variableName, value);
    }

    @Override
    public void exitSub(tlangParser.SubContext ctx) {
        String variableName = ctx.ID(0).getText();

        int value;
        if(ctx.ID().size() > 1) {
            value = variables.get(ctx.ID(0).getText()) - variables.get(ctx.ID(1).getText());
        } else {
            value = variables.get(ctx.ID(0).getText()) - Integer.parseInt(ctx.ID(1).getText());
        }

        variables.put(variableName, value);
    }

    public static void main(String[] args) {
        try {
            org.antlr.v4.runtime.CharStream input = CharStreams.fromFileName("/home/nikolaireznik/Documents/own/tlang/src/entry.tlang");

            tlangLexer lexer = new tlangLexer(input);
            tlangParser parser = new tlangParser(new CommonTokenStream(lexer));
            parser.addParseListener(new MyListener());
            parser.program();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
