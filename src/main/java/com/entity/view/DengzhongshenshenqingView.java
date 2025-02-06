package com.entity.view;

import com.entity.DengzhongshenshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 等终审申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-29 18:02:25
 */
@TableName("dengzhongshenshenqing")
public class DengzhongshenshenqingView  extends DengzhongshenshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DengzhongshenshenqingView(){
	}
 
 	public DengzhongshenshenqingView(DengzhongshenshenqingEntity dengzhongshenshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, dengzhongshenshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
