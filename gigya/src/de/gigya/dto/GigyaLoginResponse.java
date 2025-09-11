/**
 *
 */
package de.gigya.dto;

/**
 * @author shrutiagarwal01
 *
 */
public class GigyaLoginResponse
{

	private boolean success;
	private String uid;
	private String nickName;
	private String errorMessage;

	/**
	 * @return the success
	 */
	public boolean isSuccess()
	{
		return success;
	}

	/**
	 * @param success
	 *           the success to set
	 */
	public void setSuccess(final boolean success)
	{
		this.success = success;
	}

	/**
	 * @return the uid
	 */
	public String getUid()
	{
		return uid;
	}

	/**
	 * @param uid
	 *           the uid to set
	 */
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	/**
	 * @return the nickName
	 */
	public String getNickName()
	{
		return nickName;
	}

	/**
	 * @param nickName
	 *           the nickName to set
	 */
	public void setNickName(final String nickName)
	{
		this.nickName = nickName;
	}

	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage()
	{
		return errorMessage;
	}

	/**
	 * @param errorMessage
	 *           the errorMessage to set
	 */
	public void setErrorMessage(final String errorMessage)
	{
		this.errorMessage = errorMessage;
	}



}
