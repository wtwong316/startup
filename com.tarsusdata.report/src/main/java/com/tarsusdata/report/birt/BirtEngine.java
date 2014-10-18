package com.tarsusdata.report.birt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;

import org.apache.commons.io.IOUtils;
import org.eclipse.birt.core.exception.BirtException;
import org.eclipse.birt.core.framework.Platform;
import org.eclipse.birt.report.engine.api.EngineConfig;
import org.eclipse.birt.report.engine.api.EngineException;
import org.eclipse.birt.report.engine.api.HTMLRenderOption;
import org.eclipse.birt.report.engine.api.IRenderOption;
import org.eclipse.birt.report.engine.api.IRenderTask;
import org.eclipse.birt.report.engine.api.IReportDocument;
import org.eclipse.birt.report.engine.api.IReportEngine;
import org.eclipse.birt.report.engine.api.IReportEngineFactory;
import org.eclipse.birt.report.engine.api.IReportRunnable;
import org.eclipse.birt.report.engine.api.IRunAndRenderTask;
import org.eclipse.birt.report.engine.api.RenderOption;
import org.eclipse.core.internal.registry.RegistryProviderFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class BirtEngine {
	private String birtRuntimeLocation;
	private String logLocation;
	private EngineConfig engineConfig;
	private IReportEngine reportEngine;
	
	public void setEngineConfig() {
	    if (engineConfig == null) { 
	      engineConfig = new EngineConfig();
	      //engineConfig.setEngineHome(birtRuntimeLocation);
	      engineConfig.setDefaultEmitter("html", "org.eclipse.birt.report.engine.emitter.html");
	      engineConfig.setLogConfig("/tmp", Level.FINE);
	    }
	 
	}
	
	
	public void startDesignEngine() throws BirtException{
		if (reportEngine != null) {
			return;
		} else {
			setEngineConfig();
		}
		Platform.startup(engineConfig);
		IReportEngineFactory factory = (IReportEngineFactory) Platform
				.createFactoryObject( IReportEngineFactory.EXTENSION_REPORT_ENGINE_FACTORY );
	    reportEngine = factory.createReportEngine( engineConfig );
	    reportEngine.changeLogLevel( Level.WARNING );
	}
	
	public void shutdown() {
	    if (reportEngine != null) {
	    	reportEngine.destroy();
	    }
	    Platform.shutdown();
	    RegistryProviderFactory.releaseDefault();
	}
	
	private String runAndRenderTask(IReportRunnable runnable, String outputFilePath) throws EngineException, IOException {
	    IRunAndRenderTask runAndRenderTask = reportEngine.createRunAndRenderTask(runnable);
	     				
		//Setup rendering to HTML
		HTMLRenderOption options = new HTMLRenderOption();		
		options.setOutputFileName(outputFilePath);
	    //htmlRenderOption.setOutputStream(response.getOutputStream());
		options.setOutputFormat("html");
		//Setting this to true removes html and body tags
		options.setEmbeddable(false);
				
		runAndRenderTask.setRenderOption(options);
		//run and render report
		runAndRenderTask.run();
		runAndRenderTask.close();
		FileInputStream fis = new FileInputStream(outputFilePath);
		return IOUtils.toString(fis);
	}
	
	public String runAndRenderRptDesignDoc(String rptDesignDoc, String outputFilePath) throws EngineException, IOException {
		//Open the report design
		IReportRunnable design = reportEngine.openReportDesign(rptDesignDoc); 
			
		//Create task to run and render the report,
		IReportRunnable runnable = reportEngine.openReportDesign(new FileSystemResource(rptDesignDoc).getInputStream());
		
		return runAndRenderTask(runnable, outputFilePath);
	}
	
	public void renderRptDoc(String rptDoc, String outputFilePath) throws EngineException, IOException {
		//Open the report design
		IReportDocument  iReportDoc = reportEngine.openReportDocument(rptDoc); 
			
		//Create task to run and render the report,
		IRenderTask task = reportEngine.createRenderTask(iReportDoc);
		IRenderOption options = new RenderOption();		
		options.setOutputFormat("html");
		options.setOutputFileName(outputFilePath);
		task.setRenderOption(options);
		task.render();
		iReportDoc.close();
	}	
	
	
	
}
