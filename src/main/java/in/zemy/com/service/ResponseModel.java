package in.zemy.com.service;

public class ResponseModel {

	public String oauth_access_token;
	public String oauth_token_secret;
	public String client_base_url;
	public String client_id;
	public String company_name;
	public String consumer_key;
	public String consumer_secret;

	public String getOauth_access_token() {
		return oauth_access_token;
	}

	public void setOauth_access_token(String oauth_access_token) {
		this.oauth_access_token = oauth_access_token;
	}

	public String getOauth_token_secret() {
		return oauth_token_secret;
	}

	public void setOauth_token_secret(String oauth_token_secret) {
		this.oauth_token_secret = oauth_token_secret;
	}

	public String getClient_base_url() {
		return client_base_url;
	}

	public void setClient_base_url(String client_base_url) {
		this.client_base_url = client_base_url;
	}

	public String getClient_id() {
		return client_id;
	}

	public void setClient_id(String client_id) {
		this.client_id = client_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getConsumer_key() {
		return consumer_key;
	}

	public void setConsumer_key(String consumer_key) {
		this.consumer_key = consumer_key;
	}

	public String getConsumer_secret() {
		return consumer_secret;
	}

	public void setConsumer_secret(String consumer_secret) {
		this.consumer_secret = consumer_secret;
	}

}