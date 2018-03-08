package in.zemy.com.dao;

import java.util.List;

import in.zemy.com.model.OrdersInfomodel;

public interface CassandraDao {

	public void writeDataToMagentoOrdersCassandra(List<OrdersInfomodel> dataMagento);

}
