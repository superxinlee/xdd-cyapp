package com.xueduoduo.xddcyapp.enums;

public enum Discipline implements SEnum {
	Chinese("Chinese", "语文"), 
	English("English", "英语"),
	math("Math","数学"),
	Art("Art", "美术"),
	Music("Music", "音乐"),
	Nature("Nature", "自然"),
	PE("PE", "体育"),
	ZaRan("ZaRan", "扎染"),
	ZhiMaoYi("ZhiMaoYi", "织毛衣"),
	Moral("Moral", "品社"),
	LS("LS", "劳技"),
	IT("IT", "信息科技"),
	EXP("EXP", "探究"),
	Basketball("basketball", "篮球");

	private final String key;
	private final String desc;

	Discipline(final String key, final String desc) {
		this.key = key;
		this.desc = desc;
	}

	@Override
	public String key() {
		return this.key;
	}

	@Override
	public String desc() {
		return this.desc;
	}
	
	/**
	 * 获取code的描述信息
	 * 
	 * @param code
	 * @return
	 */
	public static String desc(String code) {  
        for (Discipline c : Discipline.values()) {  
            if (c.key.equals(code)) {  
                return c.desc;
            }  
        }  
        return null;  
    }  
}
