package AsposeCellsExamples.TechnicalArticles;

import com.aspose.cells.Cells;
import com.aspose.cells.Range;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.WorksheetCollection;
import AsposeCellsExamples.Utils;

public class AddNamedRangeWithWorkbookScope {
	public static void main(String[] args) throws Exception {

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddNamedRangeWithWorkbookScope.class) + "TechnicalArticles/";
		// Instantiating a Workbook object
		Workbook workbook = new Workbook();

		// Get Worksheets collection
		WorksheetCollection worksheets = workbook.getWorksheets();

		// Accessing the first worksheet in the Excel file
		Worksheet sheet = worksheets.get(0);

		// Get worksheet Cells collection
		Cells cells = sheet.getCells();

		// Creating a workbook scope named range
		Range namedRange = cells.createRange("A1", "C10");
		namedRange.setName("workbookScope");

		// Saving the modified Excel file in default format
		workbook.save(dataDir + "ANRWWScope_out.xls");

	}
}
