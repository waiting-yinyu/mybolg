package com.alvin.springbootvue.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
*
*
*@author: 尹宇
*@mail yinyu@zving.com
*@date:2019年1月4日
*/

@Data
@NoArgsConstructor
public class User {
	private int id;
	private String userName;
	private String userAge;
	private String userAddress;
}
