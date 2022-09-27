package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}

	public double getDistancia(Geo a, Geo b){
		return 12742 * Math.asin(Math.sqrt(Math.pow(Math.sin((a.getLatitude() - b.getLatitude()) / 2), 2) +
		Math.pow(Math.sin((a.getLongitude() - b.getLongitude()) / 2), 2) * Math.cos(a.getLatitude()) * Math.cos(b.getLatitude())));
	}
	
	public double getLongitude() {
		return longitude;
	}
}
