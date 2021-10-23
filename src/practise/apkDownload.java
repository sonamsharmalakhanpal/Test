package practise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class apkDownload {
	static HttpURLConnection http = null;
	static URL url = null;

	public static void main(String[] args) {
		
		try {
			url = new URL("https://install.appcenter.ms/api/v0.1/apps/PointsBet-AU/AU-Droid-UAT/releases/214");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			http = (HttpURLConnection)url.openConnection();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		http.setRequestProperty("Accept", "*/*");
		http.setRequestProperty("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6ImJlMTliZjZjLWMyMWYtNDgwOC05MzBiLWYxYzhmZmFmYzAyOSIsIm9yaWdpbiI6ImFwcGNlbnRlciIsImlhdCI6MTYyODQ5NzEzNCwiZXhwIjoxNjI4NTAwNzM0LCJhdWQiOiJCaWZyb3N0IiwiaXNzIjoiSGVpbWRhbGwiLCJzdWIiOiJ1c2VyIn0.LwmxQNqxW82oSZ7xzMkPdunkPzZ90mR8BJck5UEmpLot-5rSVenHcIrutGQIPtl50ztXz_6uV71V8rL1fbT5PZ991T48Rbtm8_JEdOn61Wa77Kr8Q78qmZC4O7fQBBTA-tnWDDvTtdMMhI-qJivp8AiWjEGko25CgqfkrQ4XIhxgvzg0TteuRXAAGOgf0VGWdjbXXyPuwivUxF3atXV8qcMRK5rhmL6tAwTW1TfRV7XdREM6W8g3dULVBHwSNseICqQyOg9_AqNLZS0gEn86ijnNLbRE6sIt3Os4qPf1Qr-Sxxn535RRF3hDaxTV4j0mPncKgsKp1bHSfBzxivhBkQ");

		try {
			System.out.println(http.getResponseCode() + " " + http.getResponseMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		http.disconnect();

	}

}
