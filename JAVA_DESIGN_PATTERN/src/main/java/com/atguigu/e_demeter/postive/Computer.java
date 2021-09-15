package com.atguigu.e_demeter.postive;

// ����
class Computer {
	private void saveCrruentTask() {
		System.out.println("���浱ǰ�������е�����");
	}
	
	private void logout() {
		System.out.println("ע���û�");
	}
	
	private void shutdownScreen() {
		System.out.println("�ر���Ļ");
	}
	
	private void shutdownPower() {
		System.out.println("�رյ�Դ");
	}
	
	public void shutdown() {
		saveCrruentTask();
		logout();
		shutdownScreen();
		shutdownPower();
	}
}
