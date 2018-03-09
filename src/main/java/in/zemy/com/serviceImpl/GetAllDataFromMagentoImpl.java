package in.zemy.com.serviceImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.oauth.OAuth10aServiceImpl;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import in.zemy.com.model.OrdersInfomodel;
import in.zemy.com.service.GetAllDataFromMagento;
import in.zemy.com.service.MagentoProjectOAuth;
import in.zemy.com.service.ResponseModel;

public class GetAllDataFromMagentoImpl implements GetAllDataFromMagento {

	public List<OrdersInfomodel> getOrdersinformation(ResponseModel responseModel) {

		OAuth10aServiceImpl service = (OAuth10aServiceImpl) new ServiceBuilder().provider(MagentoProjectOAuth.class)
				.apiKey(responseModel.getConsumer_key()).apiSecret(responseModel.getConsumer_secret()).debug().build();

		OAuthRequest req = new OAuthRequest(Verb.GET, responseModel.getClient_base_url() + "api/rest" + "/orders?order=created_at&dir=DESC");
		//OAuthRequest req = new OAuthRequest(Verb.GET, responseModel.getClient_base_url() + "api/rest" + "/orders?limit=2");
		Token token = new Token(responseModel.getOauth_access_token(), responseModel.getOauth_token_secret());
		service.signRequest(token, req);

		Response respo = req.send();

		String responseData = respo.getBody();
		System.out.println(respo.getCode());
		System.out.println(responseData);

		HashMap<Integer, OrdersInfomodel> maps = new Gson().fromJson(responseData,
				new TypeToken<HashMap<Integer, OrdersInfomodel>>() {
					private static final long serialVersionUID = -7866653878632334594L;
				}.getType());

		List<OrdersInfomodel> list = new ArrayList<OrdersInfomodel>();

		for(Map.Entry<Integer, OrdersInfomodel> a:maps.entrySet()){
			list.add(a.getValue());
		}
		
/*		Iterator<Integer> it = maps.keySet().iterator();

		while (it.hasNext()) {
			long entityId = maps.get(it.next()).getEntityId();
			list.add(maps.get(entityId));
			list.add(maps.get(entityId));
		}*/
		
		return list;
	}

	public List<Map<String, Object>> getOrdersItemsInformation(ResponseModel list) {
		// TODO Auto-generated method stub
		return null;
	}
}
