package test.maven.base.java;

public class EnumTest {

	public static void main(String[] args) {
		
		for(ProductTag tag : ProductTag.values()){
			System.out.println(tag.code+"****"+tag.name);
		}
		
	}
	
	public static enum ProductTag {
		//code代表优先级，name代表标签名
		TAG_SELFSUPPORT("selfSupport", "自营"), 
		TAG_SCORE("scoreTag", "积分"), 
		TAG_COMMENT("goodCommentTag", "好评如潮"), 
		TAG_SECKILL("msTag", "秒杀"), 
		TAG_MJ("mjTag", "满减"), 
		TAG_COUPON("couponTag", "领券"),
		TAG_NEW("newTag", "新品"),
		TAG_SHOP("sellerTag", "default");//商家自定义标签需替换值

		private String code;
		private String name;

		private ProductTag(String code, String name) {
			this.code = code;
			this.name = name;
		}

		public String getValue() {
			return String.valueOf(getCode());
		}



		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public static ProductTag of(String code) {
			if (code != null) {
				for (ProductTag type : values()) {
					if (code.equals(type.code)) {
						return type;
					}
				}
			}
			return null;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
	}

	
}
