

/**
 * ��������
 */
// ���涨����3��test()���������������β��б�ͬ
// ϵͳ�����������ǣ��ⱻ��Ϊ��������
fun test() {
	println("�޲�����test()����")
}
// �ú�������Ϊ(String): Unit
fun test(msg:String) {
	println("���ص�test()����${msg}")
}
// �ú�������Ϊ(Int): String
fun test(msg: Int): String {
	println("���ص�test()����${msg},������ֵ")
	return "test"
}