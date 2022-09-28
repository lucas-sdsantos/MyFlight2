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

	public double getLongitude() {
		return longitude;
	}

	public static double getDistancia(Geo a, Geo b){//Esse método precisa ser testado, algo pode estar errado.
		return 12742 *
		Math.asin(Math.sqrt(Math.pow(Math.sin((Math.toRadians(a.getLatitude() -
		Math.toRadians(b.getLatitude())) ) / 2), 2) + Math.pow(Math.sin((Math.toRadians(a.getLongitude()) -
		Math.toRadians(b.getLongitude())) / 2), 2) * Math.toRadians(Math.cos(a.getLatitude())) *
		Math.toRadians(Math.cos(b.getLatitude()))));
	}
	
	public double getDistancia(Geo geo){
		Geo geo2 = new Geo(this.latitude, this.longitude);
		return getDistancia(geo, geo2);
	}
}
