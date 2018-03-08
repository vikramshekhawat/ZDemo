package in.zemy.com.daoImpl;

import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.cassandra.core.CassandraTemplate;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ConsistencyLevel;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.querybuilder.Insert;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.google.gson.Gson;

import in.zemy.com.dao.CassandraDao;
import in.zemy.com.model.CassandraCredentials;
import in.zemy.com.model.OrdersInfomodel;

public class CassandraCRUDImpl implements CassandraDao {

	private Cluster cluster;

	private Session session;

	private CassandraCredentials cassandraCredentials;

	private List<InetSocketAddress> address;

	private CassandraTemplate cassandraOperations;

	private void getConection() {

		if (session != null) {

		} else {

			address = new ArrayList<InetSocketAddress>();
			address.add(new InetSocketAddress(cassandraCredentials.getContactpoint(),
					Integer.parseInt(cassandraCredentials.getPort()))); // cluster
				//hello														// //

			try {
				cluster = Cluster.builder().addContactPointsWithPorts(address).build();
				/*
				 * cluster =
				 * Cluster.builder().addContactPointsWithPorts(address).
				 * withCredentials("root", "Dig$dev%") .build();
				 */
				session = cluster.connect(cassandraCredentials.getDb());
				cassandraOperations = new CassandraTemplate(session);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	public CassandraCRUDImpl() {

	}

	public CassandraCRUDImpl(CassandraCredentials cassandraCredentials) {
		this.cassandraCredentials = cassandraCredentials;
	}

	public void closeSessionAndCluster() {
		session.close();
		session = null;
		cluster.close();
		cluster = null;
	}

	public void writeDataToMagentoOrdersCassandra(List<OrdersInfomodel> dataMagento) {
		getConection();
		/*
		 * MappingManager manager = new MappingManager(session);
		 * Mapper<OrdersInfomodel> mapper =
		 * manager.mapper(OrdersInfomodel.class);
		 * mapper.save(dataMagento.get(0));
		 */
		Insert insert = QueryBuilder.insertInto("orders_magento");
		
		Gson gson = new Gson();
		String addressJson = gson.toJson(dataMagento.get(0).getAddresses());
		String commentsJson = gson.toJson(dataMagento.get(0).getOrderComments());
		String itemJson = gson.toJson(dataMagento.get(0).getOrderItems());
		
		insert.setConsistencyLevel(ConsistencyLevel.ONE);
		insert.value("entity_id", dataMagento.get(0).getEntityId());
		insert.value("status", dataMagento.get(0).getStatus());
		insert.value("coupon_code", dataMagento.get(0).getCouponCode());
		insert.value("shipping_description", dataMagento.get(0).getShippingDescription());
		insert.value("customer_id", dataMagento.get(0).getCustomerId());
		insert.value("base_discount_amount", dataMagento.get(0).getBaseDiscountAmount());
		insert.value("base_grand_total", dataMagento.get(0).getBaseGrandTotal());
		insert.value("base_shipping_amount", dataMagento.get(0).getBaseShippingAmount());
		insert.value("base_shipping_tax_amount", dataMagento.get(0).getBaseShippingTaxAmount());
		insert.value("base_subtotal", dataMagento.get(0).getBaseSubtotal());
		insert.value("base_tax_amount", dataMagento.get(0).getBaseTaxAmount());
		insert.value("base_total_paid", dataMagento.get(0).getBaseTotalPaid());
		insert.value("base_total_refunded", dataMagento.get(0).getBaseTotalRefunded());
		insert.value("discount_amount", dataMagento.get(0).getDiscountAmount());
		insert.value("grand_total", dataMagento.get(0).getGrandTotal());
		insert.value("shipping_amount", dataMagento.get(0).getShippingAmount());
		insert.value("shipping_tax_amount", dataMagento.get(0).getShippingTaxAmount());
		insert.value("store_to_order_rate", dataMagento.get(0).getStoreToOrderRate());
		insert.value("subtotal", dataMagento.get(0).getSubtotal());
		insert.value("tax_amount", dataMagento.get(0).getTaxAmount());
		insert.value("total_paid", dataMagento.get(0).getTotalPaid());
		insert.value("total_refunded", dataMagento.get(0).getTotalRefunded());
		insert.value("base_shipping_discount_amount", dataMagento.get(0).getBaseShippingDiscountAmount());
		insert.value("base_subtotal_incl_tax", dataMagento.get(0).getBaseSubtotalInclTax());
		insert.value("base_total_due", dataMagento.get(0).getBaseTotalDue());
		insert.value("shipping_discount_amount", dataMagento.get(0).getShippingDiscountAmount());
		insert.value("subtotal_incl_tax", dataMagento.get(0).getSubtotalInclTax());
		insert.value("total_due", dataMagento.get(0).getTotalDue());
		insert.value("increment_id", dataMagento.get(0).getIncrementId());
		insert.value("base_currency_code", dataMagento.get(0).getBaseCurrencyCode());
		insert.value("discount_description", dataMagento.get(0).getDiscountDescription());
		insert.value("remote_ip", dataMagento.get(0).getRemoteIp());
		insert.value("store_currency_code", dataMagento.get(0).getStoreCurrencyCode());
		insert.value("store_name", dataMagento.get(0).getStoreName());
		insert.value("created_at", dataMagento.get(0).getCreatedAt());
		insert.value("shipping_incl_tax", dataMagento.get(0).getShippingInclTax());
		insert.value("payment_method", dataMagento.get(0).getPaymentMethod());
		insert.value("gift_message_from", dataMagento.get(0).getGiftMessageFrom());
		insert.value("gift_message_to", dataMagento.get(0).getGiftMessageTo());
		insert.value("gift_message_body", dataMagento.get(0).getGiftMessageBody());
		insert.value("tax_name", dataMagento.get(0).getTaxName());
		insert.value("tax_rate", dataMagento.get(0).getTaxRate());
		insert.value("address", addressJson);
		insert.value("order_items", commentsJson);
		insert.value("order_comments",itemJson);
		cassandraOperations.execute(insert);
		// cassandraOperations.insert(dataMagento.get(0));
		System.out.println("ajay");
	}

}
