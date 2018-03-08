
package in.zemy.com.model;

import java.util.List;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Table(value = "orders_magento")
public class OrdersInfomodel {

	@PrimaryKeyColumn(name = "entity_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	@SerializedName("entity_id")
	@Expose
	private long entityId;
	
	@SerializedName("status")
	@Expose
	@Column(value = "status")
	private String status;
	
	@SerializedName("coupon_code")
	@Expose
	@Column(value = "coupon_code")
	private String couponCode;
	
	@SerializedName("shipping_description")
	@Expose
	@Column(value = "shipping_description")
	private String shippingDescription;
	
	@SerializedName("customer_id")
	@Expose
	@Column(value = "customer_id")
	private String customerId;
	
	@SerializedName("base_discount_amount")
	@Expose
	@Column(value = "base_discount_amount")
	private double baseDiscountAmount;
	
	@SerializedName("base_grand_total")
	@Expose
	@Column(value = "base_grand_total")
	private double baseGrandTotal;

	@SerializedName("base_shipping_amount")
	@Expose
	@Column(value = "base_shipping_amount")
	private double baseShippingAmount;

	@SerializedName("base_shipping_tax_amount")
	@Expose
	@Column(value = "base_shipping_tax_amount")
	private double baseShippingTaxAmount;

	@SerializedName("base_subtotal")
	@Expose
	@Column(value = "base_subtotal")
	private double baseSubtotal;

	@SerializedName("base_tax_amount")
	@Expose
	@Column(value = "base_tax_amount")
	private double baseTaxAmount;

	@SerializedName("base_total_paid")
	@Expose
	@Column(value = "base_total_paid")
	private double baseTotalPaid;

	@SerializedName("base_total_refunded")
	@Expose
	@Column(value = "base_total_refunded")
	private String baseTotalRefunded;

	@SerializedName("discount_amount")
	@Expose
	@Column(value = "discount_amount")
	private double discountAmount;

	@SerializedName("grand_total")
	@Expose
	@Column(value = "grand_total")
	private double grandTotal;

	@SerializedName("shipping_amount")
	@Expose
	@Column(value = "shipping_amount")
	private double shippingAmount;

	@SerializedName("shipping_tax_amount")
	@Expose
	@Column(value = "shipping_tax_amount")
	private double shippingTaxAmount;

	@SerializedName("store_to_order_rate")
	@Expose
	@Column(value = "store_to_order_rate")
	private double storeToOrderRate;

	@SerializedName("subtotal")
	@Expose
	@Column(value = "subtotal")
	private double subtotal;

	@SerializedName("tax_amount")
	@Expose
	@Column(value = "tax_amount")
	private double taxAmount;

	@SerializedName("total_paid")
	@Expose
	@Column(value = "total_paid")
	private double totalPaid;

	@SerializedName("total_refunded")
	@Expose
	@Column(value = "total_refunded")
	private double totalRefunded;

	@SerializedName("base_shipping_discount_amount")
	@Expose
	@Column(value = "base_shipping_discount_amount")
	private double baseShippingDiscountAmount;

	@SerializedName("base_subtotal_incl_tax")
	@Expose
	@Column(value = "base_subtotal_incl_tax")
	private double baseSubtotalInclTax;

	@SerializedName("base_total_due")
	@Expose
	@Column(value = "base_total_due")
	private double baseTotalDue;

	@SerializedName("shipping_discount_amount")
	@Expose
	@Column(value = "shipping_discount_amount")
	private double shippingDiscountAmount;

	@SerializedName("subtotal_incl_tax")
	@Expose
	@Column(value = "subtotal_incl_tax")
	private double subtotalInclTax;

	@SerializedName("total_due")
	@Expose
	@Column(value = "total_due")
	private double totalDue;

	@SerializedName("increment_id")
	@Expose
	@Column(value = "increment_id")
	private long incrementId;

	@SerializedName("base_currency_code")
	@Expose
	@Column(value = "base_currency_code")
	private String baseCurrencyCode;

	@SerializedName("discount_description")
	@Expose
	@Column(value = "discount_description")
	private double discountDescription;

	@SerializedName("remote_ip")
	@Expose
	@Column(value = "remote_ip")
	private String remoteIp;

	@SerializedName("store_currency_code")
	@Expose
	@Column(value = "store_currency_code")
	private String storeCurrencyCode;

	@SerializedName("store_name")
	@Expose
	@Column(value = "store_name")
	private String storeName;

	@SerializedName("created_at")
	@Expose
	@Column(value = "created_at")
	private String createdAt;

	@SerializedName("shipping_incl_tax")
	@Expose
	@Column(value = "shipping_incl_tax")
	private double shippingInclTax;

	@SerializedName("payment_method")
	@Expose
	@Column(value = "payment_method")
	private String paymentMethod;

	@SerializedName("gift_message_from")
	@Expose
	@Column(value = "gift_message_from")
	private String giftMessageFrom;

	@SerializedName("gift_message_to")
	@Expose
	@Column(value = "gift_message_to")
	private String giftMessageTo;

	@SerializedName("gift_message_body")
	@Expose
	@Column(value = "gift_message_body")
	private String giftMessageBody;

	@SerializedName("tax_name")
	@Expose
	@Column(value = "tax_name")
	private String taxName;

	@SerializedName("tax_rate")
	@Expose
	@Column(value = "tax_rate")
	private String taxRate;

	@SerializedName("address")
	@Expose
	@Column(value = "address")
	private List<Address> addresses = null;

	@SerializedName("order_items")
	@Expose
	@Column(value = "order_items")
	private List<OrderItem> orderItems = null;
	
	@SerializedName("order_comments")
	@Expose
	@Column(value = "order_comments")
	private List<OrderComment> orderComments = null;

	public long getEntityId() {
		return entityId;
	}

	public void setEntityId(long entityId) {
		this.entityId = entityId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public String getShippingDescription() {
		return shippingDescription;
	}

	public void setShippingDescription(String shippingDescription) {
		this.shippingDescription = shippingDescription;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getBaseDiscountAmount() {
		return baseDiscountAmount;
	}

	public void setBaseDiscountAmount(double baseDiscountAmount) {
		this.baseDiscountAmount = baseDiscountAmount;
	}

	public double getBaseGrandTotal() {
		return baseGrandTotal;
	}

	public void setBaseGrandTotal(double baseGrandTotal) {
		this.baseGrandTotal = baseGrandTotal;
	}

	public double getBaseShippingAmount() {
		return baseShippingAmount;
	}

	public void setBaseShippingAmount(double baseShippingAmount) {
		this.baseShippingAmount = baseShippingAmount;
	}

	public double getBaseShippingTaxAmount() {
		return baseShippingTaxAmount;
	}

	public void setBaseShippingTaxAmount(double baseShippingTaxAmount) {
		this.baseShippingTaxAmount = baseShippingTaxAmount;
	}

	public double getBaseSubtotal() {
		return baseSubtotal;
	}

	public void setBaseSubtotal(double baseSubtotal) {
		this.baseSubtotal = baseSubtotal;
	}

	public double getBaseTaxAmount() {
		return baseTaxAmount;
	}

	public void setBaseTaxAmount(double baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}

	public double getBaseTotalPaid() {
		return baseTotalPaid;
	}

	public void setBaseTotalPaid(double baseTotalPaid) {
		this.baseTotalPaid = baseTotalPaid;
	}

	public String getBaseTotalRefunded() {
		return baseTotalRefunded;
	}

	public void setBaseTotalRefunded(String baseTotalRefunded) {
		this.baseTotalRefunded = baseTotalRefunded;
	}

	public double getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public double getShippingAmount() {
		return shippingAmount;
	}

	public void setShippingAmount(double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	public double getShippingTaxAmount() {
		return shippingTaxAmount;
	}

	public void setShippingTaxAmount(double shippingTaxAmount) {
		this.shippingTaxAmount = shippingTaxAmount;
	}

	public double getStoreToOrderRate() {
		return storeToOrderRate;
	}

	public void setStoreToOrderRate(double storeToOrderRate) {
		this.storeToOrderRate = storeToOrderRate;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	public double getTotalPaid() {
		return totalPaid;
	}

	public void setTotalPaid(double totalPaid) {
		this.totalPaid = totalPaid;
	}

	public double getTotalRefunded() {
		return totalRefunded;
	}

	public void setTotalRefunded(double totalRefunded) {
		this.totalRefunded = totalRefunded;
	}

	public double getBaseShippingDiscountAmount() {
		return baseShippingDiscountAmount;
	}

	public void setBaseShippingDiscountAmount(double baseShippingDiscountAmount) {
		this.baseShippingDiscountAmount = baseShippingDiscountAmount;
	}

	public double getBaseSubtotalInclTax() {
		return baseSubtotalInclTax;
	}

	public void setBaseSubtotalInclTax(double baseSubtotalInclTax) {
		this.baseSubtotalInclTax = baseSubtotalInclTax;
	}

	public double getBaseTotalDue() {
		return baseTotalDue;
	}

	public void setBaseTotalDue(double baseTotalDue) {
		this.baseTotalDue = baseTotalDue;
	}

	public double getShippingDiscountAmount() {
		return shippingDiscountAmount;
	}

	public void setShippingDiscountAmount(double shippingDiscountAmount) {
		this.shippingDiscountAmount = shippingDiscountAmount;
	}

	public double getSubtotalInclTax() {
		return subtotalInclTax;
	}

	public void setSubtotalInclTax(double subtotalInclTax) {
		this.subtotalInclTax = subtotalInclTax;
	}

	public double getTotalDue() {
		return totalDue;
	}

	public void setTotalDue(double totalDue) {
		this.totalDue = totalDue;
	}

	public long getIncrementId() {
		return incrementId;
	}

	public void setIncrementId(long incrementId) {
		this.incrementId = incrementId;
	}

	public String getBaseCurrencyCode() {
		return baseCurrencyCode;
	}

	public void setBaseCurrencyCode(String baseCurrencyCode) {
		this.baseCurrencyCode = baseCurrencyCode;
	}

	public double getDiscountDescription() {
		return discountDescription;
	}

	public void setDiscountDescription(double discountDescription) {
		this.discountDescription = discountDescription;
	}

	public String getRemoteIp() {
		return remoteIp;
	}

	public void setRemoteIp(String remoteIp) {
		this.remoteIp = remoteIp;
	}

	public String getStoreCurrencyCode() {
		return storeCurrencyCode;
	}

	public void setStoreCurrencyCode(String storeCurrencyCode) {
		this.storeCurrencyCode = storeCurrencyCode;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public double getShippingInclTax() {
		return shippingInclTax;
	}

	public void setShippingInclTax(double shippingInclTax) {
		this.shippingInclTax = shippingInclTax;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getGiftMessageFrom() {
		return giftMessageFrom;
	}

	public void setGiftMessageFrom(String giftMessageFrom) {
		this.giftMessageFrom = giftMessageFrom;
	}

	public String getGiftMessageTo() {
		return giftMessageTo;
	}

	public void setGiftMessageTo(String giftMessageTo) {
		this.giftMessageTo = giftMessageTo;
	}

	public String getGiftMessageBody() {
		return giftMessageBody;
	}

	public void setGiftMessageBody(String giftMessageBody) {
		this.giftMessageBody = giftMessageBody;
	}

	public String getTaxName() {
		return taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

	public String getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public List<OrderComment> getOrderComments() {
		return orderComments;
	}

	public void setOrderComments(List<OrderComment> orderComments) {
		this.orderComments = orderComments;
	}

}
