package li.barlog.kvj.singleton;

class JavaSingleton {
	static JavaSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	static class SingletonHolder {
		static final JavaSingleton INSTANCE = new JavaSingleton();
	}
}
