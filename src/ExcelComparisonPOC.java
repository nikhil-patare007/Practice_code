
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Objects;

public class ExcelComparisonPOC {
    public static void main(String[] args) {
        try {
            FileInputStream excellFile1 = new FileInputStream(new File("/Users/npatare/IdeaProjects/JavaTest/data/Excel1.xlsx"));
            FileInputStream excellFile2 = new FileInputStream(new File("/Users/npatare/IdeaProjects/JavaTest/data/Excel2.xlsx"));

            XSSFWorkbook workbook1 = new XSSFWorkbook(excellFile1);
            XSSFWorkbook workbook2 = new XSSFWorkbook(excellFile2);

            XSSFSheet sheet1 = workbook1.getSheetAt(0);
            XSSFSheet sheet2 = workbook2.getSheetAt(0);

            if (compareTwoSheets(sheet1, sheet2)) {
                System.out.println("\nTwo Excelsheets are Equal");
            } else {
                System.out.println("\nTwo Excelsheets are Not Equal");
            }
            excellFile1.close();
            excellFile2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static boolean compareTwoSheets(XSSFSheet sheet1, XSSFSheet sheet2) {
        int firstRow1 = sheet1.getFirstRowNum();
        int lastRow1 = sheet1.getLastRowNum();
        boolean equalSheets = true;
        for (int i = firstRow1; i <= lastRow1; i++) {
            System.out.print("___________________________");
            System.out.println("\nComparing Row " + i);
            System.out.println("___________________________");
            XSSFRow row1 = sheet1.getRow(i);
            XSSFRow row2 = sheet2.getRow(i);
            if (!compareTwoRows(row1, row2)) {
                equalSheets = false;
                System.out.println(" Row " + i + " | Not Equal");
            } else {
                System.out.println(" Row " + i + " | Equal");
            }
        }
        return equalSheets;

    }

    public static boolean compareTwoRows(XSSFRow row1, XSSFRow row2) {
        if ((row1 == null) && (row2 == null)) {
            return true;
        } else if ((row1 == null) || (row2 == null)) {
            return false;
        }
        int firstCell1 = row1.getFirstCellNum();
        int lastCell1 = row1.getLastCellNum();
        boolean equalRows = true;

        for (int i = firstCell1; i <= lastCell1; i++) {
            XSSFCell cell1 = row1.getCell(i);
            XSSFCell cell2 = row2.getCell(i);
            if (!compareTwoCells(cell1, cell2)) {
                equalRows = false;
                System.err.println("Cell " + i + " | Not Equal");
            } else {
                System.out.println("Cell " + i + " | Equal");
            }
        }
        return equalRows;
    }

    public static boolean compareTwoCells(XSSFCell cell1, XSSFCell cell2) {
        boolean equalCells = false;
        if ((cell1 == null) && (cell2 == null)) {
            equalCells = true;
        } else if ((cell1 == null) || (cell2 == null)) {
            equalCells = false;
        } else if(Objects.equals(cell1.toString(), cell2.toString())){
            equalCells = true;
        }

        return equalCells;

//        int type1 = cell1.getCellType();
//        int type2 = cell2.getCellType();
//        if (type1 == type2) {
//            if (cell1.getCellStyle().equals(cell2.getCellStyle())) {
//                switch (cell1.getCellType()) {
//                    case HSSFCell.CELL_TYPE_FORMULA:
//                        if (cell1.getCellFormula().equals(cell2.getCellFormula())) {
//                            equalCells = true;
//                        }
//                        break;
//                    case HSSFCell.CELL_TYPE_NUMERIC:
//                        if (cell1.getNumericCellValue() == cell2.getNumericCellValue()) {
//                            equalCells = true;
//                        }
//                        break;
//                    case HSSFCell.CELL_TYPE_STRING:
//                        if (cell1.getStringCellValue().equals(cell2.getStringCellValue())) equalCells = true;
//                        break;
//                    case HSSFCell.CELL_TYPE_BLANK:
//                        if (cell2.getCellType() == HSSFCell.CELL_TYPE_BLANK) {
//                            equalCells = true;
//                        }
//                        break;
//                    case HSSFCell.CELL_TYPE_BOOLEAN:
//                        if (cell1.getBooleanCellValue() == cell2.getBooleanCellValue()) {
//                            equalCells = true;
//                        }
//                        break;
//                    case HSSFCell.CELL_TYPE_ERROR:
//                        if (cell1.getErrorCellValue() == cell2.getErrorCellValue()) {
//                            equalCells = true;
//                        }
//                        break;
//                    default:
//                        if (cell1.getStringCellValue().equals(cell2.getStringCellValue())) {
//                            equalCells = true;
//                        }
//                        break;
//                }
//            } else {
//                return false;
//            }
//        } else {
//            return false;
//        }
//        return equalCells;
    }

}
