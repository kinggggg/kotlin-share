

/**
 * ��������
 */
// ����һ������
fun girth(width: Double , height: Double): Double{
	println("width: ${width}")
	println("height: ${height}")
	return 2 * (width + height)
}
fun main(args: Array<String>) {
	// ��ͳ���ú����ķ�ʽ������λ�ô������
	println(girth(3.5, 4.8))
	// ���ݲ��������������
	println(girth(width = 3.5, height = 4.8))
	// �������ִ������ʱ�ɽ���λ��
	println(girth(height = 4.8, width = 3.5))
	// ����ʹ����������������ʹ��λ�ò���
	println(girth(3.5, height = 4.8))
}