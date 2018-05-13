package cn.com.andiOs.OsUi.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * Model class of 用户表.
 * 
 * @author generated by ERMaster
 * @version $Id$
 */
public class User implements Serializable {

	/** serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** id. */
	private Integer id;

	private String name;
	
	private String pwd;

	private String email;

	/** qq. */
	private String qq;

	/** wechat. */
	private String wechat;

	/** phone. */
	private String phone;

	/** is_admin. */
	private Byte isAdmin;

	/** status. */
	private Byte status;

	/**
	 * Constructor.
	 */
	public User() {
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
	 * Set the email.
	 * 
	 * @param email
	 *            email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Get the email.
	 * 
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Set the qq.
	 * 
	 * @param qq
	 *            qq
	 */
	public void setQq(String qq) {
		this.qq = qq;
	}

	/**
	 * Get the qq.
	 * 
	 * @return qq
	 */
	public String getQq() {
		return this.qq;
	}

	/**
	 * Set the wechat.
	 * 
	 * @param wechat
	 *            wechat
	 */
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}

	/**
	 * Get the wechat.
	 * 
	 * @return wechat
	 */
	public String getWechat() {
		return this.wechat;
	}

	/**
	 * Set the phone.
	 * 
	 * @param phone
	 *            phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Get the phone.
	 * 
	 * @return phone
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Set the is_admin.
	 * 
	 * @param isAdmin
	 *            is_admin
	 */
	public void setIsAdmin(Byte isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 * Get the is_admin.
	 * 
	 * @return is_admin
	 */
	public Byte getIsAdmin() {
		return this.isAdmin;
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
	 * {@inheritDoc}
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	
	

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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
		User other = (User) obj;
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
