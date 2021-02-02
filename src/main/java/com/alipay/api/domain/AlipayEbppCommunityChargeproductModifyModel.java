package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区申请维护时间
 *
 * @author auto create
 * @since 1.0, 2020-12-24 10:40:43
 */
public class AlipayEbppCommunityChargeproductModifyModel extends AlipayObject {

	private static final long serialVersionUID = 2839662136366488489L;

	/**
	 * 小区编码
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	/**
	 * 维护结束时间
	 */
	@ApiField("maintaining_end")
	private Date maintainingEnd;

	/**
	 * 维护开始时间
	 */
	@ApiField("maintaining_start")
	private Date maintainingStart;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

	public Date getMaintainingEnd() {
		return this.maintainingEnd;
	}
	public void setMaintainingEnd(Date maintainingEnd) {
		this.maintainingEnd = maintainingEnd;
	}

	public Date getMaintainingStart() {
		return this.maintainingStart;
	}
	public void setMaintainingStart(Date maintainingStart) {
		this.maintainingStart = maintainingStart;
	}

}