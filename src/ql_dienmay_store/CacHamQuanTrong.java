package ql_dienmay_store;

public class CacHamQuanTrong {
    public boolean isNumeric(String var) {
        try {  
            Double.parseDouble(var);  
            return true;
        
        } catch(NumberFormatException e){  
            return false;  
        }
    }
    public boolean isInteger(String var) {
        try {  
            Integer.parseInt(var);  
            return true;
        } catch(NumberFormatException e){  
            return false;  
        }
    }
    
    public boolean kiemTraDuLieuSo(String var) {
        if (isInteger(var))
            return true;
        
        javax.swing.JOptionPane.showMessageDialog(null, "Dữ liệu phải là số\nvd:123", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return false; 
    }
    
    public boolean kiemTraDate(String Date1, String Date2) {
         String[] s1 = Date1.split("\\ ");
        String[] s2 = Date2.split("\\ ");
        String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun",
                                  "Jul","Aug","Sep","Oct","Nov","Dec"};
 
        if ( Integer.parseInt(s1[2]) > Integer.parseInt(s2[2])) {
            System.out.println("lỗi năm");
            return false;
        }

        int iThang1 = 0, iThang2 = 0;
        for (int i=0 ; i < strMonths.length ; i++) {
            if (strMonths[i].equals(s1[1]))
                iThang1 = i;
            if (strMonths[i].equals(s2[1]))
                iThang2 = i;
        }
        
        if ( iThang1 > iThang2 ) {
            System.out.println("Lỗi tháng");
            return false;
        }
        
        if ( Integer.parseInt(s1[0]) > Integer.parseInt(s2[0])) {
            System.out.println("lỗi ngày");
            return false;
        }
        return true;
    }
    public boolean kiemtrathang(String monthyear,String date1){
        String[] s1 = monthyear.split("\\ ");
        String[] s2 = date1.split("\\ ");
        String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun",
                                  "Jul","Aug","Sep","Oct","Nov","Dec"};
        if ( Integer.parseInt(s1[1]) != Integer.parseInt(s2[2])) {
            return false;
        }
        int iThang1 = 0, iThang2 = 0;
        for (int i=0 ; i < strMonths.length ; i++) {
            if (strMonths[i].equals(s1[0]))
                iThang1 = i;
            if (strMonths[i].equals(s2[1]))
                iThang2 = i;
        }
        
        if ( iThang1 != iThang2 ) {
            System.out.println("Lỗi tháng");
            return false;
        }
        return true;
        }
    public boolean kiemtranam(String year,String date1){
        
        String[] s2 = date1.split("\\ ");
        String[] strMonths = {"Jan","Feb","Mar","Apr","May","Jun",
                                  "Jul","Aug","Sep","Oct","Nov","Dec"};
        if ( Integer.parseInt(year) != Integer.parseInt(s2[2])) {
            return false;
        }
        
        return true;
        }
    }
    

