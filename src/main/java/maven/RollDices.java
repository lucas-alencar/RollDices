package maven;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RollDices {
	
	private Response response;
	private final OkHttpClient client = new OkHttpClient();
	
	public RollDices(){
		this.response = null;
	}
	
	private boolean request() throws IOException {
	    Request request = new Request.Builder()
				.url("https://roll-dice1.p.rapidapi.com/rollDice")
				.get()
				.addHeader("X-RapidAPI-Key", "3517a6f0afmshdf368e62e182f28p1803f1jsnb7b1349ebe06")
				.addHeader("X-RapidAPI-Host", "roll-dice1.p.rapidapi.com")
				.build();
	    
	    try (Response response = client.newCall(request).execute()) {
	      if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
			this.response = this.client.newCall(request).execute();
			return true;
	    }catch(IOException e) {
	    	System.out.println(e.getStackTrace());
	    }
		
		this.response = null;
		return false;
	}
	
	public void roll() throws Exception {
		if(this.request()) {
			System.out.println(this.response.body().string());
		}
		else {
			throw new Exception("Request failed");
		}
	}

}
