package com.mykj.andr.model;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @ClassName: VipXmlData
 * @Description: VIP�ڵ�����
 * @author  
 * @date 2013-6-24 ����04:31:10
 *
 */
public class VipXmlData {
    
	/**VIP����***/
	public String T;
	/**�ɳ�ֵ����***/
	public String GA;
	/**�ɳ�ֵ����***/
	public String GR;
	/**��������***/
	public String OT;
	
	public List<Vip_I_Data> is=new ArrayList<Vip_I_Data>();
	
	public void addVIP_I_Data(Vip_I_Data idata){
		is.add(idata);
	}
	
	public VipXmlData(){
		
	}
	public VipXmlData(String t,String ga,String gr,String ot){
		this.T=t;
		this.GA=ga;
		this.GR=gr;
		this.OT=ot;
	}
  
}
