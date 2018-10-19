package com.chaosalt.eCommerce.common.base.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * base list query
 * 
 * @author jiang
 * 
 */
@Data
public class BaseListQuery implements Serializable {

	private static final long serialVersionUID = 7669938525880399540L;

	private Integer pageSize = 10;

	private Integer pageNum = 1;

	private String orderBy;
}
