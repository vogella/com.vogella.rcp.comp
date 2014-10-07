package com.vogella.rcp.comp.e4.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

public class ExitHandler {
	@Execute 
	public void execute(IWorkbench wb){
		wb.close();
	}
}
