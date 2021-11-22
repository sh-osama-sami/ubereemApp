import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class License {
public Date expirydate;
String LicenseNumber;

public License() {
	
}
public License(String ln,String ed) throws ParseException {
	SimpleDateFormat s= new SimpleDateFormat("dd/MM/yyyy");
	expirydate=s.parse(ed);
	LicenseNumber=ln;
	
}
public void setExpiryDate(Date d) {
	expirydate=d;
	
}
public void setLicenseNumber(String d) {
	LicenseNumber=d;
	
}
public Date getExpiryDate() {
	return expirydate;
	
}
public String getLicenseNumber() {
	return LicenseNumber;
	
}
	
}
