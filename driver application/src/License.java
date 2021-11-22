import java.util.Date;

public class License {
public Date expirydate;
String LicenseNumber;


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
