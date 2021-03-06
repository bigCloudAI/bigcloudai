package cn.com.andiOs.entry.rbac;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * Model class of 角色表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
@Component
@Entity
public class Role implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id. */
	@Id
	@GeneratedValue
	private Integer id;

	/** name. */
	@Column(name="name",columnDefinition = "varchar(50) DEFAULT '' NOT NULL COMMENT 'name : 角色名称'", nullable=false, unique = false)
	private String name;

	/** status. */
	@Column(name="status",columnDefinition = "int(1) DEFAULT 1 NOT NULL COMMENT 'status : ''状态 1：有效 0：无效'", nullable=false, unique = false)
	private Byte status;

	/** updated_time. */
	@Column(name="updatedTime",columnDefinition = "timestamp DEFAULT '0000-00-00 00:00:0' NOT NULL COMMENT 'updated_time : 最后一次更新时间'", nullable=false, unique = false)
	private Date updatedTime;

	/** created_time. */
	@Column(name="createdTime",columnDefinition = "timestamp DEFAULT '0000-00-00 00:00:00' NOT NULL COMMENT 'created_time : 插入时间'", nullable=false, unique = false)
	private Date createdTime;

	/**
	 * Constructor.
	 */
	public Role() {
	}

	/**
	 * Set the id.
	 * 
	 * @param id
	 *            id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Get the id.
	 * 
	 * @return id
	 */
	public Integer getId() {
		return this.id;
	}

	/**
	 * Set the name.
	 * 
	 * @param name
	 *            name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the name.
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set the status.
	 * 
	 * @param status
	 *            status
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * Get the status.
	 * 
	 * @return status
	 */
	public Byte getStatus() {
		return this.status;
	}

	/**
	 * Set the updated_time.
	 * 
	 * @param updatedTime
	 *            updated_time
	 */
	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	/**
	 * Get the updated_time.
	 * 
	 * @return updated_time
	 */
	public Date getUpdatedTime() {
		return this.updatedTime;
	}

	/**
	 * Set the created_time.
	 * 
	 * @param createdTime
	 *            created_time
	 */
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	/**
	 * Get the created_time.
	 * 
	 * @return created_time
	 */
	public Date getCreatedTime() {
		return this.createdTime;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
