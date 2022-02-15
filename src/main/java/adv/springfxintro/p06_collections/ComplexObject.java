package adv.springfxintro.p06_collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ComplexObject {

	private List       someList;
	private Set        someSet;
	private Map        someMap;
	private Properties someProperties;

	public void setSomeList(List someList) {
		this.someList = someList;
	}

	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}

	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}

	public void setSomeProperties(Properties someProperties) {
		this.someProperties = someProperties;
	}

	public void print() {
		System.out.println("someList       : " + someList);
		System.out.println("someSet        : " + someSet);
		System.out.println("someMap        : " + someMap);
		System.out.println("someProperties : " + someProperties);
	}

}
