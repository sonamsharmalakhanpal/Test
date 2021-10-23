package practise;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class fileDownload {

	public static void downloadFile(URL url, String outputFileName) throws IOException {
		try (InputStream in = url.openStream();
				ReadableByteChannel rbc = Channels.newChannel(in);
				FileOutputStream fos = new FileOutputStream(outputFileName)) {
			fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
		}
	}
	
	public static void downloadUsingStream(String urlStr, String file) throws IOException{
        URL url = new URL(urlStr);
        BufferedInputStream bis = new BufferedInputStream(url.openStream());
        FileOutputStream fis = new FileOutputStream(file);
        byte[] buffer = new byte[1024];
        int count=0;
        while((count = bis.read(buffer,0,1024)) != -1)
        {
            fis.write(buffer, 0, count);
        }
        fis.close();
        bis.close();
    }

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("calling apk download method");
		//https://install.appcenter.ms/orgs/PointsBet-AU/apps/AU-Droid-UAT
		
		downloadUsingStream("https://appcenter-filemanagement-distrib2ede6f06e.azureedge.net/8e5f81b4-922e-4611-8f39-376fe906a9e6/PointsBet.au-sportsbook.au.uat.2.19.0.96210.apk?sv=2019-02-02&sr=c&sig=%2BBpwUfUdE4z27UYGfb11Xs12vjETttoUZFG8q%2FV%2FKMU%3D&se=2021-08-06T04%3A57%3A42Z&sp=r&download_origin=appcenter", "/Users/sonamlakhanpal/Downloads/sportsBookAuto.apk");
		
		System.out.println("Download done");
	}

}
