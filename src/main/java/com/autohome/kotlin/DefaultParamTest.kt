

/**
 * �β�Ĭ��ֵ
 */
// Ϊ��������ָ��Ĭ��ֵ
fun sayHi(name: String = "����",
	message: String = "����"){
	println("${name} , ����")
	println("��Ϣ�ǣ�${message}")
}
fun main(args: Array<String>) {
	// ȫ��ʹ��Ĭ�ϲ���
	sayHi()
	// ֻ��message����ʹ��Ĭ��ֵ
	sayHi("����")
	// ������������ʹ��Ĭ��ֵ
	sayHi("����", "�ؼ�")
	// ֻ��name����ʹ��Ĭ��ֵ
	sayHi(message = "��ӭѧϰKotlin")

}
