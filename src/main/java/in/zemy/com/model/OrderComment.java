
package in.zemy.com.model;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.UserDefinedType;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@UserDefinedType(value = "magento_order_comments")
public class OrderComment {
//Hello 
	@SerializedName("is_customer_notified")
	@Expose
	@Column(value = "is_customer_notified")
	private String isCustomerNotified;
	@SerializedName("is_visible_on_front")
	@Expose
	@Column(value = "is_visible_on_front")
	private String isVisibleOnFront;
	@SerializedName("comment")
	@Expose
	@Column(value = "comment")
	private String comment;
	@SerializedName("status")
	@Expose
	@Column(value = "status")
	private String status;
	@SerializedName("created_at")
	@Expose
	@Column(value = "created_at")
	private String createdAt;

	public String getIsCustomerNotified() {
		return isCustomerNotified;
	}

	public void setIsCustomerNotified(String isCustomerNotified) {
		this.isCustomerNotified = isCustomerNotified;
	}

	public String getIsVisibleOnFront() {
		return isVisibleOnFront;
	}

	public void setIsVisibleOnFront(String isVisibleOnFront) {
		this.isVisibleOnFront = isVisibleOnFront;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

}
