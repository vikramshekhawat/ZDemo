package in.zemy.com.service;

import org.scribe.builder.api.DefaultApi10a;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.model.Token;

public final class MagentoProjectOAuth extends DefaultApi10a {
	private static String BASE_URL = "https://www.thomaslyte.com/";

	public static String getBASE_URL() {
		return BASE_URL;
	}

	public static void setBASE_URL(String bASE_URL) {
		BASE_URL = bASE_URL;
	}

	@Override
	public String getRequestTokenEndpoint() {
		return BASE_URL + "oauth/initiate";
	}

	@Override
	public String getAccessTokenEndpoint() {
		return BASE_URL + "oauth/token";
	}

	@Override
	public String getAuthorizationUrl(Token requestToken) {
		return BASE_URL + "admin-a46f6abf8bc242f/oauth_authorize?oauth_token=" + requestToken.getToken();
	}

	@Override
	public AccessTokenExtractor getAccessTokenExtractor() {
		return super.getAccessTokenExtractor();
	}

}