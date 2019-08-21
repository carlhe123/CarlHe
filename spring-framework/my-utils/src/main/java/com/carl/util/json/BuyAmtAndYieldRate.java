package com.carl.util.json;

import java.io.Serializable;
import java.math.BigDecimal;

public class BuyAmtAndYieldRate implements Serializable{
	private BigDecimal minAmt;
	private BigDecimal maxAmt;
	private BigDecimal rate;

	/**
	 * @occurs required
	 * @return 投资金额下限
     */
	public BigDecimal getMinAmt() {
		return minAmt;
	}

	public void setMinAmt(BigDecimal minAmt) {
		this.minAmt = minAmt;
	}

	/**
	 * @occurs required
	 * @return 投资金额上限
	 */
	public BigDecimal getMaxAmt() {
		return maxAmt;
	}

	public void setMaxAmt(BigDecimal maxAmt) {
		this.maxAmt = maxAmt;
	}

	/**
	 * @occurs required
	 * @return 年化收益率
	 */
	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
}
