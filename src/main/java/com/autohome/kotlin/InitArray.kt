/**
 * ����
 */
fun main(args: Array<String>) {
	// ��������ָ��Ԫ�ص����飨�൱��Java����ľ�̬��ʼ����
	var arr1 = arrayOf("Java", "Kotlin", "Swift", "Go")
	//Ĭ������������е�Ԫ������ΪInteger��װ��
	var intArr1 = arrayOf(2, 4, 500, -34)
	//kotlin�ṩ�����ڻ������͵�intArrayOf�������൱��Java�е�int[], long[]
	var intArr11 = intArrayOf(1, 3, 4)
	// ����ָ�����ȡ�Ԫ��Ϊnull�����飨�൱��Java����Ķ�̬��ʼ����
	var arr2 = arrayOfNulls<Double>(5)
	var intArr2 = arrayOfNulls<Int>(6)
	// ��������Ϊ0�Ŀ�����
	var arr3 = emptyArray<String>()
	var intArr3 = emptyArray<Int>()
	// ����ָ�����ȡ�ʹ��Lambda���ʽ��ʼ������Ԫ�ص����飬it��ѭ��������0��ʼ
	var arr4 = Array(5, {(it * 2 + 97).toChar()})
	var strArr4 = Array(6, {"fkit"})
}