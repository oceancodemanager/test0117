package test.itf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.web.context.WebApplicationContext;

import ognl.Ognl;

public class Test {
	static class User {
		int id;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		String name;
	}

	public static void testGetValueContext() throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("lijie");
		Map context = new HashMap();
		context.put("user", user);
		Object name = Ognl.getValue(Ognl.parseExpression("name"), context, user);
		System.out.println(name);
	}

	public static void testGetValue() throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("lijie");
		Object name = Ognl.getValue(Ognl.parseExpression("name"), user);
		System.out.println(name);
	}

	public static void testGetValueSharp() throws Exception {
		User user = new User();
		user.setId(1);
		user.setName("lijie");
		Map context = new HashMap();
		// context.put("user", user);
		// context.put("country", "China");
		Object country = Ognl.getValue(Ognl.parseExpression("name"), context, user);
		System.out.println(country);
	}

	public static void main(String[] args) {
		// ActionInvocation

		Set<String> s = Collections.emptySet();
		System.out.println("dd:" + CollectionUtils.isEmpty(s));
		try {
			testGetValue();
			testGetValueContext();
			testGetValueSharp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] aa = new String[2];
		aa.getClass().isArray();
		AbstratactCommonObj a = new AbstratactCommonObj() {

			@Override
			public void needImpl() {
				// TODO Auto-generated method stub

			}
		};
		int e = 2;
		String addd = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
	}
}
