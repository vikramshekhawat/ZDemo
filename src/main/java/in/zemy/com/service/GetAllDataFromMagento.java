package in.zemy.com.service;

import java.util.List;

import in.zemy.com.model.OrdersInfomodel;

public interface GetAllDataFromMagento {

	public List<OrdersInfomodel> getOrdersinformation(ResponseModel resp);

//	public List<OrdersModel> getOrdersItemsInformation(ResponseModel resp);

}
