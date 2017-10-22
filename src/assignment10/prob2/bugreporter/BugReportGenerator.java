package assignment10.prob2.bugreporter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import assignment10.prob2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 *
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "assignment10.prob2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		//implement
		HashMap<String,List<String>> groupby= new HashMap<>();	
		for(Class<?> c1 : classes) {
			
			if (c1.isAnnotationPresent(BugReport.class)) {			 
				BugReport annotation = (BugReport)c1.getAnnotation(BugReport.class);
				List<String> listdetail =null;
				String name = annotation.assignedTo();
				
				if (groupby.containsKey(name)){
					listdetail  = groupby.get(name);
				} else {
					listdetail = new ArrayList<String>();
					groupby.put(name, listdetail );
				}
				
				StringBuilder sb = new StringBuilder();
				sb.append("   "+REPORTED_BY + annotation.reportedBy()+"\n");
				sb.append("   "+CLASS_NAME + c1.getName()+"\n");
				sb.append("   "+DESCRIPTION + annotation.description()+"\n");
				sb.append("   "+SEVERITY + annotation.severity()+"\n");
				listdetail .add(sb.toString()+"\n");
			}
			
		}
		
		WritetoFile(groupby);
	}
	
	private void WritetoFile(HashMap<String,List<String>> output) {
		StringBuilder sb = new StringBuilder();
		for(HashMap.Entry<String, List<String>> elem: output.entrySet()) {
			sb.append(elem.getKey() + "\n");
			List<String> details = elem.getValue();
			for (String detail : details )
			{
				sb.append(detail);
			}
			
		}
		
		File outfile = new File(REPORT_NAME);
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(outfile))) {
				pw.println(sb.toString());
				System.out.println(sb.toString());
				
		} catch(Exception e) {
			LOG.warning("IOException has thrown from writing file \n" +e.getMessage());
		}
	}

}
