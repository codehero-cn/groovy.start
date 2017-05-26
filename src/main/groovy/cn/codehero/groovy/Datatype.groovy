package cn.codehero.groovy

/**
 * 数据类型
 * @author eleven
 */

class Datatype {
	
	/** 基本数据类型:int，boolean这些Java中的基本数据类型，在Groovy代码中其实对应的是它们的包装数据类型。
	* 比如int对应为Integer，boolean对应为Boolean。*/
	def int x = 1
	
	{
		print x.getClass().getCanonicalName() 
	}
	
	/**容器类:Groovy中的容器类很简单，就三种：
	 * List：链表，其底层对应Java中的List接口，一般用ArrayList作为真正的实现类。
     * Map：键-值表，其底层对应Java中的LinkedHashMap。
     * Range：范围，它其实是List的一种拓展。
	 */
	//List定义：List变量由[]定义
	def aList = [5,'string',true] //List由[]定义，其元素可以是任何对象
	
	//变量存取：可以直接通过索引存取，而且不用担心索引越界。如果索引超过当前链表长度，List会自动
	//往该索引添加元素
	//assert aList[1] == 'string'
	//assert aList[5] == null //第6个元素为空
	//aList[100] = 100  //设置第101个元素的值为100
	//assert aList[100] == 100
	
	//Map类定义:Map变量由[:]定义，比如
	def aMap = ['key1':'value1','key2':true] 

	//Range类:Range是Groovy对List的一种拓展，变量定义和大体的使用方法如下：
	
	
	
}
