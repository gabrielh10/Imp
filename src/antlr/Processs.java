package antlr;

import org.antlr.v4.runtime.misc.NotNull;

public class Processs extends impBaseVisitor {
	public String visitAexpr(@NotNull impParser.AexprContext ctx) { 
		System.out.println(ctx.getText());
		return ctx.getText();
		}

	public String visitBexpr(@NotNull impParser.BexprContext ctx) { 
		System.out.println(ctx.getText());
		return ctx.getText();
		}

	public String visitPgm(@NotNull impParser.PgmContext ctx) { 
		System.out.println(ctx.getText());
		return ctx.getText(); 
		}

	public String visitStmt(@NotNull impParser.StmtContext ctx) { 
		System.out.println(ctx.getText());
		return ctx.getText();
		}

	public String visitModules(@NotNull impParser.ModulesContext ctx) { 
		System.out.println(ctx.getText() + "\n");
		return (ctx.getText() + " \n");
		}
	
	
	public String visitBody(@NotNull impParser.BodyContext ctx) { 
		System.out.println(ctx.getText());
		return ctx.getText();
	}
	
}



