
package in.zemy.com.model;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@UserDefinedType(value = "magento_order_items")
public class OrderItem {

	@SerializedName("item_id")
	@Expose
	@Column(value = "item_id")
	private String itemId;
	@SerializedName("parent_item_id")
	@Expose
	@Column(value = "parent_item_id")
	private Object parentItemId;
	@SerializedName("sku")
	@Expose
	@Column(value = "sku")
	private String sku;
	@SerializedName("name")
	@Expose
	@Column(value = "name")
	private String name;
	@SerializedName("qty_canceled")
	@Expose
	@Column(value = "qty_canceled")
	private String qtyCanceled;
	@SerializedName("qty_invoiced")
	@Expose
	@Column(value = "qty_invoiced")
	private String qtyInvoiced;
	@SerializedName("qty_ordered")
	@Expose
	@Column(value = "qty_ordered")
	private String qtyOrdered;
	@SerializedName("qty_refunded")
	@Expose
	@Column(value = "qty_refunded")
	private String qtyRefunded;
	@SerializedName("qty_shipped")
	@Expose
	@Column(value = "qty_shipped")
	private String qtyShipped;
	@SerializedName("price")
	@Expose
	@Column(value = "price")
	private String price;
	@SerializedName("base_price")
	@Expose
	@Column(value = "base_price")
	private String basePrice;
	@SerializedName("original_price")
	@Expose
	@Column(value = "original_price")
	private String originalPrice;
	@SerializedName("base_original_price")
	@Expose
	@Column(value = "base_original_price")
	private String baseOriginalPrice;
	@SerializedName("tax_percent")
	@Expose
	@Column(value = "tax_percent")
	private String taxPercent;
	@SerializedName("tax_amount")
	@Expose
	@Column(value = "tax_amount")
	private String taxAmount;
	@SerializedName("base_tax_amount")
	@Expose
	@Column(value = "base_tax_amount")
	private String baseTaxAmount;
	@SerializedName("discount_amount")
	@Expose
	@Column(value = "discount_amount")
	private String discountAmount;
	@SerializedName("base_discount_amount")
	@Expose
	@Column(value = "base_discount_amount")
	private String baseDiscountAmount;
	@SerializedName("row_total")
	@Expose
	@Column(value = "row_total")
	private String rowTotal;
	@SerializedName("base_row_total")
	@Expose
	@Column(value = "base_row_total")
	private String baseRowTotal;
	@SerializedName("price_incl_tax")
	@Expose
	@Column(value = "price_incl_tax")
	private String priceInclTax;
	@SerializedName("base_price_incl_tax")
	@Expose
	@Column(value = "base_price_incl_tax")
	private String basePriceInclTax;
	@SerializedName("row_total_incl_tax")
	@Expose
	@Column(value = "row_total_incl_tax")
	private String rowTotalInclTax;
	@SerializedName("base_row_total_incl_tax")
	@Expose
	@Column(value = "base_row_total_incl_tax")
	private String baseRowTotalInclTax;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Object getParentItemId() {
		return parentItemId;
	}

	public void setParentItemId(Object parentItemId) {
		this.parentItemId = parentItemId;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQtyCanceled() {
		return qtyCanceled;
	}

	public void setQtyCanceled(String qtyCanceled) {
		this.qtyCanceled = qtyCanceled;
	}

	public String getQtyInvoiced() {
		return qtyInvoiced;
	}

	public void setQtyInvoiced(String qtyInvoiced) {
		this.qtyInvoiced = qtyInvoiced;
	}

	public String getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(String qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}

	public String getQtyRefunded() {
		return qtyRefunded;
	}

	public void setQtyRefunded(String qtyRefunded) {
		this.qtyRefunded = qtyRefunded;
	}

	public String getQtyShipped() {
		return qtyShipped;
	}

	public void setQtyShipped(String qtyShipped) {
		this.qtyShipped = qtyShipped;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(String basePrice) {
		this.basePrice = basePrice;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getBaseOriginalPrice() {
		return baseOriginalPrice;
	}

	public void setBaseOriginalPrice(String baseOriginalPrice) {
		this.baseOriginalPrice = baseOriginalPrice;
	}

	public String getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(String taxPercent) {
		this.taxPercent = taxPercent;
	}

	public String getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(String taxAmount) {
		this.taxAmount = taxAmount;
	}

	public String getBaseTaxAmount() {
		return baseTaxAmount;
	}

	public void setBaseTaxAmount(String baseTaxAmount) {
		this.baseTaxAmount = baseTaxAmount;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getBaseDiscountAmount() {
		return baseDiscountAmount;
	}

	public void setBaseDiscountAmount(String baseDiscountAmount) {
		this.baseDiscountAmount = baseDiscountAmount;
	}

	public String getRowTotal() {
		return rowTotal;
	}

	public void setRowTotal(String rowTotal) {
		this.rowTotal = rowTotal;
	}

	public String getBaseRowTotal() {
		return baseRowTotal;
	}

	public void setBaseRowTotal(String baseRowTotal) {
		this.baseRowTotal = baseRowTotal;
	}

	public String getPriceInclTax() {
		return priceInclTax;
	}

	public void setPriceInclTax(String priceInclTax) {
		this.priceInclTax = priceInclTax;
	}

	public String getBasePriceInclTax() {
		return basePriceInclTax;
	}

	public void setBasePriceInclTax(String basePriceInclTax) {
		this.basePriceInclTax = basePriceInclTax;
	}

	public String getRowTotalInclTax() {
		return rowTotalInclTax;
	}

	public void setRowTotalInclTax(String rowTotalInclTax) {
		this.rowTotalInclTax = rowTotalInclTax;
	}

	public String getBaseRowTotalInclTax() {
		return baseRowTotalInclTax;
	}

	public void setBaseRowTotalInclTax(String baseRowTotalInclTax) {
		this.baseRowTotalInclTax = baseRowTotalInclTax;
	}

}
